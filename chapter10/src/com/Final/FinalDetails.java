package com.Final;

public class FinalDetails {
    public static void main(String[] args) {
        new EE().cal();
    }

}

class AA {
    public final double TAX_RATE = 0.03;
    public final double TAX_RATE1;
    public final double TAX_RATE2;

    public AA() {
        TAX_RATE1 = 0.3;
        {
            TAX_RATE2 = 0.13;
        }
    }
}

class BB {
    public static final double TAX_RATE = 0.03;
    public static final double TAX_RATE1;

    static {
        TAX_RATE1 = 98;
    }
}
class DD {
    public final void cal() {
        System.out.println("dddd");
    }
}
class EE extends DD{}
