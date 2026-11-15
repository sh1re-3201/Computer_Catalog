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

import androidx.lifecycle.ViewModel
import com.example.cupcake.data.Category
import com.example.cupcake.data.OrderUiState
import com.example.cupcake.data.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * [OrderViewModel] holds which category and which place the user is currently viewing.
 */
class OrderViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(OrderUiState())
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    /**
     * Set the [category] whose places should be shown
     */
    fun setCategory(category: Category) {
        _uiState.update { currentState -> currentState.copy(selectedCategory = category) }
    }

    /**
     * Set the [place] whose details should be shown
     */
    fun setPlace(place: Place) {
        _uiState.update { currentState -> currentState.copy(selectedPlace = place) }
    }
}
