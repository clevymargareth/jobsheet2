public class Mahasiswa06 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa06() {

    }

    public Mahasiswa06(String nm, String nim, double ipk, String kls) {
        this.nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {

        Mahasiswa06 mhs1 = new Mahasiswa06();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        System.out.println("\nSetelah Update:");
        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());


        Mahasiswa06 mhs2 = new Mahasiswa06(
            "Annisa Nabila",
            "2141720160",
            3.25,
            "TI 2L"
        );

        mhs2.updateIpk(3.30);

        System.out.println("\nData Mahasiswa 2:");
        mhs2.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs2.nilaiKinerja());

    }
}