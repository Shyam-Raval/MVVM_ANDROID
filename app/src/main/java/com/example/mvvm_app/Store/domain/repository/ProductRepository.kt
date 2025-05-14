package com.example.mvvm_app.Store.domain.repository

import arrow.core.Either
import com.example.mvvm_app.Store.domain.model.NetworkError
import com.example.mvvm_app.Store.domain.model.Product

interface ProductRepository {
    suspend fun getProducts(): Either<NetworkError,List<Product>>   //Either<error , expected value>
}