public abstract class Buku {
    protected String judul;
    protected String penulis;
    protected int hargaBase;

    public Buku(String judul, String penulis, int hargaBase) {
        this.judul = judul;
        this.penulis = penulis;
        this.hargaBase = hargaBase;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getHargaBase() { return hargaBase; }

    public abstract int getHargaAkhir();
    public abstract String getKeterangan(); // Menggantikan logika info spesifik

    protected static String formatRupiah(int nominal) {
        return String.format("Rp%,d", nominal).replace(',', '.');
    }
}