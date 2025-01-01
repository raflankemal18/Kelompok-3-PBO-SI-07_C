package ChildCare;

public class InfoProvider {

    public String getInfoImunisasi(int umur) {
        if (umur == 3) {
            return "Imunisasi untuk umur 3 tahun: Dosis booster DPT, Polio, dan Campak.";
        } else if (umur == 4) {
            return "Imunisasi untuk umur 4 tahun: Vaksin Influenza tahunan.";
        } else if (umur == 5) {
            return "Imunisasi untuk umur 5 tahun: Booster Tetanus-difteri (Tdap).";
        } else if (umur == 6) {
            return "Imunisasi untuk umur 6 tahun: Vaksin Campak, Polio.";
        } else if (umur == 7) {
            return "Imunisasi untuk umur 7 tahun: Tidak ada imunisasi wajib, tetapi vaksin tambahan seperti HPV bisa dipertimbangkan.";
        } else if (umur == 8) {
            return "Imunisasi untuk umur 8 tahun: Vaksin Influenza tahunan.";
        } else if (umur == 9) {
            return "Imunisasi untuk umur 9 tahun: Tidak ada imunisasi wajib. Pastikan vaksinasi dasar lengkap.";
        } else if (umur == 10) {
            return "Imunisasi untuk umur 10 tahun: Pertimbangkan vaksin HPV untuk mencegah kanker serviks (bagi anak perempuan).";
        } else if (umur == 11) {
            return "Imunisasi untuk umur 11 tahun: Vaksin HPV (dosis pertama) dan Tetanus-difteri (Tdap).";
        } else if (umur == 12) {
            return "Imunisasi untuk umur 12 tahun: Vaksin HPV (dosis kedua) dan booster Tetanus-difteri.";
        } else {
            return "Data imunisasi untuk umur ini belum tersedia.";
        }
    }

    public String getInfoPertumbuhan(int umur) {
        if (umur == 3) {
            return "Pertumbuhan umur 3 tahun: Mampu berbicara dalam kalimat sederhana dan memiliki keterampilan motorik dasar.";
        } else if (umur == 4) {
            return "Pertumbuhan umur 4 tahun: Keterampilan sosial mulai berkembang, termasuk bermain dengan teman.";
        } else if (umur == 5) {
            return "Pertumbuhan umur 5 tahun: Mampu mengenali huruf dan angka. Perkembangan motorik halus meningkat.";
        } else if (umur == 6) {
            return "Pertumbuhan umur 6 tahun: Gigi susu mulai diganti dengan gigi permanen.";
        } else if (umur == 7) {
            return "Pertumbuhan umur 7 tahun: Mulai lebih mandiri dan memiliki kemampuan logika yang lebih baik.";
        } else if (umur == 8) {
            return "Pertumbuhan umur 8 tahun: Otot mulai berkembang. Fokus belajar dan daya konsentrasi meningkat.";
        } else if (umur == 9) {
            return "Pertumbuhan umur 9 tahun: Perubahan tubuh awal dari pubertas bisa mulai terjadi.";
        } else if (umur == 10) {
            return "Pertumbuhan umur 10 tahun: Anak mulai memahami konsep tanggung jawab dan mampu berpikir abstrak.";
        } else if (umur == 11) {
            return "Pertumbuhan umur 11 tahun: Pubertas awal dimulai pada beberapa anak. Perubahan hormonal mulai terlihat.";
        } else if (umur == 12) {
            return "Pertumbuhan umur 12 tahun: Perubahan hormonal lebih jelas. Perbedaan fisik antara laki-laki dan perempuan semakin terlihat.";
        } else {
            return "Data pertumbuhan untuk umur ini belum tersedia.";
        }
    }

    public String getInfoNutrisi(int umur) {
        if (umur == 3) {
            return "Nutrisi umur 3 tahun: Kalsium untuk pertumbuhan tulang dan gigi. Cukupi kebutuhan serat.";
        } else if (umur == 4) {
            return "Nutrisi umur 4 tahun: Protein dari ikan dan daging, serta vitamin A untuk kesehatan mata.";
        } else if (umur == 5) {
            return "Nutrisi umur 5 tahun: Asupan zat besi untuk mencegah anemia, serta vitamin D.";
        } else if (umur == 6) {
            return "Nutrisi umur 6 tahun: Protein untuk mendukung perkembangan otak.";
        } else if (umur == 7) {
            return "Nutrisi umur 7 tahun: Karbohidrat kompleks untuk energi saat belajar dan bermain.";
        } else if (umur == 8) {
            return "Nutrisi umur 8 tahun: Cukupi kebutuhan kalsium dan fosfor untuk pertumbuhan tulang.";
        } else if (umur == 9) {
            return "Nutrisi umur 9 tahun: Tambahkan sumber omega-3 untuk kesehatan otak.";
        } else if (umur == 10) {
            return "Nutrisi umur 10 tahun: Penuhi kebutuhan vitamin B untuk energi dan metabolisme.";
        } else if (umur == 11) {
            return "Nutrisi umur 11 tahun: Makanan tinggi serat untuk mendukung sistem pencernaan.";
        } else if (umur == 12) {
            return "Nutrisi umur 12 tahun: Kalsium dan Vitamin D untuk pertumbuhan tulang.";
        } else {
            return "Data nutrisi untuk umur ini belum tersedia.";
        }
    }
}
