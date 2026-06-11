package com.example.praktikum1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Tugas1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Memaksa OS Android mematikan sistem Edge-to-Edge liar agar layout tidak kepotong atasnya
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE

        // Mengarahkan ke file XML activity_tugas1
        setContentView(R.layout.activity_tugas1)

        // Inisialisasi komponen View
        val etNim = findViewById<EditText>(R.id.etNim)
        val etNama = findViewById<EditText>(R.id.etNama)
        val etProdi = findViewById<EditText>(R.id.etProdi)
        val btnProses = findViewById<Button>(R.id.btnProses)

        // Set nilai default awal bawaan tugas kamu
        etNim.setText("C030319021")
        etNama.setText("Muhammad Nahli")
        etProdi.setText("Teknik Informatika")

        // Logika memunculkan pop up (Toast) saat tombol PROSES diklik
        btnProses.setOnClickListener {
            val nim = etNim.text.toString().trim()
            val nama = etNama.text.toString().trim()
            val prodi = etProdi.text.toString().trim()

            if (nim.isEmpty() || nama.isEmpty() || prodi.isEmpty()) {
                Toast.makeText(this, "Mohon isi semua data terlebih dahulu!", Toast.LENGTH_SHORT).show()
            } else {
                val pesan = "Halo, perkenalkan saya $nama dengan NIM $nim pada Program Studi $prodi"
                Toast.makeText(this, pesan, Toast.LENGTH_LONG).show()
            }
        }
    }
}