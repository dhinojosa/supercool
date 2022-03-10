package com.xyzcorp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void testComparisonBetweenTwoPeople() {
        Person person1 = new Person("Daniel", "Hinojosa");
        Person person2 = new Person("Vijay", "Patel");
        int result = person1.compareTo(person2);
        System.out.println(result);
        assertThat(result).isNegative();
    }
}
