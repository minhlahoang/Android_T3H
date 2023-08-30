package QuanLyPhuongTien;

public class XeDap extends PhuongTienGiaoThong{
    public XeDap() {
        super();
    }

    public XeDap(String ten, String hangSX, int namSX, int giaTien) {
        super(ten, hangSX, namSX, giaTien);
    }

    @Override
    public String toString() {
        return "XeDap{" +
                "ten='" + ten + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", giaTien=" + giaTien +
                '}';
    }
}
