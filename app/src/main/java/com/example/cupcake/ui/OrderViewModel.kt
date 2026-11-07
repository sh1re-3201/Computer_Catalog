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
import com.example.cupcake.data.DataSource
import com.example.cupcake.data.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat
import java.util.Locale

/**
 * [OrderViewModel] holds information about a computer order in terms of processor, memory,
 * storage, monitor and graphics card. It also knows how to calculate the total price based on
 * these order details.
 */
class OrderViewModel : ViewModel() {

    /**
     * Computer order state for this order
     */
    private val _uiState = MutableStateFlow(newOrder())
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    /**
     * Set the [processor] for this order's state and update the price
     */
    fun setProcessor(processor: String) {
        updateOrder { currentState -> currentState.copy(processor = processor) }
    }

    /**
     * Set the [memory] for this order's state and update the price
     */
    fun setMemory(memory: String) {
        updateOrder { currentState -> currentState.copy(memory = memory) }
    }

    /**
     * Set the [storage] for this order's state and update the price
     */
    fun setStorage(storage: String) {
        updateOrder { currentState -> currentState.copy(storage = storage) }
    }

    /**
     * Set the [monitor] for this order's state and update the price
     */
    fun setMonitor(monitor: String) {
        updateOrder { currentState -> currentState.copy(monitor = monitor) }
    }

    /**
     * Set the [graphicsCard] for this order's state and update the price
     */
    fun setGraphicsCard(graphicsCard: String) {
        updateOrder { currentState -> currentState.copy(graphicsCard = graphicsCard) }
    }

    /**
     * Reset the order state
     */
    fun resetOrder() {
        _uiState.value = newOrder()
    }

    /**
     * Applies [change] to the current order state and recalculates its price.
     */
    private fun updateOrder(change: (OrderUiState) -> OrderUiState) {
        _uiState.update { currentState ->
            val newState = change(currentState)
            newState.copy(price = calculatePrice(newState))
        }
    }

    /**
     * Returns an empty order that already shows a price of zero.
     */
    private fun newOrder(): OrderUiState {
        return OrderUiState(price = calculatePrice(OrderUiState()))
    }

    /**
     * Returns the calculated price (in Rupiah) based on the order details.
     */
    private fun calculatePrice(order: OrderUiState): String {
        val calculatedPrice = (DataSource.processors[order.processor] ?: 0) +
            (DataSource.memories[order.memory] ?: 0) +
            (DataSource.storages[order.storage] ?: 0) +
            (DataSource.monitors[order.monitor] ?: 0) +
            (DataSource.graphicsCards[order.graphicsCard] ?: 0)
        val formatter = NumberFormat.getCurrencyInstance(Locale("in", "ID"))
        formatter.maximumFractionDigits = 0
        return formatter.format(calculatedPrice)
    }
}
