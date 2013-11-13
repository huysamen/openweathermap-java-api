/*
* OpenWeatherMapJerseyClient.java
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

package org.huysamen.openweathermap.impl.jersey;

import com.google.gson.Gson;
import org.huysamen.openweathermap.OpenWeatherMapClient;
import org.huysamen.openweathermap.api.DailyForecastData;
import org.huysamen.openweathermap.api.ForecastData;
import org.huysamen.openweathermap.api.SearchData;
import org.huysamen.openweathermap.api.WeatherData;
import org.huysamen.openweathermap.util.Accuracy;
import org.huysamen.openweathermap.util.Language;
import org.huysamen.openweathermap.util.Unit;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * An implementation of the OpenWeatherMapClient interface, using Jersey as the HTTP engine.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public class OpenWeatherMapJerseyClient implements OpenWeatherMapClient {

    private static final String QP_QUERY = "q";
    private static final String QP_LATITUDE = "lat";
    private static final String QP_LONGITUDE = "lon";
    private static final String QP_ID = "id";
    private static final String QP_UNITS = "units";
    private static final String QP_LANGUAGE = "lang";
    private static final String QP_ACCURACY = "type";
    private static final String QP_RESTRICTION = "cnt";

    private final Gson gson = new Gson();
    private final WebTarget weatherTarget;
    private final WebTarget forecastTarget;
    private final WebTarget dailyForecastTarget;
    private final WebTarget searchTarget;

    private Unit unit = Unit.METRIC;
    private Language language = Language.ENGLISH;

    public OpenWeatherMapJerseyClient() {
        final Client client = ClientBuilder.newClient();
        final WebTarget baseTarget = client.target("http://api.openweathermap.org/data/2.5");

        weatherTarget = baseTarget.path("weather");
        forecastTarget = baseTarget.path("forecast");
        dailyForecastTarget = forecastTarget.path("daily");
        searchTarget = baseTarget.path("find");
    }


    @Override
    public void setMeasureUnit(final Unit unit) {
        this.unit = unit;
    }

    @Override
    public void setLanguage(final Language language) {
        this.language = language;
    }

    @Override
    public WeatherData weatherByCityName(final String cityName) {
        return sendRequest(
                WeatherData.class,
                weatherTarget,
                new QueryParameter(QP_QUERY, cityName));
    }

    @Override
    public WeatherData weatherByLatitudeLongitude(final float latitude, final float longitude) {
        return sendRequest(
                WeatherData.class,
                weatherTarget,
                new QueryParameter(QP_LATITUDE, latitude),
                new QueryParameter(QP_LONGITUDE, longitude));
    }

    @Override
    public WeatherData weatherByCityId(final int cityId) {
        return sendRequest(
                WeatherData.class,
                weatherTarget,
                new QueryParameter(QP_ID, cityId));
    }

    @Override
    public ForecastData forecastByCityName(final String cityName) {
        return sendRequest(
                ForecastData.class,
                forecastTarget,
                new QueryParameter(QP_QUERY, cityName));
    }

    @Override
    public ForecastData forecastByLatitudeLongitude(final float latitude, final float longitude) {
        return sendRequest(
                ForecastData.class,
                forecastTarget,
                new QueryParameter(QP_LATITUDE, latitude),
                new QueryParameter(QP_LONGITUDE, longitude));
    }

    @Override
    public ForecastData forecastByCityId(final int cityId) {
        return sendRequest(
                ForecastData.class,
                forecastTarget,
                new QueryParameter(QP_ID, cityId));
    }

    @Override
    public DailyForecastData dailyForecastByCityName(final String cityName) {
        return sendRequest(
                DailyForecastData.class,
                dailyForecastTarget,
                new QueryParameter(QP_QUERY, cityName));
    }

    @Override
    public DailyForecastData dailyForecastByLatitudeLongitude(final float latitude, final float longitude) {
        return sendRequest(
                DailyForecastData.class,
                dailyForecastTarget,
                new QueryParameter(QP_LATITUDE, latitude),
                new QueryParameter(QP_LONGITUDE, longitude));
    }

    @Override
    public DailyForecastData dailyForecastByCityId(final int cityId) {
        return sendRequest(
                DailyForecastData.class,
                dailyForecastTarget,
                new QueryParameter(QP_ID, cityId));
    }

    @Override
    public SearchData searchByCityName(final String cityName, final Integer maxResults, final Accuracy accuracy) {
        return sendRequest(
                SearchData.class,
                searchTarget,
                new QueryParameter(QP_QUERY, cityName),
                new QueryParameter(QP_ACCURACY, accuracy));
    }

    @Override
    public SearchData searchByLatitudeLongitude(final float latitude, final float longitude, final Integer maxResults, final Accuracy accuracy) {
        return sendRequest(
                SearchData.class,
                searchTarget,
                new QueryParameter(QP_LATITUDE, latitude),
                new QueryParameter(QP_LONGITUDE, longitude),
                new QueryParameter(QP_ACCURACY, accuracy));
    }

    private <T> T sendRequest(final Class<T> type, final WebTarget baseTarget, final QueryParameter... queryParameters) {
        WebTarget target = baseTarget.queryParam(QP_UNITS, unit).queryParam(QP_LANGUAGE, language);

        for (final QueryParameter parameter : queryParameters) {
            target = target.queryParam(parameter.key, parameter.value);
        }

        final Invocation.Builder builder = target.request();
        final Response response = builder.accept(MediaType.APPLICATION_JSON_TYPE).get();

        return gson.fromJson(response.readEntity(String.class), type);
    }

    private static final class QueryParameter {

        private final String key;
        private final Object value;

        private QueryParameter(final String key, final Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
