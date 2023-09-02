package com.codeblock;

public class CodeBlock {
    public static void main(String[] args) {
        Movie movie1 = new Movie("卧虎藏龙");
        System.out.println("=================");
        Movie movie2 = new Movie("霸王别姬", 45.6);
        System.out.println("================");
        Movie movie3 = new Movie("四面楚歌", 48.5, "江华");


    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开。。。");
        System.out.println("广告开始。。。");
        System.out.println("电影正式开始。。。");

    }

    public Movie(String name) {
        System.out.println( "电影名：" + name);
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("电影名：" + name + "\t" + "价格是：" + price);
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("电影名：" + name + "\t" + "价格是：" + price + "\t" +
                "导演是：" + director);
        this.name = name;
        this.price = price;
        this.director = director;
    }
}

