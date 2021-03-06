package com.lithiumsheep.jacketapp.models.weather;

import com.squareup.moshi.Json;

public class Metrics {

    private float temp;
    @Json(name = "temp_min")
    private float tempMin;
    @Json(name = "temp_max")
    private float tempMax;

    private float pressure;
    private int humidity;

    public float getTemp() {
        return temp;
    }

    public float getTempMin() {
        return tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }
}
