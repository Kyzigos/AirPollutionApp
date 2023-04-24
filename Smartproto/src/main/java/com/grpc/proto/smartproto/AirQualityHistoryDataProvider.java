package com.grpc.proto.smartproto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AirQualityHistoryDataProvider {

    private final Random random = new Random();

    public List<PMHistoryEntry> getPM25History(String city, String area, int days) {
        List<PMHistoryEntry> pm25History = new ArrayList<>();
        for (int i = 0; i < days; i++) {
            pm25History.add(PMHistoryEntry.newBuilder()
                    .setTimestamp(System.currentTimeMillis() / 1000L - i * 86400L)
                    .setValue(random.nextFloat() * 100)
                    .build());
        }

        return pm25History;
    }

    public List<PMHistoryEntry> getPM10History(String city, String area, int days) {
        List<PMHistoryEntry> pm10History = new ArrayList<>();
        for (int i = 0; i < days; i++) {
            pm10History.add(PMHistoryEntry.newBuilder()
                    .setTimestamp(System.currentTimeMillis() / 1000L - i * 86400L)
                    .setValue(random.nextFloat() * 200)
                    .build());
        }

        return pm10History;
    }

    public List<OzoneHistoryEntry> getOzoneHistory(String city, String area, int days) {
        List<OzoneHistoryEntry> ozoneHistory = new ArrayList<>();
        for (int i = 0; i < days; i++) {
            ozoneHistory.add(OzoneHistoryEntry.newBuilder()
                    .setTimestamp(System.currentTimeMillis() / 1000L - i * 86400L)
                    .setValue(random.nextFloat() * 0.3f)
                    .build());
        }

        return ozoneHistory;
    }

    public List<AirQualitySummaryHistory> getAirQualitySummaryHistory(String city, int days) {
        List<AirQualitySummaryHistory> summaryHistory = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            summaryHistory.add(AirQualitySummaryHistory.newBuilder()
                    .setArea("Area " + (i + 1))
                    .addAllPm25History(getPM25History(city, "Area " + (i + 1), days))
                    .addAllPm10History(getPM10History(city, "Area " + (i + 1), days))
                    .addAllOzoneHistory(getOzoneHistory(city, "Area " + (i + 1), days))
                    .build());
        }

        return summaryHistory;
    }

    public List<AirQualityByLocationHistory> getAirQualityByLocationHistory(float latitude, float longitude, int days) {
        List<AirQualityByLocationHistory> airQualityList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            airQualityList.add(AirQualityByLocationHistory.newBuilder()
                    .setArea("Area " + (i + 1))
                    .addAllPm25History(getPM25History(null, "Area " + (i + 1), days))
                    .addAllPm10History(getPM10History(null, "Area " + (i + 1), days))
                    .addAllOzoneHistory(getOzoneHistory(null, "Area " + (i + 1), days))
                    .build());
        }

        return airQualityList;
    }
}

