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

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.cupcake.R

/**
 * A recommended place in the city.
 */
data class Place(
    val name: String,
    val description: String,
    val address: String,
    @DrawableRes val imageResourceId: Int
)

/**
 * A category of recommendations (such as Coffee Shops) and its places.
 */
data class Category(
    @StringRes val nameResourceId: Int,
    val places: List<Place>
)

object DataSource {
    /** Categories of recommended places in Yogyakarta, in display order */
    val categories = listOf(
        Category(
            nameResourceId = R.string.coffee_shops,
            places = listOf(
                Place(
                    name = "Kopi Joss Lik Man",
                    description = "Angkringan legendaris di dekat Stasiun Tugu yang terkenal dengan kopi joss, yaitu kopi hitam yang disajikan bersama bara arang panas.",
                    address = "Jl. Wongsodirjan, Sosromenduran, Gedong Tengen",
                    imageResourceId = R.drawable.kopi_joss_lik_man
                ),
                Place(
                    name = "Klinik Kopi",
                    description = "Kedai sangrai kopi single-origin khas Nusantara di mana barista berbagi cerita di balik setiap biji kopi yang disajikan.",
                    address = "Jl. Kaliurang KM 7.5, Gg. Bima, Sleman",
                    imageResourceId = R.drawable.klinik_kopi
                ),
                Place(
                    name = "Kopi Klotok",
                    description = "Kopi tradisional Jawa dan masakan rumahan yang disajikan di tepi sawah asri dengan pemandangan Gunung Merapi.",
                    address = "Jl. Kaliurang KM 16, Pakem, Sleman",
                    imageResourceId = R.drawable.kopi_klotok
                ),
                Place(
                    name = "Epic Coffee",
                    description = "Kafe bergaya industrial yang luas dengan pilihan kopi spesialti, menu makan sepanjang hari, dan taman outdoor yang asri.",
                    address = "Jl. Palagan Tentara Pelajar No.27, Sleman",
                    imageResourceId = R.drawable.epic_coffee
                ),
                Place(
                    name = "Silol Kopi & Eatery",
                    description = "Tempat nongkrong bertingkat yang populer di kawasan Kotabaru dengan sajian kopi khas, live music, dan dekorasi bergaya vintage.",
                    address = "Jl. Suroto No.2, Kotabaru, Gondokusuman",
                    imageResourceId = R.drawable.silol_kopi
                )
            )
        ),
        Category(
            nameResourceId = R.string.restaurants,
            places = listOf(
                Place(
                    name = "Gudeg Yu Djum",
                    description = "Kuliner ikonik Yogyakarta yang menyajikan gudeg manis autentik yang dimasak menggunakan kayu bakar sejak tahun 1951.",
                    address = "Jl. Wijilan No.167, Panembahan, Kraton",
                    imageResourceId = R.drawable.gudeg_yu_djum
                ),
                Place(
                    name = "Sate Klathak Pak Pong",
                    description = "Warung terkenal di Bantul dengan sajian sate kambing empuk yang hanya dibumbui garam dan dibakar menggunakan besi velg sepeda.",
                    address = "Jl. Sultan Agung No.18, Jejeran, Pleret, Bantul",
                    imageResourceId = R.drawable.sate_klathak_pak_pong
                ),
                Place(
                    name = "The House of Raminten",
                    description = "Restoran Jawa unik yang buka 24 jam, memadukan nuansa keraton, iringan musik gamelan, dan hidangan lokal.",
                    address = "Jl. FM Noto No.7, Kotabaru, Gondokusuman",
                    imageResourceId = R.drawable.house_of_raminten
                ),
                Place(
                    name = "Bakmi Jowo Mbah Gito",
                    description = "Restoran bernuansa kayu klasik di Kotagede yang menyajikan bakmi godhog dan bakmi goreng Jawa yang dimasak di atas tungku arang.",
                    address = "Jl. Nyi Ageng Nis No.9, Rejowinangun, Kotagede",
                    imageResourceId = R.drawable.bakmi_mbah_gito
                ),
                Place(
                    name = "Mangut Lele Mbah Marto",
                    description = "Kuliner rumahan legendaris yang menyajikan lele asap berkuah santan pedas langsung dari dapur tradisional yang dimasak menggunakan tungku kayu.",
                    address = "Ngireng-ireng, Panggungharjo, Sewon, Bantul",
                    imageResourceId = R.drawable.mangut_lele_mbah_marto
                )
            )
        ),
        Category(
            nameResourceId = R.string.parks_nature,
            places = listOf(
                Place(
                    name = "Alun-Alun Kidul",
                    description = "Alun-alun selatan keraton yang ramai dan dikenal dengan sepasang pohon beringin kembar, odong-odong hias, serta jajanan malam.",
                    address = "Patehan, Kraton",
                    imageResourceId = R.drawable.alun_alun_kidul
                ),
                Place(
                    name = "Hutan Pinus Mangunan",
                    description = "Hutan pinus sejuk di perbukitan Dlingo yang dilengkapi pemandangan alam terbuka.",
                    address = "Mangunan, Dlingo, Bantul",
                    imageResourceId = R.drawable.hutan_pinus_mangunan
                ),
                Place(
                    name = "Tebing Breksi",
                    description = "Bekas tambang batu kapur yang disulap menjadi wisata tebing megah dengan pahatan artistik dan panorama matahari terbenam.",
                    address = "Sambirejo, Prambanan, Sleman",
                    imageResourceId = R.drawable.tebing_breksi
                ),
                Place(
                    name = "Pantai Parangtritis",
                    description = "Pantai pasir paling terkenal di Yogyakarta di pesisir Samudra Hindia, bagus untuk menikmati gumuk pasir, dan melihat matahari terbenam.",
                    address = "Parangtritis, Kretek, Bantul",
                    imageResourceId = R.drawable.pantai_parangtritis
                ),
                Place(
                    name = "Kalibiru",
                    description = "Taman wisata alam di Perbukitan Menoreh dengan tempat pemandangan di atas pohon yang menyuguhkan panorama Waduk Sermo.",
                    address = "Hargowilis, Kokap, Kulon Progo",
                    imageResourceId = R.drawable.kalibiru
                )
            )
        ),
        Category(
            nameResourceId = R.string.shopping_centers,
            places = listOf(
                Place(
                    name = "Jalan Malioboro",
                    description = "Jantung keramaian Yogyakarta yang dipenuhi kios batik, penjual suvenir, seniman jalanan, dan jalur pejalan kaki yang luas.",
                    address = "Sosromenduran, Gedong Tengen",
                    imageResourceId = R.drawable.malioboro
                ),
                Place(
                    name = "Pasar Beringharjo",
                    description = "Pasar tradisional bersejarah yang berdiri sejak 1758 dengan pilihan batik, jamu tradisional, dan kerajinan lokal terlengkap.",
                    address = "Jl. Margo Mulyo No.16, Ngupasan, Gondomanan",
                    imageResourceId = R.drawable.pasar_beringharjo
                ),
                Place(
                    name = "Ambarrukmo Plaza",
                    description = "Pusat perbelanjaan modern ternama yang berdiri berdampingan dengan kompleks cagar budaya Pesanggrahan Ambarrukmo.",
                    address = "Jl. Laksda Adisucipto No.80, Caturtunggal, Sleman",
                    imageResourceId = R.drawable.ambarrukmo_plaza
                ),
                Place(
                    name = "Jogja City Mall",
                    description = "Pusat perbelanjaan berdesain unik yang memadukan pilar bergaya Yunani-Romawi dengan sentuhan arsitektur tradisional Jawa.",
                    address = "Jl. Magelang No.6, Sinduadi, Mlati, Sleman",
                    imageResourceId = R.drawable.jogja_city_mall
                ),
                Place(
                    name = "Pakuwon Mall Jogja",
                    description = "Salah satu mal modern terbesar di Yogyakarta yang menghadirkan beragam merek internasional, pilihan kuliner, dan bioskop.",
                    address = "Jl. Ring Road Utara, Condongcatur, Sleman",
                    imageResourceId = R.drawable.pakuwon_mall_jogja
                )
            )
        ),
        Category(
            nameResourceId = R.string.tourist_attractions,
            places = listOf(
                Place(
                    name = "Keraton Ngayogyakarta Hadiningrat",
                    description = "Istana resmi Kasultanan Yogyakarta dari abad ke-18 yang menampilkan arsitektur agung Jawa serta beragam pertunjukan seni dan budaya.",
                    address = "Jl. Rotowijayan No.1, Panembahan, Kraton",
                    imageResourceId = R.drawable.keraton_yogyakarta
                ),
                Place(
                    name = "Taman Sari",
                    description = "Bekas pesanggrahan Kasultanan Yogyakarta yang memiliki kolam pemandian, lorong bawah tanah, dan bangunan bersejarah.",
                    address = "Jl. Taman, Patehan, Kraton",
                    imageResourceId = R.drawable.taman_sari
                ),
                Place(
                    name = "Candi Prambanan",
                    description = "Kompleks candi Hindu megah dari abad ke-9 yang termasuk Situs Warisan Dunia UNESCO.",
                    address = "Jl. Raya Solo–Yogyakarta No.16, Bokoharjo, Prambanan, Sleman",
                    imageResourceId = R.drawable.candi_prambanan
                ),
                Place(
                    name = "Tugu Yogyakarta",
                    description = "Monumen ikonik berwarna putih dan emas yang berdiri di garis sumbu filosofis antara Gunung Merapi, Keraton, dan Laut Selatan.",
                    address = "Jl. Jend. Sudirman, Gowongan, Jetis",
                    imageResourceId = R.drawable.tugu_yogyakarta
                ),
                Place(
                    name = "Museum Ullen Sentalu",
                    description = "Museum ternama di kawasan sejuk Kaliurang yang menyimpan kisah sejarah bangsawan Jawa, koleksi batik, dan karya seni klasik.",
                    address = "Jl. Boyong KM 25, Kaliurang, Pakem, Sleman",
                    imageResourceId = R.drawable.ullen_sentalu
                )
            )
        )
    )
}
