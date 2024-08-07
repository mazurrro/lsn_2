package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> initialList;
        do {
            initialList = getData(sc);
        } while (initialList.size() < 2);

        sc.close();

        List<int[]> pairs = Helpers.getPairs(initialList);
        if (pairs.isEmpty()){
            System.out.println("Not found pairs that sum up to 13.");
            return;
        }

        for(int[] pair : pairs) {
            System.out.println(pair[0]+" "+pair[1]);
        }
    }

    private static List<Integer> getData(Scanner sc) {
        System.out.println("Provide list of at least 2 integers (seperated by space)");
        try {
            return Stream.of(sc.nextLine()
                            .trim()
                            .split(" "))
                    .filter(x -> !x.isEmpty())
                    .map(Integer::parseInt).collect(Collectors.toList());
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect input!");
        }
        return Collections.emptyList();
    }
}