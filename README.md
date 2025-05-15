Lets Learn MVVM architecture in android:

Layers if architecture:
![image](https://github.com/user-attachments/assets/002fe977-0543-4010-8e9c-987282ee6cdc)



-> we divide project into feature and each feature pakage will have these 3 layers


-> the main pakage in this app in store app.

-> once all the layer's pakage is made , we start form domain layer , as domain layer is needed in both , data as well as presentation layer

->DOMAIN LAYER:

 1.NetworkError.kt:
 
  Defines a NetworkError data class to represent API-related errors.
  Includes an optional Throwable for debugging actual exceptions.
  Contains an enum class ApiError to list common API error types:
    a.NetworkError
    b.UnknownResponse
    c.UnknownError
    
2.Product.kt:

  Defines a Product data class to hold all product information:
  id, title, price, description, category, image, rating.
  
  Defines a nested Rating data class:
  Contains rate (average score) and count (number of ratings).
  
3.ProductRepository.kt:

  Declares a ProductRepository interface in the domain layer.
  
  Has a suspend fun getProducts() method that:
  Returns Either<NetworkError, List<Product>>
  
  This means it returns either an error or a successful product list.
  
  Only abstraction is written here (no logic or data fetching).


->Data LAYER:

