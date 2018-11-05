package ariepbudiman.com.android_uts.model;

public class kota {
    private int id;
    private String nama;

    public kota(String nama) {
        this.nama = nama;
    }

//    public Mahasiswa(String nama) {
//        this.nama = nama;
////        this.tempat_lahir = tempat_lahir;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

//    public String getTempat_lahir() {
//        return tempat_lahir;
//    }
//
//    public void setTempat_lahir(String tempat_lahir) {
//        this.tempat_lahir = tempat_lahir;
//    }
}
