package com.Poly.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
 Worker 丁真 = new Worker("丁真",2500);
  Manager baoguo = new Manager("baoguo", 5000, 2000000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(丁真);
        polyParameter.showEmpAnnual(baoguo);
        polyParameter.testWork(丁真);
        polyParameter.testWork(baoguo);

    }
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e) {
        if(e instanceof Worker) {
            ((Worker) e).work();
        } else if(e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理");
        }
    }
}
