package com.example.loadquestion

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {

    // İstek kodu için bir sabit tanımlayın
    private val KAMERA_ISTEK_KODU = 100

    val storage = FirebaseStorage.getInstance()
    val storageReference = storage.reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addQuestion(view:View){

    }

}