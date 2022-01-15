package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car,CarOfData> car=new HashMap<>();
        car.put(new Car(1,007),new CarOfData(2020,"Mersedes",20000000,"black"));
        car.put(new Car(2,003),new CarOfData(2021,"Porche",30000000,"white"));
        car.put(new Car(3,001),new CarOfData(2022,"BMW",70000000,"purple"));
        for (Map.Entry iterate:car.entrySet()) {
            System.out.println(iterate.getKey()+" "+iterate.getValue());
        }
    }
}
