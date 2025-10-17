package com.example.proyek1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.proyek1.ui.theme.Proyek1Theme // Sesuaikan dengan nama tema Anda

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Proyek1Theme { // Sesuaikan dengan nama tema Anda
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // PANGGIL FUNGSINYA DI SINI
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}