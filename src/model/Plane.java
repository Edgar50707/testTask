package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private double hours;
    private boolean military;
    private int weight;
    private double wingspan;
    private int topSpeed;
    private int seats;
    private double cost;


    public Plane(String model, String country, int year, double hours, boolean military, int weight, double wingspan, int topSpeed, int seats, double cost) {

        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printInfo(){
        System.out.println(model);
        System.out.println(country);
        System.out.println(year >=1903 && year <= 2021 ? year : "wrong parameter");
        System.out.println(hours >= 0 && hours <= 10000 ? hours : "wrong parameter");
        System.out.println(military == true?"military":"not military");
        System.out.println(weight >= 10000 && weight <= 160000 ? weight : "wrong parameter");
        System.out.println(wingspan >= 10 && wingspan <= 45 ? wingspan : "wrong parameter");
        System.out.println(topSpeed >= 0 && topSpeed <= 1000 ? topSpeed : "wrong parameter");
        System.out.println(seats > 0 ? seats : "wrong parameter");
        System.out.println(cost > 0 ? "Cost " + cost + "$" :"wrong parameter");
    }
}

