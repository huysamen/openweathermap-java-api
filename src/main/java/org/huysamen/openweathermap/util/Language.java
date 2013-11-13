/*
* Language.java
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

package org.huysamen.openweathermap.util;

/**
 * The languages available when making requests to the OpenWeatherMap API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public enum Language {

    BULGARIAN("bg"),
    CHINESE_SIMPLIFIED("zh_cn"),
    CHINESE_TRADITIONAL("zh_tw"),
    DUTCH("nl"),
    ENGLISH("en"),
    FINNISH("fi"),
    FRENCH("fr"),
    GERMAN("de"),
    ITALIAN("it"),
    POLISH("pl"),
    PORTUGUESE("pt"),
    ROMANIAN("ro"),
    RUSSIAN("ru"),
    SPANISH("sp"),
    SWEDISH("se"),
    TURKISH("tr"),
    UKRAINIAN("ua");

    private final String language;

    private Language(final String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return language;
    }
}
