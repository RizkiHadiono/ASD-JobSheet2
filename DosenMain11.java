public class DosenMain11 {
    public static void main(String[] args) {

        Dosen11 dosen1 = new Dosen11();
        System.out.println("Objek 1 - Konstruktor Default:");
        dosen1.tampilInformasi();

        Dosen11 dosen2 = new Dosen11("VAL", "Vivin Ayu Lestari, S.Pd., M.Kom.", true, 2015, "Praktikum Algoritma dan Sruktur Data");
        System.out.println("Objek 2 - Konstruktor Berparameter:");
        dosen2.tampilInformasi();

        System.out.println("Mengubah status Dosen 1:");
        dosen1.setStatusAktif(true);

        System.out.println("\nMenghitung masa kerja Dosen 2:");
        int masaKerja = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa kerja: " + masaKerja + " tahun");

        System.out.println("\nMengubah bidang keahlian Dosen 2:");
        dosen2.ubahKeahlian("Pembelajaran Mesin");

        System.out.println("\nInformasi setelah perubahan:");
        System.out.println();
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();
    }
}
