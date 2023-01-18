package ru.jiehk.utils;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    static List<String> monthsList = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December");

    public static String getRandomGender() {
        Random rand = new Random();
        List<String> gendersList = Arrays.asList("Male", "Female", "Other");
        String randomElement = null;
        int randomIndex = rand.nextInt(gendersList.size());
        randomElement = gendersList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomMonth() {
        Random rand = new Random();
        String randomElement = null;
        int randomIndex = rand.nextInt(monthsList.size());
        randomElement = monthsList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomDay(String year, String month) {
        YearMonth yearMonthObject = YearMonth.of(Integer.parseInt(year), monthsList.indexOf(month) + 1);
        int newDay = ThreadLocalRandom.current().nextInt(1, yearMonthObject.lengthOfMonth() + 1);
        return String.format("%02d", newDay);
    }

    public static String getRandomHobby() {
        Random rand = new Random();
        List<String> hobbiesList = Arrays.asList("Sports", "Reading", "Music");
        String randomElement = null;
        int randomIndex = rand.nextInt(hobbiesList.size());
        randomElement = hobbiesList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomSubject() {
        Random rand = new Random();
        List<String> subjectsList = Arrays.asList("Maths", "Chemistry", "Computer Science", "Commerce", "Economics",
                "Accounting", "Arts", "Social Studies", "History", "Civics", "Physics", "English");
        String randomElement = null;
        int randomIndex = rand.nextInt(subjectsList.size());
        randomElement = subjectsList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomState() {
        Random rand = new Random();
        List<String> statesList = Arrays.asList("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        String randomElement = null;
        int randomIndex = rand.nextInt(statesList.size());
        randomElement = statesList.get(randomIndex);
        return randomElement;
    }

    public static String getRandomCity(String value) {
        Random rand = new Random();
        String randomElement;
        List<String> citiesList = null;
        switch (value) {
            case "NCR":
                citiesList = Arrays.asList("Delhi", "Gurgaon", "Noida");
                break;
            case "Uttar Pradesh":
                citiesList = Arrays.asList("Agra", "Lucknow", "Merrut");
                break;
            case "Haryana":
                citiesList = Arrays.asList("Karnal", "Panipat");
                break;
            case "Rajasthan":
                citiesList = Arrays.asList("Jaipur", "Jaiselmer");
                break;
        }
        int randomIndex = rand.nextInt(citiesList.size());
        randomElement = citiesList.get(randomIndex);
        return randomElement;
    }
}
