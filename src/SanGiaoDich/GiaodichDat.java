package SanGiaoDich;

public class GiaodichDat extends GiaoDich{
    public GiaodichDat() {
    }

    public GiaodichDat(int maGiaoDich, int ngayGiaoDich, int donGia, double dienTich, String loai) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich, loai);
    }

    @Override
    public String toString() {
        return "GiaodichDat{}"+super.toString();
    }
}
