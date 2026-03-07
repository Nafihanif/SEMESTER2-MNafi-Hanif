package jobsheet3;

public class Matakuliah {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    // Constructor 1: Tanpa parameter (Default/Empty Constructor)
    // Berguna jika kita ingin membuat objek kosong terlebih dahulu lalu diisi belakangan
    public Matakuliah() {    
    }
    // Constructor 2: Dengan 2 parameter
    // Berguna jika kita baru tahu kode dan nama matakuliah saja
    public Matakuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }
    // Constructor 3: Dengan parameter lengkap (seperti di modul praktikum)
    // Berguna jika data sudah lengkap saat objek dibuat
    public Matakuliah(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}