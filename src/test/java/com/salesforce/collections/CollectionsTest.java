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

    @Test
    public void testTreeSet() {
        Comparator<Person> personComparatorByLastName =
            Comparator.comparing(Person::getLastName);
        Set<Person> personSet = new TreeSet<>(personComparatorByLastName);
        Set<Person> personSet2 = new TreeSet<>(personComparatorByLastName);
//        Set<Person> personSet = new TreeSet<>(new PersonComparatorByLastName());
        personSet.add(new Person("Stephen", "Peng"));
        personSet.add(new Person("Vamsi", "Rao"));
        personSet.add(new Person("Susie", "White"));
        personSet.add(new Person("Vijay", "Patel"));
        System.out.println(personSet);
    }

    @Test
    public void testHashMap() {
        record Points(Integer value){}
        Map<Person, Points> map = new HashMap<>();
        map.put(new Person("Wayne", "Cheung"), new Points(1000));
        map.put(new Person("Ellie", "Reinhart"), new Points(4500));
        map.put(new Person("Vijay", "Patel"), new Points(3400));

        Points result = map.get(new Person("Ellie", "Reinhart"));
        assertThat(result).isEqualTo(new Points(4500));
    }

    @Test
    public void testCollectionsSortUsingComparableOk() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Stephen", "Peng"));
        list.add(new Person("Vamsi", "Rao"));
        list.add(new Person("Jesus", "Fernandez"));
        list.add(new Person("Arthisha", "Sampally"));
        list.add(new Person("Akanksha", "Lonhari"));
        System.out.printf("Before: %s\n", list);
        Collections.sort(list);
        System.out.printf("After: %s\n", list);
    }

    @Test
    public void testCollectionsSortUsingComparatorOk() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Stephen", "Peng"));
        list.add(new Person("Vamsi", "Rao"));
        list.add(new Person("Jesus", "Fernandez"));
        list.add(new Person("Arthisha", "Sampally"));
        list.add(new Person("Akanksha", "Lonhari"));
        System.out.printf("Before: %s\n", list);
        Collections.sort(list, Comparator.comparing(Person::getLastName));
        System.out.printf("After: %s\n", list);
    }

    @Test
    public void testCollectionsSortUsingImmutableList() {
        //This is an immutable list
        List<Person> list = List.of(
            new Person("Stephen", "Peng"),
            new Person("Vamsi", "Rao"),
            new Person("Jesus", "Fernandez"),
            new Person("Arthisha", "Sampally"),
            new Person("Akanksha", "Lonhari"));

        // No can do...Collections.sort(list);

        System.out.printf("Before (list): %s\n", list);
        List<Person> result =
            list.stream().sorted(Comparator.comparing(Person::getLastName)).toList();
        System.out.printf("After (list): %s\n", list);
        System.out.printf("After (result): %s\n", result);
    }
}
