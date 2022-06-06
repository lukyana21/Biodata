package id.lukyana.biodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val Biodata: TextView = findViewById(R.id.isiBiodata)

        val kiriman = intent.getParcelableExtra<Biodata>(EXTRA_BIODATA) as Biodata
        Biodata.text =
            "Nama dari Orang ini adalah ${kiriman.nama}, ia beralamat di ${kiriman.alamat}, " +
                    "umurnya saat ini berusia ${kiriman.umur} tahun, Agamanya ${kiriman.agama}, " +
                    "dan email pribadinya ${kiriman.email}"
    }

    companion object {
        const val EXTRA_BIODATA = "yuhuu"
    }
}