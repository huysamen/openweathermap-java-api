/*
* OpenWeatherMap.java
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

package org.huysamen.openweathermap;

import org.huysamen.openweathermap.api.ForecastData;
import org.huysamen.openweathermap.api.SearchData;
import org.huysamen.openweathermap.api.WeatherData;
import org.huysamen.openweathermap.util.Accuracy;
import org.huysamen.openweathermap.util.Language;
import org.huysamen.openweathermap.util.Unit;

/**
 * This interface defines the contract for any implementing client to provide the required functionality
 * for a full integration with the OpenWeatherMap API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public interface OpenWeatherMapClient {

    /**
     * Sets the unit of measure for all subsequent requests.
     *
     * @param unit The unit of measure.
     * @since 2.5
     */
    public void setMeasureUnit(final Unit unit);

    /**
     * Sets the language for all subsequent requests.
     *
     * @param language The language.
     * @since 2.5
     */
    public void setLanguage(final Language language);

    /**
     * Fetches weather data by city name.
     *
     * @param cityName The name of the city (or search string e.g. 'London,uk').
     * @return The weather data.
     * @since 2.5
     */
    public WeatherData weatherByCityName(final String cityName);

    /**
     * Fetches weather data by latitude and longitude.
     *
     * @param latitude The latitude as a floating point number.
     * @param longitude The longitude as a floating point number.
     * @return The weather data.
     * @since 2.5
     */
    public WeatherData weatherByLatitudeLongitude(final float latitude, final float longitude);

    /**
     * Fetches weather data by city ID.
     *
     * @param cityId The city ID
     * @return The weather data.
     * @since 2.5
     */
    public WeatherData weatherByCityId(final int cityId);

    /**
     * Fetches forecast data in 3 hour increments.
     *
     * @param cityName The name of the city (or search string e.g. 'London,uk').
     * @return The forecast data.
     * @since 2.5
     */
    public ForecastData forecastByCityName(final String cityName);

    /**
     * Fetches forecast data in 3 hour increments.
     *
     * @param latitude The latitude as a floating point number.
     * @param longitude The longitude as a floating point number.
     * @return The forecast data.
     * @since 2.5
     */
    public ForecastData forecastByLatitudeLongitude(final float latitude, final float longitude);

    /**
     * Fetches forecast data in 3 hour increments.
     *
     * @param cityId The city ID
     * @return The forecast data.
     * @since 2.5
     */
    public ForecastData forecastByCityId(final int cityId);

    /**
     * Searches for forecast data based on a search term.
     *
     * @param cityName Search term to match against city name.
     * @param maxResults The maximum number of results to return.
     * @param accuracy The accuracy level to use.
     * @return The search result forecast data.
     * @since 2.5
     */
    public SearchData searchByCityName(final String cityName, final Integer maxResults, final Accuracy accuracy);

    /**
     * Searches for forecast data based on a search term.
     *
     * @param latitude The latitude as a floating point number.
     * @param longitude The longitude as a floating point number.
     * @param maxResults The maximum number of results to return.
     * @param accuracy The accuracy level to use.
     * @return The search result forecast data.
     * @since 2.5
     */
    public SearchData searchByLatitudeLongitude(final float latitude, final float longitude, final Integer maxResults, final Accuracy accuracy);
}
