package T3H_Buoi3;

public class HinhTru extends HinhTron{
    private float chieuCao;

    public float getChieuCao() {
        return chieuCao;
    }

    public HinhTru(float banKinh, float chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public float dienTich() {
        return super.dienTich();
    }

    public float theTich() {
        return dienTich() * chieuCao;
    }
}
