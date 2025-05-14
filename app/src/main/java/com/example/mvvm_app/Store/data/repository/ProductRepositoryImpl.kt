package com.example.mvvm_app.Store.data.repository

import arrow.core.Either
import com.example.mvvm_app.Store.data.Remote.ProductsApi
import com.example.mvvm_app.Store.data.mapper.toNetworkError
import com.example.mvvm_app.Store.domain.model.NetworkError
import com.example.mvvm_app.Store.domain.model.Product
import com.example.mvvm_app.Store.domain.repository.ProductRepository

class ProductRepositoryImpl constructor(
    private val productsApi: ProductsApi
) : ProductRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
       return  Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toNetworkError() }
    }
}
