package services;

import model.Alert;

import java.util.ArrayList;
import java.util.List;

public class AlertService {

    private final List<Alert> alerts = new ArrayList<>();

    public void createAlert(Alert alert) {

        if (alert == null) {
            throw new IllegalArgumentException("Alert cannot be null");
        }

        alerts.add(alert);
    }

    public List<Alert> getAllAlerts() {
        return alerts;
    }
}