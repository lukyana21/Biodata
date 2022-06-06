package id.lukyana.biodata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNama: EditText = findViewById(R.id.nama)
        val inputUmur: EditText = findViewById(R.id.umur)
        val inputAlamat: EditText = findViewById(R.id.alamat)
        val inputEmail: EditText = findViewById(R.id.email)
        val inputAgama: EditText = findViewById(R.id.agama)
        val btn: Button = findViewById(R.id.submit)
        val validasi: TextView = findViewById(R.id.valid)

        btn.setOnClickListener {
            val nama = inputNama.text.toString()
            val umur = inputUmur.text.toString()
            val alamat = inputAlamat.text.toString()
            val email = inputEmail.text.toString()
            val agama = inputAgama.text.toString()

            if (nama.isBlank() && umur.isBlank() && alamat.isBlank() && email.isBlank() && agama.isBlank()){
                validasi.text = "Harap Isi Data Yang diperlukan!"
            }else if (umur.isBlank()){
                validasi.text = "Umur Tidak Boleh Kosong!"
            }else if (alamat.isBlank()){
                validasi.text = "Alamat Tidak Boleh Kosong!"
            }else if (email.isBlank()){
                validasi.text = "Email Tidak Boleh Kosong!"
            }else if (agama.isBlank()){
                validasi.text = "Agama Tidak Boleh Kosong!"
            }else if (nama.isBlank()){
                validasi.text = "Nama Tidak Boleh Kosong!"
            }else{
                val data = Biodata (
                            "$nama",
                            "$umur",
                            "$alamat",
                            "$email",
                            "$agama"
                        )

                val i = Intent(this@MainActivity, BiodataActivity::class.java)
                i.putExtra(BiodataActivity.EXTRA_BIODATA, data)
                startActivity(i)
            }
        }
    }
}