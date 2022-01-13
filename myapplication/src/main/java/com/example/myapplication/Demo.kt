package com.example.myapplication

import android.content.Context
import android.widget.Toast

class Demo {
    companion object {
        fun toastMessager(context: Context, message: String){
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }
    }
}