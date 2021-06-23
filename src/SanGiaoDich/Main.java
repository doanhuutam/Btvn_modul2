package SanGiaoDich;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản lý nhà đất");
            System.out.println("1.THÊM GIAO DỊCH");
            System.out.println("2.TÍNH TỔNG SỐ LƯỢNG");
            System.out.println("3.SHow ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Manager.addGiaoDich();
                    break;
                case 2:
                    Manager.tongGiaoDich();
                    break;
                case 3:
                    Manager.display();
            }
        }
    }
}