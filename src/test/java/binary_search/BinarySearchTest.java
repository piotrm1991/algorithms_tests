package binary_search;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTest {
    @Test
    public void givenBinarySearchWhenEmptyListThenReturnNull() {
        // Given
        BinarySearch binarySearch = new BinarySearch();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList()
        );
        // Then
        Assert.assertSame(null, binarySearch.search(list, null));
    }

    @Test
    public void givenBinarySearchWhenListNullThenReturnNull() {
        // Given
        BinarySearch binarySearch = new BinarySearch();
        // When

        // Then
        Assert.assertSame(null, binarySearch.search(null, null));
    }

    @Test
    public void givenBinarySearchWhenItemNullThenReturnNull() {
        // Given
        BinarySearch binarySearch = new BinarySearch();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList(1, 3, 5, 7, 9)
        );
        // Then
        Assert.assertSame(null, binarySearch.search(list, null));
    }

    @Test
    public void givenBinarySearchWhenListOfIntsAndInputIntThenReturnPosition() {
        // Given
        BinarySearch binarySearch = new BinarySearch();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList(1, 3, 5, 7, 9)
        );
        Integer item = 3;
        // Then
        Assert.assertSame(1, binarySearch.search(list, item));
    }

    @Test
    public void givenBinarySearchWhenListOfIntsAndInputIntNotThereThenReturnPosition() {
        // Given
        BinarySearch binarySearch = new BinarySearch();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList(1, 3, 5, 7, 9)
        );
        Integer item = -1;
        // Then
        Assert.assertSame(null, binarySearch.search(list, item));
    }

    @Test
    public void givenBinarySearchWhenListOfIntsAndIntsAndInputDoubleNotThereThenReturnPosition() {
        // Given
        BinarySearch binarySearch = new BinarySearch();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList(-1, 2.0, 3.666, 5, 755, 900)
        );
        Double item = 3.666;
        // Then
        Assert.assertSame(2, binarySearch.search(list, item));
    }

    @Test
    public void givenBinarySearchWhenListOfIntsAndIntsAndInputIntNotThereThenReturnPosition() {
        // Given
        BinarySearch binarySearch = new BinarySearch();
        // When
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList(-1, 2.0, 3.666, 5, 755, 900)
        );
        Integer item = -1;
        // Then
        Assert.assertSame(0, binarySearch.search(list, item));
    }
}