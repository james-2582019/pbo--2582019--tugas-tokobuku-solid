public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int hargaBase, double ukuranMB) {
        super(judul, penulis, hargaBase);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public double getUkuran() {
        return ukuranMB;
    }

    @Override
    public int getHargaAkhir() {
        return hargaBase * 80 / 100;
    }

    @Override
    public String getKeterangan() {
        return ukuranMB + " MB, diskon 20%";
    }
}