package com.hspedu.arraysmethod;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book0[] books = new Book0[4];
        books[0] = new Book0("红楼梦", 213);
        books[1] = new Book0("三国演义",184);
        books[2] = new Book0("西游记",120);
        books[3] = new Book0("水浒传",212);
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book0 book1 = (Book0) o1;
                Book0 book2 = (Book0) o2;
                double priceVal = book2.getPrice() - book1.getPrice();
                if (priceVal > 0) {
                    return 1;

                }else if(priceVal < 0) {
                    return -1;

                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
 class Book0 {
    private String name ;
    private double price;

    public Book0(String name, double price) {
        this.name = name;
        this.price = price;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     @Override
     public String toString() {
         return "Book0{" +
                 "name='" + name + '\'' +
                 ", price=" + price +
                 '}';
     }
 }