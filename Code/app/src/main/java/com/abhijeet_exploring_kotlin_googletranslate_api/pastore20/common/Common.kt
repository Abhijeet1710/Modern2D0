package com.abhijeet_exploring_kotlin_googletranslate_api.pastore20.common

import android.content.Context
import android.widget.Toast

class Common {
    companion object {
        var MODE : String = "LIGHT"
    }

    fun toast(context: Context, msg : String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

}