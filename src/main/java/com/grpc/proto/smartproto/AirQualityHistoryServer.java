package com.grpc.proto.smartproto;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.List;

public class AirQualityHistoryServer extends AirQualityHistoryServiceGrpc.AirQualityHistoryServiceImplBase {

    private final AirQualityHistoryDataProvider dataProvider = new AirQualityHistoryDataProvider();

    public static void main(String[] args) throws InterruptedException, IOException {
        AirQualityHistoryServer airQualityHistoryServer = new AirQualityHistoryServer();

        int port = 50083;

        Server server = ServerBuilder.forPort(port)
                .addService(airQualityHistoryServer)
                .build()
                .start();

        System.out.println("AirQualityHistoryServer started, listening on " + port);

        server.awaitTermination();
    }

    @Override
    public void getPM25History(HistoryRequest request, StreamObserver<PMHistoryResponse> responseObserver) {
        List<PMHistoryEntry> pm25History = dataProvider.getPM25History(request.getCity(), request.getArea(), request.getDays());
        PMHistoryResponse response = PMHistoryResponse.newBuilder().addAllEntries(pm25History).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getPM10History(HistoryRequest request, StreamObserver<PMHistoryResponse> responseObserver) {
        List<PMHistoryEntry> pm10History = dataProvider.getPM10History(request.getCity(), request.getArea(), request.getDays());
        PMHistoryResponse response = PMHistoryResponse.newBuilder().addAllEntries(pm10History).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getOzoneHistory(HistoryRequest request, StreamObserver<OzoneHistoryResponse> responseObserver) {
        List<OzoneHistoryEntry> ozoneHistory = dataProvider.getOzoneHistory(request.getCity(), request.getArea(), request.getDays());
        OzoneHistoryResponse response = OzoneHistoryResponse.newBuilder().addAllEntries(ozoneHistory).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAirQualitySummaryHistory(SummaryHistoryRequest request, StreamObserver<SummaryHistoryResponse> responseObserver) {
        List<AirQualitySummaryHistory> summaryHistory = dataProvider.getAirQualitySummaryHistory(request.getCity(), request.getDays());
        SummaryHistoryResponse response = SummaryHistoryResponse.newBuilder().addAllSummary(summaryHistory).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAirQualityByLocationHistory(LocationHistoryRequest request, StreamObserver<LocationHistoryResponse> responseObserver) {
        List<AirQualityByLocationHistory> airQualityList = dataProvider.getAirQualityByLocationHistory(request.getLatitude(), request.getLongitude(), request.getDays());
        LocationHistoryResponse response = LocationHistoryResponse.newBuilder().addAllAirQualityList(airQualityList).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}


