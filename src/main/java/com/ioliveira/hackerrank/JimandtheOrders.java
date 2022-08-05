package com.ioliveira.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JimandtheOrders {

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        Map<Integer, Integer> customerOrders = new HashMap<>();
        int customer = 1;

        for (List<Integer> order : orders) {
            customerOrders.put(customer, order.get(0) + order.get(1));
            customer++;
        }

        return customerOrders
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).toList();
    }

    public static void main(String[] args) {
        List<List<Integer>> orders = new ArrayList<>();
        List<Integer> order1 = new ArrayList<>();
        List<Integer> order2 = new ArrayList<>();
        List<Integer> order3 = new ArrayList<>();
        List<Integer> order4 = new ArrayList<>();
        List<Integer> order5 = new ArrayList<>();

        order1.add(8);
        order1.add(1);
        orders.add(order1);

        order2.add(4);
        order2.add(2);
        orders.add(order2);

        order3.add(5);
        order3.add(6);
        orders.add(order3);

        order4.add(3);
        order4.add(1);
        orders.add(order4);

        order5.add(4);
        order5.add(3);
        orders.add(order5);

        System.out.println(jimOrders(orders));
    }
}
