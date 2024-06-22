package ru.learning.binary.search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.learning.BinarySearch;

import static org.testng.Assert.assertEquals;

@Test
public class BinarySearchTests {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test(dataProvider = "binarySearchDataProvider")
    public void binarySearchPosTests(int[] arr, int searchNumber, int expectedIndex) {
        assertEquals(binarySearch.search(arr, searchNumber), expectedIndex);
    }

    @Test(dataProvider = "binarySearchNegativeTests")
    public void binarySearchNegativeTests(int[] arr, int searchNumber, int expectedIndex) {
        assertEquals(binarySearch.search(arr, searchNumber), expectedIndex);
    }

    @DataProvider(name = "binarySearchNegativeTests")
    public Object[][] binarySearchNegativeTests() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 10, -1},
                {new int[]{1, 2, 3, 4, 5}, -10, -1},
                {new int[]{1, 2, 3, 4, 5}, 0, -1}
        };
    }

    @DataProvider(name = "binarySearchDataProvider")
    public Object[][] binarySearchDataProvider() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 5, 4},
                {new int[]{1, 2, 3, 4, 5}, 1, 0},
                {new int[]{1, 2, 3, 4, 5}, 3, 2}
        };
    }


}
