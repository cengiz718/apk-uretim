package com.cengiz.apkuretim

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var sayac = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val yazi = TextView(this).apply {
            text = "APK Hazir - Sayac: 0"
            textSize = 20f
        }

        val buton = Button(this).apply {
            text = "Sayaci Artir"
            setOnClickListener {
                sayac += 1
                yazi.text = "APK Hazir - Sayac: $sayac"
            }
        }

        val kutu = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 96, 48, 48)
            addView(yazi)
            addView(buton)
        }

        setContentView(kutu)
    }
}
