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
package com.example.cupcake.data

/**
 * Data class that represents the current UI state in terms of the selected [processor],
 * [memory], [storage], [monitor], [graphicsCard] and total [price]
 */
data class OrderUiState(
    /** Selected processor (such as "AMD Ryzen 5 5500") */
    val processor: String = "",
    /** Selected memory (RAM) (such as "16GB (2x8GB) DDR4 3200MHz Corsair Vengeance LPX") */
    val memory: String = "",
    /** Selected storage drive (such as "512GB SSD NVMe Kingston NV2") */
    val storage: String = "",
    /** Selected monitor (such as "24\" LG UltraGear 24GN60R (FHD 144Hz)") */
    val monitor: String = "",
    /** Selected graphics card (such as "NVIDIA GeForce RTX 4060 8GB") */
    val graphicsCard: String = "",
    /** Total price for the order */
    val price: String = ""
)
