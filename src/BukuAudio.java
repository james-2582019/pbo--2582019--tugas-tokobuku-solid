public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;
    private double ukuranMB;

    public BukuAudio(String judul, String penulis, int hargaBase, int durasiMenit, double ukuranMB) {
        super(judul, penulis, hargaBase);
        this.durasiMenit = durasiMenit;
        this.ukuranMB = ukuranMB;
    }

    @Override
    public double getUkuran() {
        return ukuranMB;
    }

    @Override
    public int getHargaAkhir() {
        return hargaBase * 90 / 100;
    }

    @Override
    public String getKeterangan() {
        return durasiMenit + " menit, diskon 10%";
    }
}