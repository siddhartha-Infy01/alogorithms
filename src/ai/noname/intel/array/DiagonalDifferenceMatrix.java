package ai.noname.intel.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.lang.StrictMath.abs;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalDifferenceMatrix {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum_d_l = 0;
        int sum_d_r = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (arr.size() % 2 == 0) {
                    if (i == j) {
                        sum_d_l = sum_d_l + arr.get(i).get(j);
                    } else if ((i + j == arr.size() - 1)) {
                        sum_d_r = sum_d_r + arr.get(i).get(j);
                    }
                } else {
                    System.out.println("arr val->" + arr.get(i).get(j));
                    if (i == j) {
                        sum_d_l = sum_d_l + arr.get(i).get(j);
                        if (j == arr.size() / 2) {
                            sum_d_r = sum_d_r + arr.get(i).get(j);
                        }
                        System.out.println("sum_d_l->" + sum_d_l);
                    } else if ((i + j == arr.size() - 1)) {

                        sum_d_r = sum_d_r + arr.get(i).get(j);
                        System.out.println("sum_d_r->" + sum_d_r);

                    }
                }
            }
        }
        return abs(sum_d_l - sum_d_r);

    }

    public static void main(String[] args) throws IOException {
        int i = 3 / 2;
        System.out.println(i);
    }


}
