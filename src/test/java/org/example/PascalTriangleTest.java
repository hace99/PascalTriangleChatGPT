package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    @Test
    public void testGenerateWithZeroRows() {
        PascalTriangle pascalTriangle = new PascalTriangle();
        int numRows = 0;

        List<List<Integer>> result = pascalTriangle.generate(numRows);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGenerateWithOneRow(){
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> result = pascalTriangle.generate(1);

        assertEquals(1, result.size());

        List<Integer> firstRow = result.get(0);

        assertEquals(1, (int) firstRow.get(0));
}

    @Test
    void testGenerateWithTwoRows(){
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> result = pascalTriangle.generate(2);

        assertEquals(2, result.size());

        List<Integer> firstRow = result.get(0);
        List<Integer> secondRow = result.get(1);

        assertEquals(1, (int) firstRow.get(0));

        assertEquals(1, (int) secondRow.get(0));
        assertEquals(1, (int) secondRow.get(1));
    }

    @Test
    public void testGenerateWithThreeRows() {
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> result = pascalTriangle.generate(3);

        assertEquals(3, result.size());

        List<Integer> firstRow = result.get(0);
        List<Integer> secondRow = result.get(1);
        List<Integer> thirdRow = result.get(2);

        assertEquals(1, (int) firstRow.get(0));

        assertEquals(1, (int) secondRow.get(0));
        assertEquals(1, (int) secondRow.get(1));

        assertEquals(1, (int) thirdRow.get(0));
        assertEquals(2, (int) thirdRow.get(1));
        assertEquals(1, (int) thirdRow.get(2));
    }

    @Test
    public void testGenerateWithFourRows() {
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> result = pascalTriangle.generate(4);

        assertEquals(4, result.size());

        List<Integer> firstRow = result.get(0);
        List<Integer> secondRow = result.get(1);
        List<Integer> thirdRow = result.get(2);
        List<Integer> fourthRow = result.get(3);

        assertEquals(1, (int) firstRow.get(0));

        assertEquals(1, (int) secondRow.get(0));
        assertEquals(1, (int) secondRow.get(1));

        assertEquals(1, (int) thirdRow.get(0));
        assertEquals(2, (int) thirdRow.get(1));
        assertEquals(1, (int) thirdRow.get(2));

        assertEquals(1, (int) fourthRow.get(0));
        assertEquals(3, (int) fourthRow.get(1));
        assertEquals(3, (int) fourthRow.get(2));
        assertEquals(1, (int) fourthRow.get(3));
    }

}

