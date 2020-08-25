package com.company;

import java.util.ArrayList;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {

    public static String setLastModifiedDate() {
        File file = new File("C:\\Users\\Administrator\\Desktop\\lc101\\java-practice\\Restaurant Menu");

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");

        file.setLastModified(new Date().getTime());

        String printNewDate = "Last Modified: " + sdf.format(file.lastModified());

        return printNewDate;
    }

    public static void main(String[] args) {

        ArrayList<MenuItem> allItems = new ArrayList<>();
        ArrayList<MenuItem> mainCourse = new ArrayList<>();
        ArrayList<MenuItem> apps = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();

        MenuItem steak = new MenuItem("Ribeye Steak", 24.95, "A juicy cut cooked to perfection.", "main course");
        MenuItem lobsterMac = new MenuItem("Lobster Mac & Cheese", 51.43, "The most expensive lobster we could find atop the most grocery-store-priced macaroni available.", "main course");
        MenuItem lavaCake = new MenuItem("Chocolate Lava Cake", 14.85, "It's what you came here for.", "desserts");
        MenuItem pita = new MenuItem("Pita Bread", 4.35, "Literally just the bread. No dip.", "apps");

        allItems.add(lavaCake);
        allItems.add(steak);
        allItems.add(lobsterMac);
        allItems.add(pita);

        for (MenuItem item : allItems) {
            if (item.getCategory() == "apps") {
                apps.add(item);
            } else if (item.getCategory() == "main course") {
                mainCourse.add(item);
            } else if (item.getCategory() == "desserts") {
                desserts.add(item);
            }
        }

        System.out.println("APPETIZERS:");

        for (Integer i = 0; i < apps.size(); i++) {
            System.out.println("-------\n" + apps.get(i).getName() + " - $" + apps.get(i).getPrice() +
                    "\n" + apps.get(i).getDescription());
        }

        System.out.println("\nMAIN COURSES:");

        for (Integer i = 0; i < mainCourse.size(); i++) {
            System.out.println("-------\n" + mainCourse.get(i).getName() + " - $" + mainCourse.get(i).getPrice() +
                    "\n" + mainCourse.get(i).getDescription());
        }

        System.out.println("\nDESSERTS:");

        for (Integer i = 0; i < desserts.size(); i++) {
            System.out.println("-------\n" + desserts.get(i).getName() + " - $" + desserts.get(i).getPrice() +
                    "\n" + desserts.get(i).getDescription());
        }

        System.out.println("\n" + Menu.setLastModifiedDate());

    }

}
