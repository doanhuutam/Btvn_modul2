package baitaptuan3;

public class NhanVien extends CanBo{
    public NhanVien() {
    }

    public NhanVien(String hoten, String ngaysinh, String gipitinh, String diachi) {
        super(hoten, ngaysinh, gipitinh, diachi);
    }

    @Override
    public String toString() {
        return "NhanVien{}"+super.toString();
    }
}
