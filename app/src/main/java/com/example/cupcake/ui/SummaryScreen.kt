/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.cupcake.R
import com.example.cupcake.data.Place
import com.example.cupcake.ui.theme.CupcakeTheme

/**
 * This composable expects [place] that represents the selected recommendation and passes
 * the formatted recommendation details to [onSendButtonClicked] lambda.
 */
@Composable
fun OrderSummaryScreen(
    place: Place,
    onSendButtonClicked: (String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    val orderSummary = stringResource(
        R.string.order_details,
        place.name,
        place.description,
        place.address
    )
    val newOrder = stringResource(R.string.new_cupcake_order)

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            Image(
                painter = painterResource(place.imageResourceId),
                contentDescription = place.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(4f / 3f)
                    .clip(MaterialTheme.shapes.medium)
            )
            Text(
                text = place.name,
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = place.description,
                style = MaterialTheme.typography.bodyLarge
            )
            Divider(thickness = dimensionResource(R.dimen.thickness_divider))
            Text(stringResource(R.string.address).uppercase())
            Text(
                text = place.address,
                fontWeight = FontWeight.Bold
            )
            Divider(thickness = dimensionResource(R.dimen.thickness_divider))
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium)),
            onClick = { onSendButtonClicked(newOrder, orderSummary) }
        ) {
            Text(stringResource(R.string.send))
        }
    }
}

@Preview
@Composable
fun OrderSummaryPreview() {
    CupcakeTheme {
        OrderSummaryScreen(
            place = Place(
                name = "Kopi Joss Lik Man",
                description = "Angkringan legendaris di dekat Stasiun Tugu yang terkenal dengan kopi joss, yaitu kopi hitam yang disajikan bersama bara arang panas.",
                address = "Jl. Wongsodirjan, Sosromenduran, Gedong Tengen",
                imageResourceId = R.drawable.yogyakarta
            ),
            onSendButtonClicked = { _: String, _: String -> },
            modifier = Modifier.fillMaxHeight()
        )
    }
}
