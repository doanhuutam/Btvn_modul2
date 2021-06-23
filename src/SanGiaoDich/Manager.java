package SanGiaoDich;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<GiaoDich> list = new ArrayList<>();

    public static void addDat() {
        System.out.println("Ma giao dich");
        int maGiaoDich = Integer.parseInt(scanner.nextLine());
        System.out.println("ngay giaodich");
        int ngayGiaoDich = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập đơn giá ");
        int donGia = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập diện tích ");
        double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập loại đất ");
        String loaiDat = scanner.nextLine();
        list.add(new GiaodichDat(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiDat));
    }

    public static void addNha() {
        System.out.println("ma giao dich");
        int maGiaoDich = Integer.parseInt(scanner.nextLine());
        System.out.println(" ngày giao dịch");
        int ngayGiaoDich = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập đơn giá ");
        int donGia = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập diện tích ");
        double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập loại nhà ");
        String loaiNHa = scanner.nextLine();
        System.out.println("nhập địa chỉ ");
        String diaChi = scanner.nextLine();
        list.add(new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiNHa, diaChi));
    }

    public static void addGiaoDich() {
        while (true) {
            System.out.println("chọn loại giao dịch ");
            System.out.println("1.giao dịch đất");
            System.out.println("2.giao dịch nhà ");
            System.out.println("3.tong giao dich la");
            System.out.println("3.exit");
            int choise = Integer.parseInt(scanner.nextLine());
            if (choise == 3) {
                return;
            }
            switch (choise) {
                case 1:
                    addDat();
                    break;
                case 2:
                    addNha();
                    break;


            }
        }
    }

    public static int tongGiaoDich() {
        return list.size();
    }

    public static void display() {
        for (GiaoDich gg : list
        ) {
            System.out.println(gg);

        }
    }
}
