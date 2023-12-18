package com.callastro.model

import com.google.gson.annotations.SerializedName

data class CommonResponse(

    @SerializedName("status"  ) var status  : Int?    = null,
    @SerializedName("message" ) var message : String? = null,
    @SerializedName("data"    ) var data    : String? = null
)
