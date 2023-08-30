package T3H_Buoi3;

public class HinhTron {
    /*
    * [<Phạm vi truy cập>] [static] <Kiểu dữ liệu> <Tên thuộc tính>;
    * */
    protected float banKinh;

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    /*i
                * [<Phạm vi truy cập>] [static] <Kiểu dữ liệu trả về>
                 <Tên phuơng thức>([<Kiểu dữ liệu> <Tên tham số>...) {}
                *
                * */
    public float chuVi() {
        return (float) (banKinh *2 * Math.PI);
    }
    public float dienTich() {
        return (float) (banKinh*banKinh * Math.PI);
    }
}
