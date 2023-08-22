package test;

public class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }

    public static void main(String[] args) {
        Noodle spaghetti = new Spaghetti();
        Noodle ramen = new Ramen();
        Noodle pho = new Pho();
       // Noodle noodle = new Noodle(spaghetti.lengthInCentimeters, spaghetti.widthInCentimeters, spaghetti.shape, spaghetti.texture);
        System.out.println(spaghetti.lengthInCentimeters);
        System.out.println(ramen.shape);
        System.out.println(spaghetti.getCookPrep());
    }

}
