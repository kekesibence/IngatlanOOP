package hu.petrik;

import java.time.LocalDateTime;

public class RealEstate {
    private String street;
    private String city;
    private int zip;
    private String state;
    private int beds;
    private int baths;
    private int sqFt;
    private String type;
    private LocalDateTime saleDate;
    private int price;
    private double latitude;
    private double longitude;


    public RealEstate(String s){
        String[] datas = s.split(",");
        this.street = datas[0];
        this.city = datas[1];
        this.zip = Integer.parseInt(datas[2]);
        this.state = datas[3];
        this.beds = Integer.parseInt(datas[4]);
        this.baths = Integer.parseInt(datas[5]);
        this.sqFt = Integer.parseInt(datas[6]);
        this.type = datas[7];
        this.price = Integer.parseInt(datas[9]);
        this.latitude = Double.parseDouble(datas[10]);
        this.longitude = Double.parseDouble(datas[11]);

    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public int getBeds() {
        return beds;
    }

    public int getBaths() {
        return baths;
    }

    public int getSqFt() {
        return sqFt;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public int getPrice() {
        return price;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
       return String.format("%-55s %-12s %8s db %11d nm %12d$",
               String.format("%d %s %s", this.zip, this.city, this.street), this.type, this.beds + this.baths, this.sqFt, this.price);
    }
}
