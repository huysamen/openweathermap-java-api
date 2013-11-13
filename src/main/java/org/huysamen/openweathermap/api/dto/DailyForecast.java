package org.huysamen.openweathermap.api.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 *
 */
public class DailyForecast {

    @SerializedName(value = "dt")
    private Long date;

    @SerializedName(value = "pressure")
    private Float pressure;

    @SerializedName(value = "humidity")
    private Integer humidity;

    @SerializedName(value = "speed")
    private Float windSpeed;

    @SerializedName(value = "deg")
    private Float windDegrees;

    @SerializedName(value = "clouds")
    private Integer cloudCoverage;

    @SerializedName(value = "temp")
    private Temperature temperatureData;

    @SerializedName(value = "weather")
    private Weather[] weatherData;

    public Long getDate() {
        return date;
    }

    public void setDate(final Long date) {
        this.date = date;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(final Float pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(final Integer humidity) {
        this.humidity = humidity;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(final Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Float getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(final Float windDegrees) {
        this.windDegrees = windDegrees;
    }

    public Integer getCloudCoverage() {
        return cloudCoverage;
    }

    public void setCloudCoverage(final Integer cloudCoverage) {
        this.cloudCoverage = cloudCoverage;
    }

    public Temperature getTemperatureData() {
        return temperatureData;
    }

    public void setTemperatureData(final Temperature temperatureData) {
        this.temperatureData = temperatureData;
    }

    public Weather[] getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(final Weather[] weatherData) {
        this.weatherData = weatherData;
    }

    public Date getDateAsDate() {
        return new Date(date * 1000);
    }
}
