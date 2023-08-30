public class bai30_oop1 {
    public static void main(String[] args) {
        //khởi tạo đối tượng thuộc class sinhvien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2= new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Tèo", 10);
    }
}
