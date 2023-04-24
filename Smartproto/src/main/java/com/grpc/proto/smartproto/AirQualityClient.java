package com.grpc.proto.smartproto;

import io.grpc.ManagedChannel;

import java.util.InputMismatchException;
import java.util.Scanner;
import io.grpc.ManagedChannelBuilder;

public class AirQualityClient {
	private float latitude;
    private float longitude;
    private AirQualityServiceGrpc.AirQualityServiceBlockingStub airQualityStub;
    public static void main(String[] args) {
    	double pm25Threshold = 35.0;
        double pm10Threshold = 50.0;
        double ozoneThreshold = 0.070;
        
    	// Channels for each server
        ManagedChannel airQualityChannel = ManagedChannelBuilder.forAddress("localhost", 50081)
                .usePlaintext()
                .build();
        ManagedChannel airQualityHistoryChannel = ManagedChannelBuilder.forAddress("localhost", 50083)
                .usePlaintext()
                .build();
        ManagedChannel personalizedAlertsChannel = ManagedChannelBuilder.forAddress("localhost", 50084)
                .usePlaintext()
                .build();

        // Stubs for each server
        AirQualityServiceGrpc.AirQualityServiceBlockingStub airQualityStub = AirQualityServiceGrpc.newBlockingStub(airQualityChannel);
        AirQualityHistoryServiceGrpc.AirQualityHistoryServiceBlockingStub airQualityHistoryStub = AirQualityHistoryServiceGrpc.newBlockingStub(airQualityHistoryChannel);
        PersonalizedAlertsServiceGrpc.PersonalizedAlertsServiceBlockingStub personalizedAlertsStub = PersonalizedAlertsServiceGrpc.newBlockingStub(personalizedAlertsChannel);

     // Get user's location
        Scanner scanner = new Scanner(System.in);
        float latitude = 0;
        float longitude = 0;

        System.out.println("Please enter your latitude: ");
        while (true) {
            try {
                latitude = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a valid latitude:");
                scanner.next();
            }
        }

        System.out.println("Please enter your longitude: ");
        while (true) {
            try {
                longitude = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a valid longitude:");
                scanner.next();
            }
        }
        
        // Interact with the AirQualityServer
        PMRequest pmRequest = PMRequest.newBuilder().build();
        PMResponse pm25Response = airQualityStub.getPM25(pmRequest);
        System.out.println("PM2.5: " + pm25Response.getValue());

        PMResponse pm10Response = airQualityStub.getPM10(pmRequest);
        System.out.println("PM10: " + pm10Response.getValue());

        OzoneRequest ozoneRequest = OzoneRequest.newBuilder().build();
        OzoneResponse ozoneResponse = airQualityStub.getOzone(ozoneRequest);
        System.out.println("Ozone: " + ozoneResponse.getValue());

        SummaryRequest summaryRequest = SummaryRequest.newBuilder().build();
        SummaryResponse summaryResponse = airQualityStub.getAirQualitySummary(summaryRequest);
        summaryResponse.getSummaryList().forEach(summary -> System.out.println("Air Quality Summary: " + summary));
        
        if (pm25Response.getValue() > pm25Threshold) {
            System.out.println("ALERT: PM2.5 levels exceed the safe threshold!");
        }

        if (pm10Response.getValue() > pm10Threshold) {
            System.out.println("ALERT: PM10 levels exceed the safe threshold!");
        }

        if (ozoneResponse.getValue() > ozoneThreshold) {
            System.out.println("ALERT: Ozone levels exceed the safe threshold!");
        }

        LocationRequest locationRequest = LocationRequest.newBuilder().build();
        LocationResponse locationResponse = airQualityStub.getAirQualityByLocation(locationRequest);
        locationResponse.getAirQualityListList().forEach(airQuality -> System.out.println("Air Quality by Location: " + airQuality));

        // Interact with the AirQualityHistoryServer
        HistoryRequest historyRequest = HistoryRequest.newBuilder()
                .setCity("Example City")
                .setArea("Example Area")
                .setDays(7)
                .build();

        PMHistoryResponse pm25HistoryResponse = airQualityHistoryStub.getPM25History(historyRequest);
        System.out.println("PM2.5 History:");
        pm25HistoryResponse.getEntriesList().forEach(entry -> System.out.println(entry));

        PMHistoryResponse pm10HistoryResponse = airQualityHistoryStub.getPM10History(historyRequest);
        System.out.println("PM10 History:");
        pm10HistoryResponse.getEntriesList().forEach(entry -> System.out.println(entry));

        OzoneHistoryResponse ozoneHistoryResponse = airQualityHistoryStub.getOzoneHistory(historyRequest);
        System.out.println("Ozone History:");
        ozoneHistoryResponse.getEntriesList().forEach(entry -> System.out.println(entry));

        SummaryHistoryRequest summaryHistoryRequest = SummaryHistoryRequest.newBuilder()
                .setCity("Example City")
                .setDays(7)
                .build();

        SummaryHistoryResponse summaryHistoryResponse = airQualityHistoryStub.getAirQualitySummaryHistory(summaryHistoryRequest);
        System.out.println("Air Quality Summary History:");
        summaryHistoryResponse.getSummaryList().forEach(summary -> System.out.println(summary));

        LocationHistoryRequest locationHistoryRequest = LocationHistoryRequest.newBuilder()
                .setLatitude(-37.7745f) // Example latitude
                .setLongitude(-122.4194f) // Example longitude
                .setDays(7)
                .build();

        LocationHistoryResponse locationHistoryResponse = airQualityHistoryStub.getAirQualityByLocationHistory(locationHistoryRequest);
        System.out.println("Air Quality by Location History:");
        locationHistoryResponse.getAirQualityListList().forEach(airQuality -> System.out.println(airQuality));

        // Interact with the PersonalizedAlertsServer
        String userId = "user123";

     // Create an alert
     Location alertLocation = Location.newBuilder()
    		 .setLatitude(-37.7745f) // Example latitude
             .setLongitude(-122.4194f) // Example longitude
             .build();

     AlertCreationRequest alertCreationRequest = AlertCreationRequest.newBuilder()
             .setUserId(userId)
             .setAlertType(AlertType.PM25)
             .setLocation(alertLocation)
             .setThreshold(50)
             .build();

     AlertCreationResponse alertCreationResponse = personalizedAlertsStub.createAlert(alertCreationRequest);
     String createdAlertId = alertCreationResponse.getAlertId();
     System.out.println("Created alert with ID: " + createdAlertId);

     // List user alerts
     ListAlertsRequest listAlertsRequest = ListAlertsRequest.newBuilder()
             .setUserId(userId)
             .build();

     ListAlertsResponse listAlertsResponse = personalizedAlertsStub.listAlerts(listAlertsRequest);
     System.out.println("User alerts:");
     listAlertsResponse.getAlertsList().forEach(alert -> System.out.println(alert));

     // Delete an alert
     AlertDeletionRequest alertDeletionRequest = AlertDeletionRequest.newBuilder()
             .setUserId(userId)
             .setAlertId(createdAlertId)
             .build();

     AlertDeletionResponse alertDeletionResponse = personalizedAlertsStub.deleteAlert(alertDeletionRequest);
     System.out.println("Alert deletion success: " + alertDeletionResponse.getSuccess());

        // Shutdown channels
        airQualityChannel.shutdown();
        airQualityHistoryChannel.shutdown();
        personalizedAlertsChannel.shutdown();
        
        scanner.close();
        
    }

}
    


