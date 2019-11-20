package com.edgetech.autodealer.service;

import org.springframework.stereotype.Component;
import com.edgetech.autodealer.model.Automobile;

import java.util.ArrayList;
import java.util.List;

@Component
public class AutomobileService {
    private static List<Automobile> automobiles = new ArrayList<>();

    static {
        Automobile car1 = new Automobile("2016","Ford", "Mustang", false, "GT Premium");
        Automobile truck1 = new Automobile("2017", "Ford", "F-150", true, "Lariat");
        Automobile car2 = new Automobile("1999", "Ford", "Saleen", false, "S-351");
        Automobile car3 = new Automobile("2003", "Ford", "Mustang", false, "Cobra");
        Automobile car4 = new Automobile("2008", "Pontiac", "G8", true, "GT");

        automobiles.add(car1);
        automobiles.add(car2);
        automobiles.add(car3);
        automobiles.add(car4);
        automobiles.add(truck1);
    }

    public List<Automobile> getAutomobileByMake(String make) {
        List<Automobile> autoByMake = new ArrayList<>();
        for (Automobile automobile : automobiles) {
            if (automobile.getMake().equals(make)) {
                autoByMake.add(automobile);
            }
        }
        return autoByMake;
    }
}
