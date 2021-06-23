package BaitestTuan2;

import java.util.Arrays;

public class Book implements Ibook ,Comparable<Book> {
    private int id;
    private String Name;
    private String PublishDate;
    private String Author;
    private String Language;
    private float money;

    public Book() {
    }

    public Book(int id, String name, String publishDate, String author, String language, float money) {
        this.id = id;
        Name = name;
        PublishDate = publishDate;
        Author = author;
        Language = language;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }


    @Override
    public void Display() {
        System.out.println("Book{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", PublishDate='" + PublishDate + '\'' +
                ", Author='" + Author + '\'' +
                ", Language='" + Language + '\'' +
                ", money=" + money +
                '}');
    }


    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}

