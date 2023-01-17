package ru.jiehk.utils;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static String getRandomGender() {
        Random rand = new Random();
        List<String> givenList = Arrays.asList("Male", "Female", "Other");
        String randomElement = null;
        int randomIndex = rand.nextInt(givenList.size());
        randomElement = givenList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomMonth() {
        Random rand = new Random();
        List<String> givenList = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");
        String randomElement = null;
        int randomIndex = rand.nextInt(givenList.size());
        randomElement = givenList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomDay(String year, String month) {
        String[] monthList = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        int mounthIndex = Arrays.asList(monthList).indexOf(month);
        YearMonth yearMonthObject = YearMonth.of(Integer.parseInt(year), mounthIndex + 1);
        int maxDay = yearMonthObject.lengthOfMonth();
        Random r = new Random();
        int newDay = ThreadLocalRandom.current().nextInt(1, maxDay + 1);
        return String.format("%02d", newDay);
    }

    public static String getRandomHobby() {
        Random rand = new Random();
        List<String> givenList = Arrays.asList("Sports", "Reading", "Music");
        String randomElement = null;
        int randomIndex = rand.nextInt(givenList.size());
        randomElement = givenList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomSubject() {
        Random rand = new Random();
        List<String> givenList = Arrays.asList("Maths", "Chemistry", "Computer Science", "Commerce", "Economics",
                "Accounting", "Arts", "Social Studies", "History", "Civics", "Physics", "English");
        String randomElement = null;
        int randomIndex = rand.nextInt(givenList.size());
        randomElement = givenList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomState() {
        Random rand = new Random();
        List<String> givenList = Arrays.asList("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        String randomElement = null;
        int randomIndex = rand.nextInt(givenList.size());
        randomElement = givenList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomCity(String value) {
        Random rand = new Random();
        String randomElement;
        List<String> givenList = null;
        switch (value) {
            case "NCR":
                givenList = Arrays.asList("Delhi", "Gurgaon", "Noida");
                break;
            case "Uttar Pradesh":
                givenList = Arrays.asList("Agra", "Lucknow", "Merrut");
                break;
            case "Haryana":
                givenList = Arrays.asList("Karnal", "Panipat");
                break;
            case "Rajasthan":
                givenList = Arrays.asList("Jaipur", "Jaiselmer");
                break;
        }
        int randomIndex = rand.nextInt(givenList.size());
        randomElement = givenList.get(randomIndex);
        return randomElement;
    }
}
