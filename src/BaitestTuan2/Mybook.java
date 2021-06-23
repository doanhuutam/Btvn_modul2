package BaitestTuan2;

import java.util.Scanner;

public class Mybook {
    static Book[] books = new Book[0];
   static Scanner scanner = new Scanner(System.in);

    public static void insert() {
        Book book = create();
        Book[] booknew = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            booknew[i] = books[i];

        }
        booknew[books.length] = book;
        books = booknew;

    }


    public static   int fillByName(String Name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(Name)) {
                return i;
            }

        }
        return -1;
    }

    public  static void remove(String Name) {
        int index=fillByName(Name);
        if (index>0){
            Book[] booksNew=new Book[books.length-1];
                for (int i=0;i<books.length-1;i++){
                    if (i<index){

                    }
                }

        }
    }



    private static Book create() {
        System.out.println("nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name:");
        String name = scanner.nextLine();
        System.out.println("nhập publishDate:");
        String publishDate = scanner.nextLine();
        System.out.println("nhập author:");
        String author = scanner.nextLine();
        System.out.println("nhập language:");
        String language = scanner.nextLine();
        System.out.println("nhập averagePrice:");
        float averagePrice = Float.parseFloat(scanner.nextLine());
        Book book = new Book(id, name, publishDate, author, language, averagePrice);
        return book;
    }
}

