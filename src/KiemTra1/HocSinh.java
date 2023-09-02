package KiemTra1;

public class HocSinh {
    private String ten;
    private int tuoi;
    private float diemToan;
    private float diemVan;

    public HocSinh() {
    }

    public HocSinh(String ten, int tuoi, float diemToan, float diemVan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    @Override
    public String toString() {
        return "===THONG TIN HOC SINH===" +
                "\nTên: " + ten +
                "\nTuổi: " + tuoi +
                "\nĐiểm Toán: " + diemToan +
                "\nĐiểm Văn: " + diemVan;
    }

    public float tinhDiemTrungBinh() {
        return (diemToan+diemVan)/2;
    }
}
