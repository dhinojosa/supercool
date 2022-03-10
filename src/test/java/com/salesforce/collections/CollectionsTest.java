package com.salesforce.collections;

import com.xyzcorp.Person;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionsTest {


    @Test
    public void testArrays() {
        int[] arrayOfInts = new int[]{20, 10, 43, 30, 10};
        int num = arrayOfInts[4];
    }

    @Test
    public void testCreateAListOldWay() {
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(50);
        list.add(50);
        assertThat(list.isEmpty()).isFalse();
    }

    @Test
    public void testCreateList() {
        List<Integer> list = List.of(10, 30, 50, 100);
    }

    @Test
    public void testHashSet() {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Stephen", "Peng"));
        personSet.add(new Person("Vamsi", "Rao"));
        personSet.add(new Person("Vamsi", "Rao"));
        System.out.println(new Person("Vamsi", "Rao").hashCode());
        assertThat(personSet).hasSize(2);

    }
}
