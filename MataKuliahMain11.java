public class MataKuliahMain11 {
    public static void main(String[] args) {
  
        MataKuliah11 mk1 = new MataKuliah11();
        System.out.println("Objek 1 - Konstruktor Default:");
        mk1.tampilInformasi();

        MataKuliah11 mk2 = new MataKuliah11("IF101", "Pemrograman Java", 3, 6);
        System.out.println("Objek 2 - Konstruktor Berparameter:");
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(5);
        mk2.tampilInformasi();
    }
}
