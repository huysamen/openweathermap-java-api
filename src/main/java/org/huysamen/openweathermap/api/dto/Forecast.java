/*
* Forecast.java
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

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Individual forecast data as returned by the API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public class Forecast {

    @SerializedName(value = "dt")
    private Long date;

    @SerializedName(value = "dt_txt")
    private String dateText;

    @SerializedName(value = "main")
    private Main mainData;

    @SerializedName(value = "weather")
    private Weather[] weatherData;

    @SerializedName(value = "clouds")
    private Clouds cloudData;

    @SerializedName(value = "wind")
    private Wind windData;

    @SerializedName(value = "rain")
    private Rain rainData;

    @SerializedName(value = "snow")
    private Snow snowData;

    public Long getDate() {
        return date;
    }

    public void setDate(final Long date) {
        this.date = date;
    }

    public String getDateText() {
        if (dateText == null) {
            dateText = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(getDateAsDate());
        }

        return dateText;
    }

    public void setDateText(final String dateText) {
        this.dateText = dateText;
    }

    public Main getMainData() {
        return mainData;
    }

    public void setMainData(final Main mainData) {
        this.mainData = mainData;
    }

    public Weather[] getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(final Weather[] weatherData) {
        this.weatherData = weatherData;
    }

    public Clouds getCloudData() {
        return cloudData;
    }

    public void setCloudData(final Clouds cloudData) {
        this.cloudData = cloudData;
    }

    public Wind getWindData() {
        return windData;
    }

    public void setWindData(final Wind windData) {
        this.windData = windData;
    }

    public Rain getRainData() {
        return rainData;
    }

    public void setRainData(final Rain rainData) {
        this.rainData = rainData;
    }

    public Snow getSnowData() {
        return snowData;
    }

    public void setSnowData(final Snow snowData) {
        this.snowData = snowData;
    }

    public Date getDateAsDate() {
        return new Date(date * 1000);
    }
}
