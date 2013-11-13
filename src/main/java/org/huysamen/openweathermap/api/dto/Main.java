/*
* Main.java
*
* Copyright (c) 2013, Nicolaas Frederick Huysamen. All rights reserved.
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 3 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
* MA 02110-1301 USA
*/

package org.huysamen.openweathermap.api.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Main data as returned by the API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public class Main {

    @SerializedName(value = "temp")
    private Float temperature;

    @SerializedName(value = "temp_min")
    private Float minTemperature;

    @SerializedName(value = "temp_max")
    private Float maxTemperature;

    @SerializedName(value = "pressure")
    private Float pressure;

    @SerializedName(value = "sea_level")
    private Float seaLevel;

    @SerializedName(value = "grnd_level")
    private Float groundLevel;

    @SerializedName(value = "humidity")
    private Integer humidity;

    @SerializedName(value = "temp_kf")
    private Float temperatureKf;

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(final Float temperature) {
        this.temperature = temperature;
    }

    public Float getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(final Float minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Float getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(final Float maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(final Float pressure) {
        this.pressure = pressure;
    }

    public Float getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(final Float seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Float getGroundLevel() {
        return groundLevel;
    }

    public void setGroundLevel(final Float groundLevel) {
        this.groundLevel = groundLevel;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(final Integer humidity) {
        this.humidity = humidity;
    }

    public Float getTemperatureKf() {
        return temperatureKf;
    }

    public void setTemperatureKf(final Float temperatureKf) {
        this.temperatureKf = temperatureKf;
    }
}
