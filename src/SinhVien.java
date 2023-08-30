public class SinhVien {
    //thuộc tính
    private String hoTen;
    private double diem;

    //Constructor mặc định: khởi tạo giá trị mặc đinh ngay khi đối tượng vừa tạo ra
    /*public SinhVien() {
        hoTen = "no name";
        diem    = 0.0;
    }*/

    //Alt + ins : phím tắt tạo constructor
    public SinhVien() {
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //phuong thức (các hàm)
    //Phương thức không có kiểu trả về
    public void hienThiThongTin() {
        System.out.println(hoTen + " : " + diem);
    }
}
