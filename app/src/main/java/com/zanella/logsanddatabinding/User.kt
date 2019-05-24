package com.zanella.logsanddatabinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


open class User (val firstName: String, val lastName: String, val age: Int = 20, val isAdult: Boolean = true ) {
    fun fullName () : String = String.format("%s %s", firstName, lastName)
}