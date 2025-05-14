package com.example.mvvm_app.Store.presentation.products_screen

import com.example.mvvm_app.Store.domain.model.Product

data class ProductViewState(
    val isLoading: Boolean = false,
    val products:List<Product> = emptyList(),
    val error: String?=null,

)