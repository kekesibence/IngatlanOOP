package hu.petrik;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RealEstates {

    private List<RealEstate> realEstateList;


    public RealEstates(String fileName){
        realEstateList = new LinkedList<>();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            String line = br.readLine();
            while (line != null){
                realEstateList.add(new RealEstate(line));
                line = br.readLine();
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.printf(e.getMessage());
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }

    public long getSalesNumber() {
        return realEstateList.stream().count();
    }

    public RealEstate getBiggestRealEstate() {
        return realEstateList.stream()
                .max(Comparator.comparingInt(ingatlan -> ingatlan.getSqFt()))
                .get();
    }

    public int getBiggestRealEstateFt() {
        return this.realEstateList.stream()
                .map(ingatlan -> ingatlan.getSqFt())
                .max(Integer::compareTo)
                .get();
    }

    public long getSalesSum() {
        return realEstateList.stream()
                .mapToInt(R -> R.getPrice())
                .sum();
    }

    public long getCountOfRealEstateWithoutSize() {
        return realEstateList.stream()
                .filter(ingatlan -> ingatlan.getSqFt() == 0)
                .count();
    }

    public boolean isSaledRealEstateInCity(String city) {
        return this.realEstateList.stream()
                .anyMatch(ingatlan -> ingatlan.getCity().equals(city));
    }

    public long getCountOfSaledRealEstateInCity(String city) {
        return this.realEstateList.stream()
                .filter(ingatlan -> ingatlan.getCity().equals(city))
                .count();
    }

    public List<RealEstate> getSalesInCity(String city) {
        return this.realEstateList.stream()
                .filter(ingatlan -> ingatlan.getCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<String> getSortedCities() {
        return realEstateList.stream()
                .map(ingatlan -> ingatlan.getCity())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> getTypes() {
        return realEstateList.stream()
                .map(ingatlan -> ingatlan.getType())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<RealEstate> getMostExpensiveRealEstates(int number){
        return realEstateList.stream()
                .sorted( Comparator.comparing(RealEstate::getPrice).reversed())
                .limit(number)
                .collect(Collectors.toList());
    }

    public List<RealEstate> getLeastExpensiveRealEstates(int number){
        return realEstateList.stream()
                .sorted( Comparator.comparing(RealEstate::getPrice))
                .limit(number)
                .collect(Collectors.toList());
    }


    @Override
    public String toString() {
        String s = "";
        for (RealEstate re: this.realEstateList) {
            s+= re + "\n";
        }
        return s;
    }
}
