package baitaptuan3;

import java.util.Scanner;

public class MainQlcb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý công nhân");
            System.out.println("1.Thêm cán bộ ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Xoá nhân viên theo tên.");
            System.out.println("4. Edit nhân viên theo tên.");
            System.out.println("5. Hiển thị thông tin về danh sách các cán bộ");
            System.out.println("6. Sắp xếp nhân viên theo tên.");
            System.out.println("7. tìm kiếm toàn bộ cán bộ theo ngành(cả nhân viên và kỹ sư)");
            System.out.println("8.Exit");
            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    System.out.println("    1.Thêm Nhân viên ");
                    System.out.println("    2.Thêm công nhân ");
                    System.out.println("    3.Thêm kỹ sư ");
                    int choise2 = Integer.parseInt(scanner.nextLine());

            }
        }
    }
}

