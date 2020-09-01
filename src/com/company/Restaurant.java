package com.company;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem fries = new MenuItem("fries", 4.25, "You can't go wrong with potatoes.", "sides");
        MenuItem gravy = new MenuItem("gravy", 1.00, "Like dad puts on his scrambled eggs", "sides");

        Menu listAll = new Menu();

        listAll.add(fries);
        listAll.remove(fries);
        listAll.add(gravy);
        listAll.add(gravy);

        System.out.println(listAll);


    }

}
