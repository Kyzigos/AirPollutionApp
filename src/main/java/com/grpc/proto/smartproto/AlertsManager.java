package com.grpc.proto.smartproto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AlertsManager {

    private final Map<String, List<UserAlert>> userAlertsMap = new HashMap<>();

    public void addAlert(UserAlert alert) {
        List<UserAlert> userAlerts = userAlertsMap.getOrDefault(alert.getUserId(), new ArrayList<>());
        userAlerts.add(alert);
        userAlertsMap.put(alert.getUserId(), userAlerts);
    }

    public List<UserAlert> getAlertsForUser(String userId) {
        return userAlertsMap.getOrDefault(userId, new ArrayList<>());
    }

    public boolean deleteAlert(String userId, String alertId) {
        if (!userAlertsMap.containsKey(userId)) {
            return false;
        }

        List<UserAlert> userAlerts = userAlertsMap.get(userId);
        int initialSize = userAlerts.size();
        userAlerts = userAlerts.stream()
                .filter(alert -> !alert.getAlertId().equals(alertId))
                .collect(Collectors.toList());

        userAlertsMap.put(userId, userAlerts);
        return userAlerts.size() < initialSize;
    }

    public List<UserAlert> getAllAlerts() {
        return userAlertsMap.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public void checkAlertConditions(double pm25Value, double pm10Value, double ozoneValue) {
        for (UserAlert alert : getAllAlerts()) {
            if ((alert.getAlertType() == AlertType.PM25 && pm25Value > 17) ||
                (alert.getAlertType() == AlertType.PM10 && pm10Value > 17) ||
                (alert.getAlertType() == AlertType.OZONE && ozoneValue > 17)) {
                // If any of the conditions are met, trigger the alert
                triggerAlert(alert, "Area is risky for health");
            }
        }
    }

    private void triggerAlert(UserAlert alert, String message) {
        System.out.println("ALERT TRIGGERED for User ID: " + alert.getUserId());
        System.out.println("Alert ID: " + alert.getAlertId());
        System.out.println("Alert Type: " + alert.getAlertType());
        System.out.println("Location: " + alert.getLocation());
        System.out.println("Threshold: " + alert.getThreshold());
        System.out.println("Message: " + message);
        System.out.println("-------------------------------");
    }
}


