package com.grpc.proto.smartproto;

import javax.swing.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirQualityClientGUI {

    private JFrame frame;
    private JTextField latitudeTextField;
    private JTextField longitudeTextField;
    private JTextArea resultTextArea;
    private AirQualityServiceGrpc.AirQualityServiceBlockingStub airQualityStub;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                AirQualityClientGUI window = new AirQualityClientGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public AirQualityClientGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        frame.getContentPane().add(inputPanel, BorderLayout.NORTH);

        JLabel latitudeLabel = new JLabel("Latitude:");
        inputPanel.add(latitudeLabel);

        latitudeTextField = new JTextField();
        inputPanel.add(latitudeTextField);
        latitudeTextField.setColumns(10);

        JLabel longitudeLabel = new JLabel("Longitude:");
        inputPanel.add(longitudeLabel);

        longitudeTextField = new JTextField();
        inputPanel.add(longitudeTextField);
        longitudeTextField.setColumns(10);

        JButton submitButton = new JButton("Get Air Quality");
        inputPanel.add(new JLabel("")); // Placeholder
        inputPanel.add(submitButton);
        submitButton.addActionListener(new SubmitButtonListener());

        JScrollPane scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        resultTextArea = new JTextArea();
        scrollPane.setViewportView(resultTextArea);

        // Initialize airQualityStub
        ManagedChannel airQualityChannel = ManagedChannelBuilder.forAddress("localhost", 50081)
                .usePlaintext()
                .build();
        airQualityStub = AirQualityServiceGrpc.newBlockingStub(airQualityChannel);
    }

    class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float latitude = Float.parseFloat(latitudeTextField.getText());
            float longitude = Float.parseFloat(longitudeTextField.getText());

            PMRequest pmRequest = PMRequest.newBuilder().build();

            PMResponse pm25Response = airQualityStub.getPM25(pmRequest);
            double pm25Value = pm25Response.getValue();

            PMResponse pm10Response = airQualityStub.getPM10(pmRequest);
            double pm10Value = pm10Response.getValue();

            OzoneRequest ozoneRequest = OzoneRequest.newBuilder().build();
            OzoneResponse ozoneResponse = airQualityStub.getOzone(ozoneRequest);
            double ozoneValue = ozoneResponse.getValue();

            resultTextArea.setText("PM10: " + pm10Value + "\nPM2.5: " + pm25Value + "\nOzone: " + ozoneValue);
        }
    }
}
