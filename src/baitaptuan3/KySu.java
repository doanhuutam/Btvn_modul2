package baitaptuan3;

public class KySu extends CanBo{
    private String nghanh;

    public KySu(String nghanh) {
        this.nghanh = nghanh;
    }

    public KySu(String hoten, String ngaysinh, String gipitinh, String diachi, String nghanh) {
        super(hoten, ngaysinh, gipitinh, diachi);
        this.nghanh = nghanh;
    }

    public String getNghanh() {
        return nghanh;
    }

    public void setNghanh(String nghanh) {
        this.nghanh = nghanh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nghanh='" + nghanh + '\'' +
                super.toString()+
                '}';
    }
}
