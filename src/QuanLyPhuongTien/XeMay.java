package QuanLyPhuongTien;

public class XeMay extends PhuongTienCoDongCo implements CoTinhThue{
    public XeMay() {
    }

    public XeMay(String ten, String hangSX, int namSX, int giaTien, float dungTichXiLanh) {
        super(ten, hangSX, namSX, giaTien, dungTichXiLanh);
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "dungTichXiLanh=" + dungTichXiLanh +
                ", ten='" + ten + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", giaTien=" + giaTien +
                '}';
    }

    @Override
    public float tinhThue() {
        return (float) (giaTien * 0.05);
    }
}
