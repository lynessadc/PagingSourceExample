package com.example.paginexample

import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner
import com.example.android.codelabs.paging.ui.ViewModelFactory


object Injection {

    /**
     * Creates an instance of [ArticleRepository]
     */
    private fun provideArticleRepository(): ArticleRepository = ArticleRepository()

    /**
     * Provides the [ViewModelProvider.Factory] that is then used to get a reference to
     * [ViewModel] objects.
     */
    fun provideViewModelFactory(owner: SavedStateRegistryOwner): ViewModelProvider.Factory {
        return ViewModelFactory(owner, provideArticleRepository())
    }
}
