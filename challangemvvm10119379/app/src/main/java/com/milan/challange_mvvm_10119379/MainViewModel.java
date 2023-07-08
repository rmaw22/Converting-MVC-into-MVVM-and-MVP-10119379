package com.milan.challange_mvvm_10119379;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends ViewModel {
    private final MutableLiveData<Meter> meter;

    public MainViewModel() {
        meter = new MutableLiveData<>();
    }

    public LiveData<Meter> getMeter() {
        return meter;
    }

    public void setCelsius(String stringCelsius) {
        if (stringCelsius.isEmpty())
            stringCelsius = "0";

        double parsedMeter = Double.parseDouble(stringCelsius);

        Meter meter = new Meter();
        meter.setMeter(parsedMeter);

        this.meter.setValue(meter);
    }
}
