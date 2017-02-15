package com.example;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import static java.lang.System.out;

public class BasicListop {
    public static void main(final String[] args) {

        final List<Integer> ints = Arrays.asList(10, 30, 17, 20, 15, 18, 45, 12);

        Double totalOfDiscountedPrices =
                ints.stream()
                        .filter(price -> price > 20)
                        .map(price -> price * .9)
                        .reduce(0d, (a, b) -> a + b);

        Stream<Integer> ds =
                ints.stream()
                        .filter(price -> price > 20).flatMap(x -> Stream.of(x - 1, x + 1));
        ds.forEach(e -> out.format(" %s ", e));

        out.println();
        out.println("Total of discounted prices: " + totalOfDiscountedPrices);


        double sum = Arrays.asList(0.1, 2d).stream()
                .mapToDouble(w -> w)
                .sum();
        out.println();


        out.format("%f", sum);

    }
}