import java.util.Locale;

public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public abstract int hargaAkhir();

    public abstract String keterangan();

    // Konkret: subclass tidak boleh meng-override method ini
    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga       : " + rupiah(getHarga()));
        System.out.println("  Keterangan  : " + keterangan());
        System.out.println("  Harga akhir : " + rupiah(hargaAkhir()));
    }

    // Format angka jadi Rp120.000
    protected static String rupiah(int nominal) {
        return "Rp" + String.format(Locale.US, "%,d", nominal).replace(',', '.');
    }
}