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
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
        }
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

        System.out.println("DATA MAHASISWA 1");
        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());


        Mahasiswa06 mhs2 = new Mahasiswa06(
                "Annisa Nabila",
                "2141720160",
                3.25,
                "TI 2L"
        );

        System.out.println("\nDATA MAHASISWA 2");
        mhs2.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs2.nilaiKinerja());


        Mahasiswa06 mhsClevy = new Mahasiswa06(
                "Clevy",
                "254107060120",
                3.85,
                "1G SIB"
        );

        System.out.println("\nDATA MAHASISWA CLEVY");
        mhsClevy.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhsClevy.nilaiKinerja());

    }
}