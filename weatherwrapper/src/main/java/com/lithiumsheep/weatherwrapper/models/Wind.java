package com.lithiumsheep.weatherwrapper.models;

import com.squareup.moshi.Json;

public class Wind {

    @Json(name = "speed")
    private float speed;

    @Json(name = "deg")
    private float degrees;

    public float getSpeed() {
        return speed;
    }

    public float getDegrees() {
        return degrees;
    }

    // TODO: Add direction decoding.
    /*public enum DIRECTION {
        N, NE, E, SE, S, SW, W, NW
    }*/
}
