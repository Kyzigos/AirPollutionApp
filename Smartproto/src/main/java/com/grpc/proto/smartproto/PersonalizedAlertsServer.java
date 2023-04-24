package com.grpc.proto.smartproto;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.UUID;

public class PersonalizedAlertsServer extends PersonalizedAlertsServiceGrpc.PersonalizedAlertsServiceImplBase {

    private AlertsManager alertsManager = new AlertsManager();

    public static void main(String[] args) throws InterruptedException, IOException {
        PersonalizedAlertsServer personalizedAlertsServer = new PersonalizedAlertsServer();

        int port = 50084;

        Server server = ServerBuilder.forPort(port)
                .addService(personalizedAlertsServer)
                .build()
                .start();

        System.out.println("PersonalizedAlertsServer started, listening on " + port);

        server.awaitTermination();
    }

    @Override
    public void createAlert(AlertCreationRequest request, StreamObserver<AlertCreationResponse> responseObserver) {
        String alertId = UUID.randomUUID().toString();
        UserAlert alert = UserAlert.newBuilder()
                .setAlertId(alertId)
                .setUserId(request.getUserId())
                .setAlertType(request.getAlertType())
                .setLocation(request.getLocation())
                .setThreshold(request.getThreshold())
                .build();

        alertsManager.addAlert(alert);

        AlertCreationResponse response = AlertCreationResponse.newBuilder()
                .setAlertId(alertId)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listAlerts(ListAlertsRequest request, StreamObserver<ListAlertsResponse> responseObserver) {
        ListAlertsResponse response = ListAlertsResponse.newBuilder()
                .addAllAlerts(alertsManager.getAlertsForUser(request.getUserId()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteAlert(AlertDeletionRequest request, StreamObserver<AlertDeletionResponse> responseObserver) {
        boolean success = alertsManager.deleteAlert(request.getUserId(), request.getAlertId());

        AlertDeletionResponse response = AlertDeletionResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
