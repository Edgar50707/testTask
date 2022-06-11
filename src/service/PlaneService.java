package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {
    public Plane crate(){
        Scanner c = new Scanner(System.in);
        System.out.println("enter model");
        String model = c.next();
        System.out.println("enter country");
        String country = c.next();
        System.out.println("enter year");
        int year = c.nextInt();
        System.out.println("enter hours");
        double hours = c.nextDouble();
        System.out.println("enter is military true/false");
        boolean military = c.nextBoolean();
        System.out.println("weight");
        int weight = c.nextInt();
        System.out.println("enter wingspan");
        double wingspan = c.nextDouble();
        System.out.println("enter top speed");
        int topSpeed = c.nextInt();
        System.out.println("enter seats");
        int seats = c.nextInt();
        System.out.println("enter cost");
        double cost = c.nextDouble();
        return new Plane(model,country,year,hours,military,weight,wingspan,topSpeed,seats,cost);

    }
    public void function2(Plane p1){
        if(p1.isMilitary() == true){
            System.out.println("Cost " + p1.getCost() + "$" + " Top Speed " + p1.getTopSpeed());
        }else {
            System.out.println("Model " + p1.getModel() + " Country " + p1.getCountry());
        }

    }
    public int function3(Plane p1, Plane p2){
        if(p1.getYear() > p2.getYear()){
            return p1.getYear();
        }else if(p1.getYear() == p2.getYear()){
            return p2.getYear();
        }
        return 0;
    }
    public String function4(Plane p1,Plane p2){
        if(p1.getWingspan() > p2.getWingspan()){
            return p1.getModel();
        }else if (p1.getWingspan() == p2.getWingspan()){
            return p2.getModel();
        }
        return null;
    }
    public void function5(Plane p1,Plane p2,Plane p3){
        if(p1.getSeats() < p2.getSeats() && p1.getSeats() < p3.getSeats() || p1.getSeats() == p2.getSeats() && p2.getSeats() == p3.getSeats() ) {
            System.out.println(p1.getModel());
        }else if(p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats()){
            System.out.println(p2.getModel());
        }else {
            System.out.println(p3.getModel());
        }
    }
    public void function6(Plane[] planes){
        for(Plane p : planes){
            if(p.isMilitary() != true){
                System.out.println(p.getModel());
            }
        }
    }
    public void function7(Plane[] planes){
        for(Plane p : planes){
            if(p.isMilitary() == true && p.getHours() > 100){
                System.out.println(p.getModel());
            }
        }
    }
    public String function8(Plane[] planes){
        String model = planes[0].getModel();
        int minWeight = planes[0].getWeight();
        for(int i = 0; i < planes.length; i++){
            if(planes[i].getWeight() <= minWeight){
                minWeight = planes[i].getWeight();
                model = planes[i].getModel();
            }
        }
        return model;
    }
    /*
    public void function10(Plane[] planes){
        String[] s = new String[planes.length];
        int[] l = new int[planes.length];
        for (int i = 0; i < planes.length; i++) {
            int minYear = planes[i].getYear();
            String model = planes[i].getModel();
            s[i] = model;
            l[i] = minYear;
        }
        for (int i = 0; i < s.length; i++) {

        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);

        }
    }
    
     */


}
