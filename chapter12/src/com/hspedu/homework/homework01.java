package com.hspedu.homework;

public class homework01 {
    public static void main(String[] args) {
        try {
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println("计算结果是" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确");
        }catch (ArithmeticException e) {
            System.out.println("0000");
        }

    }
    public static double cal(int n1, int n2){
        return n1 / n2;
    }
}

