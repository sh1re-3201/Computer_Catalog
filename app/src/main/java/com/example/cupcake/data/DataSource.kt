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

object DataSource {
    /** Processor options mapped to their (estimated) price in Rupiah */
    val processors = mapOf(
        "Intel Core i3-12100F" to 1_350_000,
        "Intel Core i5-12400F" to 1_900_000,
        "Intel Core i5-13400F" to 2_900_000,
        "Intel Core i5-14600K" to 4_600_000,
        "Intel Core i7-14700K" to 6_300_000,
        "Intel Core i9-14900K" to 8_800_000,
        "AMD Ryzen 5 5500" to 1_250_000,
        "AMD Ryzen 5 5600" to 1_700_000,
        "AMD Ryzen 5 7600" to 3_200_000,
        "AMD Ryzen 7 7800X3D" to 6_800_000,
        "AMD Ryzen 9 9950X" to 10_500_000
    )

    /** Memory (RAM) options mapped to their (estimated) price in Rupiah */
    val memories = mapOf(
        "8GB DDR4 3200MHz Kingston Fury Beast" to 300_000,
        "16GB (2x8GB) DDR4 3200MHz Corsair Vengeance LPX" to 650_000,
        "32GB (2x16GB) DDR4 3600MHz G.Skill Ripjaws V" to 1_300_000,
        "16GB (2x8GB) DDR5 5600MHz Kingston Fury Beast" to 900_000,
        "32GB (2x16GB) DDR5 6000MHz Corsair Vengeance" to 1_700_000,
        "64GB (2x32GB) DDR5 6000MHz G.Skill Trident Z5 RGB" to 3_600_000
    )

    /** Storage options mapped to their (estimated) price in Rupiah */
    val storages = mapOf(
        "512GB SSD NVMe Kingston NV2" to 550_000,
        "1TB SSD NVMe WD Blue SN580" to 950_000,
        "1TB SSD NVMe Samsung 990 Pro" to 1_900_000,
        "2TB SSD NVMe Crucial P3 Plus" to 1_900_000,
        "1TB HDD Seagate BarraCuda 7200RPM" to 700_000,
        "2TB HDD WD Blue 7200RPM" to 950_000
    )

    /** Monitor options mapped to their (estimated) price in Rupiah */
    val monitors = mapOf(
        "21.5\" Samsung S22C310 (FHD 75Hz)" to 1_200_000,
        "24\" LG UltraGear 24GN60R (FHD 144Hz)" to 2_200_000,
        "24.5\" ASUS TUF Gaming VG259Q3A (FHD 180Hz)" to 2_300_000,
        "27\" MSI G274QPF (QHD 170Hz)" to 3_700_000,
        "27\" Samsung Odyssey G5 (QHD 165Hz)" to 3_900_000,
        "32\" Samsung Odyssey G7 (4K 144Hz)" to 8_500_000
    )

    /** Graphics card options mapped to their (estimated) price in Rupiah */
    val graphicsCards = mapOf(
        "NVIDIA GeForce GT 710 2GB" to 650_000,
        "NVIDIA GeForce GTX 1650 4GB" to 2_300_000,
        "NVIDIA GeForce GTX 1080 8GB" to 2_800_000,
        "NVIDIA GeForce RTX 3060 12GB" to 4_500_000,
        "NVIDIA GeForce RTX 4060 8GB" to 4_900_000,
        "NVIDIA GeForce RTX 5060 8GB" to 5_200_000,
        "NVIDIA GeForce RTX 5070 12GB" to 9_500_000,
        "NVIDIA GeForce RTX 5090 32GB" to 45_000_000,
        "AMD Radeon RX 5700 XT 8GB" to 2_800_000,
        "AMD Radeon RX 6600 8GB" to 3_500_000,
        "AMD Radeon RX 7800 XT 16GB" to 8_800_000,
        "AMD Radeon RX 9070 XT 16GB" to 11_500_000
    )
}
