package org.huysamen.openweathermap.api.dto;

import com.google.gson.annotations.SerializedName;

/**
 *
 */
public class Temperature {

    @SerializedName(value = "min")
    private Float minimum;

    @SerializedName(value = "max")
    private Float maximum;

    @SerializedName(value = "morn")
    private Float morning;

    @SerializedName(value = "day")
    private Float day;

    @SerializedName(value = "eve")
    private Float evening;

    @SerializedName(value = "night")
    private Float night;

    public Float getMinimum() {
        return minimum;
    }

    public void setMinimum(final Float minimum) {
        this.minimum = minimum;
    }

    public Float getMaximum() {
        return maximum;
    }

    public void setMaximum(final Float maximum) {
        this.maximum = maximum;
    }

    public Float getMorning() {
        return morning;
    }

    public void setMorning(final Float morning) {
        this.morning = morning;
    }

    public Float getDay() {
        return day;
    }

    public void setDay(final Float day) {
        this.day = day;
    }

    public Float getEvening() {
        return evening;
    }

    public void setEvening(final Float evening) {
        this.evening = evening;
    }

    public Float getNight() {
        return night;
    }

    public void setNight(final Float night) {
        this.night = night;
    }
}
