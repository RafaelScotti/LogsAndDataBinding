package com.zanella.logsanddatabinding

import android.util.Log
import android.view.View
import android.widget.Toast

class BindListener {
    fun onClickButton(view: View, firstName:String, lastName: String) {
        Log.i("BindListener", "button clicked!")
        Toast
            .makeText( view.context, "$firstName $lastName", Toast.LENGTH_SHORT )
            .show()
    }
}