package com.xyzcorp;


import org.junit.Test;

import java.util.Comparator;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonComparatorByLastNameTest {

    @Test
    public void testComparator() {
        PersonComparatorByLastName comparator =
            new PersonComparatorByLastName();
        Person person1 = new Person("Daniel", "Hinojosa");
        Person person2 = new Person("Vijay", "Patel");
        int result = comparator.compare(
            person1,
            person2
        );
        System.out.println(result);
        assertThat(result).isNegative();
    }


    /**
     *  Before:
     *  Comparator<Person> comparator =
     *             new Comparator<Person>() {
     *                 @Override
     *                 public int compare(Person o1, Person o2) {
     *                     return o1.getLastName().compareTo(o2.getLastName());
     *                 }
     *             };
     *
     *  After (1):
     *  Comparator<Person> comparator =
     *             (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());
     *  After (2):
     *  Comparator.comparing(Person::getLastName);
     *
     *
     */
    @Test
    public void testComparatorWithAnonymousInstantiation() {
        Comparator<Person> comparator =
            Comparator.comparing(Person::getLastName);

        Person person1 = new Person("Daniel", "Hinojosa");
        Person person2 = new Person("Vijay", "Patel");
        int result = comparator.compare(
            person1,
            person2
        );
        System.out.println(result);
        assertThat(result).isNegative();
    }
}
