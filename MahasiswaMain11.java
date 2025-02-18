public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasiswa11 Mhs1 = new Mahasiswa11();
        Mhs1.nama = "Muhammad Ali Farhan";
        Mhs1.nim = "2241720171";
        Mhs1.kelas = "SI 2J";
        Mhs1.ipk = 3.55;

        Mhs1.tampilkanInformasi();
        Mhs1.ubahKelas("SI 2K");
        Mhs1.updateIpk(3.60);
        Mhs1.tampilkanInformasi();

        Mahasiswa11 Mhs2 = new Mahasiswa11("Annisa Nabila","2241720160", 3.25, "TI 2L");
        Mhs2.updateIpk(3.30);
        Mhs2.tampilkanInformasi();

        Mahasiswa11 MhsRizki = new Mahasiswa11("Mokhamad Rizki Hadiono Singgih","244107020198", 3.67,"TI 1F");
        MhsRizki.tampilkanInformasi();
    }
}
