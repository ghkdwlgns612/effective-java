package com.example.effectivejava.item3.serialize;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

//    직렬화, 역직렬화 시 객체가 변하면 에러발생. 그래서 바껴도 에러가 안뜨게 유연하게 하기위해서 사용할 수 있음.
//    private static final long serialVersionUID = 1L;

    private String isbn;

    private String title;

    private String author;

    private LocalDate published;

    //직렬화하고싶지 않다.
    private transient int numberOfSold;

    //static한 필드는 인스턴스가 아니기 때문에 직렬화 되지 않는다.
//    public static String name;

    public Book(String isbn, String title, String author, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", published=" + published +
                ", numberOfSold=" + numberOfSold +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public int getNumberOfSold() {
        return numberOfSold;
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }
}
