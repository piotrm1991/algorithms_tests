package selection_sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSortTest {
    @Test
    public void givenSelectionSortWhenEmptyListThenReturnNull() {
        // Given
        SelectionSort selectionSort = new SelectionSort();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList()
        );
        // Then
        Assert.assertSame(null, selectionSort.sort(list));
    }

    @Test
    public void givenSelectionSortWhenListNullThenReturnNull() {
        // Given
        SelectionSort selectionSort = new SelectionSort();
        // When

        // Then
        Assert.assertSame(null, selectionSort.sort(null));
    }

    @Test
    public void givenSelectionSortWhenListIntsThenReturnSortedList() {
        // Given
        SelectionSort selectionSort = new SelectionSort();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList(5, 3, 6, 2, 10)
        );
        ArrayList<Object> sortedList = new ArrayList<>(
                Arrays.asList(2, 3, 5, 6, 10)
        );
        // Then
        Assert.assertEquals(sortedList, selectionSort.sort(list));
    }

    @Test
    public void givenSelectionSortWhenListIntsAndDoublesThenReturnSortedList() {
        // Given
        SelectionSort selectionSort = new SelectionSort();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList(-1.454, 11442.34234, 5.97697, 100,  3, 6.87769, 2, 10, -20)
        );
        ArrayList<Object> sortedList = new ArrayList<>(
                Arrays.asList(-20, -1.454, 2, 3, 5.97697, 6.87769, 10, 100, 11442.34234)
        );
        // Then
        Assert.assertEquals(sortedList, selectionSort.sort(list));
    }

    @Test
    public void givenSelectionSortWhenListIntsAndDoublesWithCharsAndStringsThenReturnSortedList() {
        // Given
        SelectionSort selectionSort = new SelectionSort();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList(-1.454, 11442.34234, "dfgssg", 5.97697, 100,  3, 6.87769, 2, 10, -20, 'a')
        );
        ArrayList<Object> sortedList = new ArrayList<>(
                Arrays.asList(-20, -1.454, 2, 3, 5.97697, 6.87769, 10, 100, 11442.34234)
        );
        // Then
        Assert.assertEquals(sortedList, selectionSort.sort(list));
    }
}