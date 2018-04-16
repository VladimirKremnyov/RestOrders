package restOrders.utils;

import restOrders.entity.Order;
import restOrders.entity.Requirements;

import java.util.*;

public class OrderGenerator {

    /*  ORDERS
        private long id;
        private String managerName;
        private String organization;
        private int numberOfAthletes;
        private Requirements requirements;
        private String country;
        private String status;
     */

    /* REQUIREMENTS
        private boolean trainings;
        private boolean sauna;
        private boolean gym;
        private int numberOfTrainingsSession;
     */

    private static List<String> managerNamesSet = new ArrayList<>();
    private static List<String> organizationNamesList = new ArrayList<>();
    private static List<String> countriesNamesList = new ArrayList<>();
    private static List<String> statusesNamesList = new ArrayList<>();

    static {

        managerNamesSet.add("Tommy");
        managerNamesSet.add("Kate");
        managerNamesSet.add("Rudolph");
        managerNamesSet.add("Konstantin");
        managerNamesSet.add("Leo");
        managerNamesSet.add("Mike");
        managerNamesSet.add("Lola");
        managerNamesSet.add("Robert");
        managerNamesSet.add("Tanya");
        managerNamesSet.add("Maria");
        managerNamesSet.add("Leopold");
        managerNamesSet.add("Tanisha");
        managerNamesSet.add("Alex");
        managerNamesSet.add("Vladimir");
        managerNamesSet.add("Elizabeth");
        managerNamesSet.add("Ronan");
        managerNamesSet.add("Catherine");
        managerNamesSet.add("Leonardo");
        managerNamesSet.add("Lora");
        managerNamesSet.add("Mila");

        organizationNamesList.add("TMZ");
        organizationNamesList.add("Coca-Cola");
        organizationNamesList.add("mrPropper");
        organizationNamesList.add("Milka");
        organizationNamesList.add("Google");
        organizationNamesList.add("Yandex");
        organizationNamesList.add("Ford");
        organizationNamesList.add("BMW");
        organizationNamesList.add("British Airlines");
        organizationNamesList.add("Wayne Enterprise");

        countriesNamesList.add("Ukraine");
        countriesNamesList.add("USA");
        countriesNamesList.add("China");
        countriesNamesList.add("Italy");
        countriesNamesList.add("Canada");
        countriesNamesList.add("France");
        countriesNamesList.add("England");
        countriesNamesList.add("Romania");
        countriesNamesList.add("German");
        countriesNamesList.add("Mexica");
        countriesNamesList.add("Spain");

        statusesNamesList.add("Review");
        statusesNamesList.add("Invoiced");
        statusesNamesList.add("Authorized");
        statusesNamesList.add("Paid");
        statusesNamesList.add("Refunded");
        statusesNamesList.add("Closed");

    }

    private static boolean getRandomBoolean() {
        Random rnd = new Random();
        int val = rnd.nextInt(2);
        return val > 0;
    }

    private static int getRandomInt(int bound) {
        Random rnd = new Random();
        return rnd.nextInt(bound);
    }

    public static List<Order> generateListOfOrders() {

        List<Order> generatedList = new ArrayList<>(20);

        for(int i = 1; i < 41; i++) {

            Order order = new Order();
            order.setId(i);
            order.setManagerName(managerNamesSet.get(getRandomInt(20)));
            order.setOrganization(organizationNamesList.get(getRandomInt(10)));
            order.setNumberOfAthletes(getRandomInt(20));

            Requirements requirement = new Requirements();
            requirement.setTrainings(getRandomBoolean());
            requirement.setSauna(getRandomBoolean());
            requirement.setGym(getRandomBoolean());
            requirement.setNumberOfTrainingsSession(getRandomInt(10)+1);

            order.setRequirements(requirement);
            order.setCountry(countriesNamesList.get(getRandomInt(10)));
            order.setStatus(statusesNamesList.get(getRandomInt(6)));

            generatedList.add(order);

        }

        return generatedList;

    }
}
