package com.example.effectivejava.item3.serialize;

import java.io.*;
import java.time.LocalDate;

public class SerializationExample {

    private void serialize(Book book) {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))){
            out.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Book deserialize() {
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))){
            return (Book) in.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "이펙티브 자바 완벽 공략", "백기선",
                LocalDate.of(2022, 3, 21));
        book.setNumberOfSold(200);

//        Book.name = "jihun";

        SerializationExample example = new SerializationExample();
        example.serialize(book);
//        Book.name = "xxx";
        Book deserialize = example.deserialize();

        System.out.println(book);
        System.out.println(deserialize);
    }
}
