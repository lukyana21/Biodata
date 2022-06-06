package id.lukyana.biodata

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Biodata(
    val nama: String,
    val umur: String,
    val alamat: String,
    val email: String,
    val agama: String
): Parcelable
