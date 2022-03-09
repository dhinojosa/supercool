package com.abccorp;

import com.xyzcorp.American;
import com.xyzcorp.House;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello there");
        House h1 = new House(2000, true, 2);
        System.out.println(h1.getSquareFoot());

        House h2 = new House(4000, true, 3);
        System.out.println(h2.getSquareFoot());

        House h3 = h2;
        System.out.println(h3.getSquareFoot());

        com.xyzcorp.Person p = new com.xyzcorp.Person("Jesus", "Fernandez");
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());

        com.xyzcorp.Person p2 = new com.xyzcorp.Person("Jesus", "Fernandez");

        System.out.println(p == p2);      //reference
        System.out.println(p.equals(p2)); //object equality

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());

        com.xyzcorp.Person p3 = new com.xyzcorp.Person("Brandon", "Larson");

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(American.isValidAmericanSSN("421-34-1202"));
        System.out.println(American.isValidAmericanSSN("421-34-1202"));
        System.out.println(American.isValidAmericanSSN("421-34-1202"));

        American american = new American("Lady", "Gaga", "333-12-3300");
        System.out.println(american);


    }
}
