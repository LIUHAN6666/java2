package com.hspedu.homework;

import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News("新冠人数千万"));
        list.add(new News("放生"));
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
         News news  = (News)list.get(i);

            System.out.println(processTitle(news.getTitle()));
        }
    }

    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if (title.length() > 5) {
            return title.substring(0, 5) + "...";
        } else {
            return title;
        }
    }

}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
