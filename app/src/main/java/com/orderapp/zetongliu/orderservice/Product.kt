package com.orderapp.zetongliu.orderservice

//import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Product(

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("price")
    var price: String? = null,

)