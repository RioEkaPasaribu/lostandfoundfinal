package com.ifs21033.lostandfound.data.remote.response

import com.google.gson.annotations.SerializedName

data class DelcomResponse(

    @field:SerializedName("success")
    val success: Boolean,

    @field:SerializedName("message")
    val message: String
)
