package main;

import attractions.Attraction;
import beasts.*;
import clients.Client;
import funPark.FunPark;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        FunPark funPark = new FunPark("Krasi`s Fantastic Beasts", "Bul Talantska 53");

        for (int i = 0; i < 2; i++) {
            funPark.addAttraction(new Attraction("Normal Attraction0"+i, new Kraken("Kraken " + i, 3,
                    50, 5), funPark));

            funPark.addAttraction(new Attraction("Normal Attraction1"+i, new Griffin("Griffin " + i, 3,
                    50, 5, Util.randomColor()), funPark));

            funPark.addAttraction(new Attraction("Normal Attraction2"+i, new Dwarf("Dwarf " + i, 3), funPark));

            funPark.addAttraction(new Attraction("Dangerous Attraction0" + i, new Dragon("Dragon"+i, 5,
                    70), funPark));
            funPark.addAttraction(new Attraction("Dangerous Attraction1" + i, new Mermaid("Mermaid"+i,
                    10, 80, 1), funPark));
            funPark.addAttraction(new Attraction("Dangerous Attraction2" + i, new Devil("Devil"+i, 5), funPark));
        }

        for (int i = 0; i < 100; i++) {
            funPark.addClient(new Client(Util.randomName(), new Random().nextInt(81), Util.randomGender()));
        }

        funPark.clientSetAttraction();

        funPark.startAllAttractions();
        System.out.println("Total number of kids: " + funPark.printTotalNumberOfKids());
        System.out.println("Total profit from all attractions " + funPark.totalProfit());
        funPark.printAttractionWithTheMostClients();
        System.out.println("Number of people with bad luck " + funPark.numberOfPeopleWithBadLuck());

    }
}
