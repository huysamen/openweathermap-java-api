/*
* Wind.java
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
 * Wind data as returned by the API.
 *
 * @author Nicolaas Frederick Huysamen
 * @version 2.5
 */
public class Wind {

    @SerializedName(value = "speed")
    private Float speed;

    @SerializedName(value = "deg")
    private Float degrees;

    @SerializedName(value = "gust")
    private Float gust;

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(final Float speed) {
        this.speed = speed;
    }

    public Float getDegrees() {
        return degrees;
    }

    public void setDegrees(final Float degrees) {
        this.degrees = degrees;
    }

    public Float getGust() {
        return gust;
    }

    public void setGust(final Float gust) {
        this.gust = gust;
    }
}
