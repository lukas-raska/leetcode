package leetcode.easy.task_2418_sort_the_people;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2418 {

    public String [] sortPeople(String[] names, int [] heights){

        int length = names.length;
        int[][] people = new int[length][2];
        String [] result = new String[length];

        for (int i = 0; i < length; i++) {
            people[i][0] = i;
            people[i][1] = heights[i];
        }
        Arrays.sort(people, (o1, o2) -> Integer.compare(o2[1], o1[1]));

        for (int i = 0; i < length ; i++) {
            int indexOfName = people[i][0];
            result[i] = names[indexOfName];
        }

        return result;
    }

    public String[] sortPeople2(String[] names,
                               int[] heights) {
        record Person(String name, int height) {
        }

        Person[] people = new Person[names.length];
        for (int i = 0; i < names.length; i++) {
            people[i] = new Person(names[i], heights[i]);
        }

        return Arrays.stream(people)
                .sorted(Comparator.comparing(Person::height).reversed())
                .map(Person::name)
                .toArray(String[]::new);
    }
}
