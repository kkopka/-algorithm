package ru.learning.binary.search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.learning.SelectionSort;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertTrue;

@Test
public class SelectionSortTests {

    private final SelectionSort selectionSort = new SelectionSort();

    @Test(dataProvider = "selectionSortDataProvider")
    public void selectionSortTest(int[] arr, int[] expected) {
        assertTrue(Arrays.equals(selectionSort.sort(arr), expected));
    }


    @DataProvider(name = "selectionSortDataProvider")
    public Object[][] selectionSortProvider() {
        return new Object[][]{
                {new int[]{1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1}},
                {new int[]{12, 12, 3, 13, 32103, 113,}, new int[]{32103, 113, 13, 12, 12, 3}},
                {new int[]{-10, 100, 0, 13, -5}, new int[]{100, 13, 0, -5, -10}}
        };
    }
}
