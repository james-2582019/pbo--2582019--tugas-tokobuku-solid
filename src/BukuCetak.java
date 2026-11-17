public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int hargaBase, int beratGram) {
        super(judul, penulis, hargaBase);
        this.beratGram = beratGram;
    }

    private int hitungOngkir() {
        return (int) Math.ceil(beratGram / 500.0) * 5000;
    }

    @Override
    public int getHargaAkhir() {
        return hargaBase + hitungOngkir();
    }

    @Override
    public String getKeterangan() {
        return beratGram + " gram, ongkir " + formatRupiah(hitungOngkir());
    }
}