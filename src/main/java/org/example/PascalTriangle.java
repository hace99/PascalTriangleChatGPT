package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            // First element of each row is always 1
            newRow.add(1);

            // Calculate the middle elements of the row
            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of each row is always 1
            newRow.add(1);

            triangle.add(newRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows;

        while (true) {
            System.out.print("Enter the number of rows for Pascal's Triangle (1-30): ");
            numRows = scanner.nextInt();

            if (numRows >= 1 && numRows <= 30) {
                break; // Valid input, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a value between 1 and 30.");
            }
        }

        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> result = pascalTriangle.generate(numRows);

        System.out.println("Pascal's Triangle for " + numRows + " rows:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}