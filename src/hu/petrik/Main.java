package hu.petrik;

import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
        RealEstates RE = new RealEstates("realestatetransactions.csv");
        //System.out.println(RE);
        String city = "SACRAMENTO";
        int number = 5;
       // System.out.println("1. feladat: " + RE.getSalesNumber() + " db");
       // System.out.println("2. feladat: : \n" + RE.getBiggestRealEstate());
       // System.out.println("3. feladat: " + RE.getSalesSum() + " $");
       // System.out.println("4. feladat: " + RE.getCountOfRealEstateWithoutSize() + " db");
       // System.out.println("5. feladat: Sales in " + city + ": "+ RE.getCountOfSaledRealEstateInCity(city));
       /* System.out.printf("8.feladat");
        for (RealEstate varos :RE.getSalesInCity(city)) {
            System.out.println(varos);
        }*/
        /*System.out.println("9. feladat: ");
        for (String varos :RE.getSortedCities()) {
            System.out.printf(varos + "\n");
        }*/
        /*System.out.println("10.feladat");
        for (String varos :RE.getTypes()) {
            System.out.printf(varos + "\n");
        }*/
        /*System.out.printf("11. feladat: ");
        for (RealEstate varos :RE.getMostExpensiveRealEstates(number)) {
            System.out.printf(varos + "\n");
        }*/
        /*System.out.printf("12. feladat: ");
        for (RealEstate varos :RE.getLeastExpensiveRealEstates(number)) {
            System.out.printf(varos + "\n");
        }*/
    }
}
