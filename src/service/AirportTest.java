package service;

import model.Plane;

import java.util.Scanner;

public class AirportTest {

    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Plane p1 = service.crate();
        Plane p2 = service.crate();
        Plane p3 = service.crate();
        Plane[] planes = {p1,p2,p3};
        //p1.printInfo();
        //System.out.println("----------------");
        //service.function2(p1);
        //System.out.println("----------------");
        //service.function3(p1,p2);
        //System.out.println("---------------");
        //service.function4(p1,p2);
        System.out.println("---------------");
        //service.function5(p1,p2,p3);
        System.out.println("----------------");
        //service.function6(planes);
        System.out.println("----------------");
        //service.function7(planes);
        System.out.println("---------------");
        //service.function8(planes);
        service.function10(planes);







        //Plane p2 = service.create();
        //Plane p3 = service.create();
        //printInfo();


    }
}
