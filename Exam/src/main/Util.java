package main;

import clients.Gender;

import java.util.Random;

public class Util {

    public static String randomColor(){
        String[] colors = {"Red", "Blue", "Black"};
        return colors[new Random().nextInt(colors.length)];
    }

    public static Gender randomGender(){
        return Gender.values()[new Random().nextInt(Gender.values().length)];
    }

    public static String randomName(){
        String[] names = {"Ivan", "MAriika", "Petur", "Krasi", "Mitko", "Ivanka"};
        return names[new Random().nextInt(names.length)];
    }
}
