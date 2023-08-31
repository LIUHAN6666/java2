package com.encapsulation;

    public class Accout {
        private String name;
        private double blance;
        private String pwd;
        public Accout() {

        }
        public Accout(String name, double balance, String pwd) {
            this.setName(name);
            this.setBlance(balance);
            this.setPwd(pwd);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name.length() >= 2 && name.length() <= 4) {
                this.name = name;
            } else {
                System.out.println("长度为2 3 4位");
                this.name = "保国";
            }
        }

        public double getBlance() {
            return blance;
        }

        public void setBlance(double blance) {
            if (blance > 20) {
                this.blance = blance;
            } else {
                System.out.println("金额必须大于20，否则默认为0");
            }
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            if (pwd.length() == 6) {
                this.pwd = pwd;
            } else {
                System.out.println("密码必须6位，否则为000000");
                this.pwd = "000000";
            }

        }

        public void showinfo() {
            System.out.println("name=" + name + " " + "余额=" + blance + " " +
                    "密码=" + pwd);
        }
           // if() {
            //System.out.println("name=" + "余额=" + blance + "密码="
              //      + pwd);
       // } else {
         //       System.out.println("无权查看");
           // }

    }


