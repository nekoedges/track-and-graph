package com.samco.trackandgraph.ui.compose.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.samco.trackandgraph.R

val cardCornerRadius: Dp
    @Composable
    get() = dimensionResource(id = R.dimen.card_corner_radius)

val shapeMedium = 8.dp

val shapeLarge = 16.dp

val shapes: Shapes
    @Composable
    get() = Shapes(
        small = RoundedCornerShape(cardCornerRadius),
        medium = RoundedCornerShape(shapeMedium),
        large = RoundedCornerShape(shapeLarge)
    )
