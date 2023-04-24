package com.grpc.proto.smartproto;

import java.util.Random;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class AirQualityServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50081;
        Server server = ServerBuilder.forPort(port)
                .addService(new AirQualityServiceImpl())
                .build()
                .start();

        System.out.println("Server started, listening on " + port);
        server.awaitTermination();
    }

    static class AirQualityServiceImpl extends AirQualityServiceGrpc.AirQualityServiceImplBase {
        private final Random random = new Random();

        @Override
        public void getPM25(PMRequest request, StreamObserver<PMResponse> responseObserver) {
            float randomPM25 = 10 + random.nextFloat() * 15; // Random value between 10 and 25

            PMResponse response = PMResponse.newBuilder().setValue(randomPM25).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getPM10(PMRequest request, StreamObserver<PMResponse> responseObserver) {
            float randomPM10 = 20 + random.nextFloat() * 30; // Random value between 20 and 50

            PMResponse response = PMResponse.newBuilder().setValue(randomPM10).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getOzone(OzoneRequest request, StreamObserver<OzoneResponse> responseObserver) {
            float randomOzone = 20 + random.nextFloat() * 40; // Random value between 20 and 60

            OzoneResponse response = OzoneResponse.newBuilder().setValue(randomOzone).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getAirQualitySummary(SummaryRequest request, StreamObserver<SummaryResponse> responseObserver) {
            float randomPM25 = 10 + random.nextFloat() * 15;
            float randomPM10 = 20 + random.nextFloat() * 30;
            float randomOzone = 20 + random.nextFloat() * 40;

            float airQualityIndex = (randomPM25 + randomPM10 + randomOzone) / 3;

            AirQualitySummary summary = AirQualitySummary.newBuilder()
                    .setArea("Area 1")
                    .setPm25Value(randomPM25)
                    .setPm10Value(randomPM10)
                    .setOzoneValue(randomOzone)
                    .setAirQualityIndex(airQualityIndex)
                    .build();

            SummaryResponse response = SummaryResponse.newBuilder().addSummary(summary).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getAirQualityByLocation(LocationRequest request, StreamObserver<LocationResponse> responseObserver) {
            float randomPM25 = 10 + random.nextFloat() * 15;
            float randomPM10 = 20 + random.nextFloat() * 30;
            float randomOzone = 20 + random.nextFloat() * 40;

            AirQualityByLocation airQuality = AirQualityByLocation.newBuilder()
                    .setArea("Area 1")
                    .setPm25Value(randomPM25)
                    .setPm10Value(randomPM10)
                    .setOzoneValue(randomOzone)
                    .build();

            LocationResponse response = LocationResponse.newBuilder().addAirQualityList(airQuality).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}