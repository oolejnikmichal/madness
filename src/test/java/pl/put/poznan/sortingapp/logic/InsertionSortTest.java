package pl.put.poznan.sortingapp.logic;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    private InsertionSort ob = new InsertionSort();
    int[] inputIntegers = new int[]{};
    int[] expectedResultIntegers = new int[] {};

    @BeforeEach
    public void setUp() {
        inputIntegers = new int[] {5, 4, 3, 2, 1};
        expectedResultIntegers = new int[] {1, 2, 3, 4, 5};

    }

    @Test
    void testCountingSortStrategy(){
        ob.sort(inputIntegers);
        Assertions.assertTrue(Arrays.equals(expectedResultIntegers, inputIntegers));
    }

}