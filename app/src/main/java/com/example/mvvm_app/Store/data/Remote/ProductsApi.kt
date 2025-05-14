package com.example.mvvm_app.Store.data.Remote

import com.example.mvvm_app.Store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {
    @GET("products")
    suspend fun getProducts(): List<Product>
}