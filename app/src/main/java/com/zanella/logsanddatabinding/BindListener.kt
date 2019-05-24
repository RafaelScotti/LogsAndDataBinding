package com.zanella.logsanddatabinding

import android.view.View
import android.widget.Toast

class BindListener {
    fun onClickButton(view: View, firstName:String, lastName: String) {
        Toast
            .makeText( view.context, "$firstName $lastName", Toast.LENGTH_SHORT )
            .show()
    }
}