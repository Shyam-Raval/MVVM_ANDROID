package com.example.mvvm_app.Store.data.mapper

import coil.network.HttpException
import com.example.mvvm_app.Store.domain.model.ApiError
import com.example.mvvm_app.Store.domain.model.NetworkError
import okio.IOException

fun Throwable.toNetworkError():NetworkError{
    val error = when (this){
        is IOException-> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(
        error = error,
        t = this
    )
}