/*
* Unit.java
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
 * The units of measurement available when making requests to the OpenWeatherMap API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public enum Unit {

    METRIC("metric"),
    IMPERIAL("imperial");

    private final String unit;

    private Unit(final String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return unit;
    }
}
