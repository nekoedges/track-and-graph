/*
 * This file is part of Track & Graph
 *
 * Track & Graph is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Track & Graph is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Track & Graph.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.samco.trackandgraph.graphstatview.factories.viewdto

import com.androidplot.xy.RectRegion
import com.androidplot.xy.SimpleXYSeries
import com.androidplot.xy.StepMode
import com.samco.trackandgraph.base.database.dto.YRangeType
import org.threeten.bp.OffsetDateTime

interface IBarChartData : IGraphStatViewData {
    /**
     * One x date for every bar in the list. You don't necessarily draw all of them on the x axis
     */
    val xDates: List<OffsetDateTime>
        get() = emptyList()

    /**
     * One bar list for each label in the data set
     */
    val bars: List<SimpleXYSeries>
        get() = emptyList()

    /**
     * Whether the y values should be interpreted as a number of seconds or just a number
     */
    val durationBasedRange: Boolean
        get() = false

    /**
     * The end time of the graph
     */
    val endTime: OffsetDateTime
        get() = OffsetDateTime.MIN

    /**
     * Whether the y axis should fit to the data or be fixed. This is only dynamic if the user selected
     * dynamic, but if you're viewing the graph in list mode you should just ignore it and use fixed
     * with the bounds instead.
     */
    val yRangeType: YRangeType
        get() = YRangeType.DYNAMIC

    /**
     * The bounds of the graph in x and y
     */
    val bounds: RectRegion
        get() = RectRegion()

    /**
     * The y axis range parameters used by android plot library
     */
    val yAxisRangeParameters: Pair<StepMode, Double>
        get() = Pair(StepMode.SUBDIVIDE, 11.0)
}