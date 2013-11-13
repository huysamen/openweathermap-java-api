OpenWeatherMap API Implementation (Java)
========================================

This library provides a Java implementation library to communicate with the OpenWeatherMap REST (version 2.5) API.

The following methods are available:

    weatherByCityName(final String cityName);
    weatherByLatitudeLongitude(final float latitude, final float longitude);
    weatherByCityId(final int cityId);
    forecastByCityName(final String cityName);
    forecastByLatitudeLongitude(final float latitude, final float longitude);
    forecastByCityId(final int cityId);
    dailyForecastByCityName(final String cityName);
    dailyForecastByLatitudeLongitude(final float latitude, final float longitude);
    dailyForecastByCityId(final int cityId);
    searchByCityName(final String cityName, final Integer maxResults, final Accuracy accuracy);
    searchByLatitudeLongitude(final float latitude, final float longitude, final Integer maxResults, final Accuracy accuracy);
    
