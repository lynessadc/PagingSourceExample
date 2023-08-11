/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.codelabs.paging.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.paginexample.Article
import com.example.paginexample.ArticleRepository
import kotlinx.coroutines.flow.Flow

private const val ITEMS_PER_PAGE = 5

class ArticleViewModel(
    repository: ArticleRepository,
) : ViewModel() {

    val staticArrayList: ArrayList<Article> = arrayListOf(
        Article(1, "Item 1 "),
        Article(2, "Item 2 "),
        Article(3, "Item 3 "),
        Article(4, "Item 4 "),
        Article(5, "Item 5 "),
        Article(6, "Item 6 "),
        Article(7, "Item 7 "),
        Article(8, "Item 8 "),
        Article(9, "Item 9"),
        Article(10, "Item 10 "),
        Article(11, "Item 11 "),
        Article(12, "Item 12 "),
        Article(13, "Item 13 "),
        Article(14, "Item 14 "),
        Article(15, "Item 15 "),
        Article(16, "Item 16 "),
        Article(17, "Item 17 "),
        Article(18, "Item 18 "),
        Article(19, "Item 19 "),
        Article(20, "Item 20 "),
        Article(21, "Item 21 "),
        Article(22, "Item 22 "),
        Article(23, "Item 23 "),
        Article(24, "Item 24 "),
        Article(25, "Item 25 "),
        Article(26, "Item 26 "),
        Article(27, "Item 27 "),
        Article(28, "Item 28 "),
        Article(29, "Item 29 "),
        Article(30, "Item 30 "),
        Article(31, "Item 31 "),
        Article(32, "Item 32 "),
        Article(33, "Item 33 "),
        Article(34, "Item 34 "),
        Article(35, "Item 35 "),
        Article(36, "Item 36 "),
        Article(37, "Item 37 "),
        Article(10, "Item 10 "),
        Article(11, "Item 11 "),
        Article(12, "Item 12 "),
        Article(13, "Item 13 "),
        Article(14, "Item 14 "),
        Article(15, "Item 15 "),
        Article(16, "Item 16 "),
        Article(17, "Item 17 "),
        Article(18, "Item 18 "),
        Article(19, "Item 19 "),
        Article(20, "Item 20 "),
        Article(21, "Item 21 "),
        Article(22, "Item 22 "),
        Article(23, "Item 23 "),
        Article(24, "Item 24 "),
        Article(25, "Item 25 "),
        Article(26, "Item 26 "),
        Article(27, "Item 27 "),
        Article(28, "Item 28 "),
        Article(29, "Item 29 "),
        Article(30, "Item 30 "),
        Article(31, "Item 31 "),
        Article(32, "Item 32 "),
        Article(33, "Item 33 "),
        Article(34, "Item 34 "),
        Article(35, "Item 35 "),
        Article(36, "Item 36 "),
        Article(37, "Item 37 "),

        )


    /**
     * Stream of immutable states representative of the UI.
     */
    val items: Flow<PagingData<Article>> = Pager(
        config = PagingConfig(pageSize = ITEMS_PER_PAGE, enablePlaceholders = false),
        pagingSourceFactory = { repository.articlePagingSource(staticArrayList) }
    )
        .flow
        .cachedIn(viewModelScope)
}
