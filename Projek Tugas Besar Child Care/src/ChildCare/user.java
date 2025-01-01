package ChildCare;

public class user {
    private String namaAnak;
    private String umur;

    // Perbaikan konstruktor
    public user(String namaAnak, String umur) {
        this.namaAnak = namaAnak;
        this.umur = umur;
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public String getUmur() {
        return umur;
    }

    public void setNamaAnak(String namaAnak) {
        this.namaAnak = namaAnak;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
}
