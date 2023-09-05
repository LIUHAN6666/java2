package com.hspdeu.homework;

public class homework08 {
    public static void main(String[] args) {
        Color grenn = Color.GREEN;
        grenn.show();
        switch (grenn) {
            case YELLO :
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            default:
                System.out.println("没有匹配到");
        }

    }
}

interface IM {
    public void show();
}

enum Color implements IM {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLO(255, 255, 0),
    GREEN(0, 255, 0);

    private int redValue;
    private int greenValue;
    private int biueValue;

    Color(int redValue, int greenValue, int biueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.biueValue = biueValue;
    }

    @Override
    public void show() {
        System.out.println("属性为：" + redValue + ","
                + greenValue + "," + biueValue);
    }
}
