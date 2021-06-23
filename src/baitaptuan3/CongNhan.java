package baitaptuan3;

public class CongNhan extends CanBo{
    private String nghanh;
    private String bac;


    public CongNhan(String nghanh, String bac) {
        this.nghanh = nghanh;
        this.bac = bac;
    }

    public CongNhan(String hoten, String ngaysinh, String gipitinh, String diachi, String nghanh, String bac) {
        super(hoten, ngaysinh, gipitinh, diachi);
        this.nghanh = nghanh;
        this.bac = bac;
    }

    public String getNghanh() {
        return nghanh;
    }

    public void setNghanh(String nghanh) {
        this.nghanh = nghanh;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "nghanh='" + nghanh + '\'' +
                ", bac='" + bac + '\'' +
                super.toString()+
                '}';
    }
}
