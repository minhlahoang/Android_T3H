package T3H_Buoi3;

public class Main {
    public static void main(String[] args) {
        float r = 13;
        float h = 7; 
        //Khai báo
        HinhTron hinhTron;
        HinhTru hinhTru;
        //Khởi tạo
        hinhTron = new HinhTron(r);
        hinhTru = new HinhTru(r, h);

        System.out.println(hinhTron.dienTich());
        System.out.println(hinhTru.theTich());
    }
}
