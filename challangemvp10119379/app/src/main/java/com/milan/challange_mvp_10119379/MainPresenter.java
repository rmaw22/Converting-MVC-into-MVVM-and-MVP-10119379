package com.milan.challange_mvp_10119379;

public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void calculateMetricLength(String meter) {
        if (meter.isEmpty())
            meter = "0";

        Meter model = new Meter();
        double parsedCelsius = Double.parseDouble(meter);
        model.setMeter(parsedCelsius);

        String kilometer = model.toKilometer() + "";
        String centimeter = model.toCentimeter() + "";

        view.showKilometer(kilometer);
        view.showCentimeter(centimeter);
    }
}
