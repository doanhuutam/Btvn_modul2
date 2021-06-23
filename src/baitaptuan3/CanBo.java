package baitaptuan3;

public class CanBo {
    private String hoten;
    private String ngaysinh;
    private String gipitinh;
    private String diachi;

    public CanBo() {
    }

    public CanBo(String hoten, String ngaysinh, String gipitinh, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gipitinh = gipitinh;
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGipitinh() {
        return gipitinh;
    }

    public void setGipitinh(String gipitinh) {
        this.gipitinh = gipitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoten='" + hoten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", gipitinh='" + gipitinh + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
