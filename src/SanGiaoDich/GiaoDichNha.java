package SanGiaoDich;

public class GiaoDichNha extends GiaoDich{
    private String add;

    public GiaoDichNha(String add) {
        this.add = add;
    }

    public GiaoDichNha(int maGiaoDich, int ngayGiaoDich, int donGia, double dienTich, String loai, String add) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich, loai);
        this.add = add;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "add='" + add + '\'' +super.toString()+
                '}';
    }
}
