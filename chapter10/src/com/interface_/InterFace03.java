package com.interface_;

public class InterFace03 {
    public static void main(String[] args) {
        Mysqldb mysqldb = new Mysqldb();
        t (mysqldb);
        OracdeDB oracdeDB = new OracdeDB();
        t (oracdeDB);

    }
    public static void t (Dbinterfance db) {
        db.connect();
        db.close();
    }
}
