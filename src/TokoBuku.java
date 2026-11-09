public class TokoBuku {

    static int hitungTotal(Buku[] keranjang) {
        int total = 0;
        for (Buku b : keranjang) {
            total += b.hargaAkhir();
        }
        return total;
    }

    public static void main(String[] args) {
        // Buat keempat objek di variabel masing-masing dulu
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        // Semua buku masuk keranjang
        Buku[] keranjang = { cetak1, cetak2, digital, audio };

        // Hanya yang bisa diunduh
        BisaDiunduh[] unduhan = { digital, audio };

        System.out.println("=============== KERANJANG ===============");
        for (Buku b : keranjang) {
            b.tampilkanInfo();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total bayar  : " + Buku.rupiah(hitungTotal(keranjang)));

        System.out.println();
        System.out.println("============== LINK UNDUH ==============");
        for (BisaDiunduh u : unduhan) {
            System.out.println(u.linkUnduh());
        }

        // Percobaan: Buku b = new Buku("X", "Y", 1);
        // Pesan error: java: Buku is abstract; cannot be instantiated
    }
}