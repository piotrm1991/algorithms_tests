package selection_sort;

import java.util.ArrayList;

public class SelectionSort {

    public ArrayList<Number> sort(ArrayList<Object> list) {
        if (list == null || list.isEmpty()) return null;
        list.removeIf(x -> x == null || x.toString().matches("[a-zA-Z]+"));
        ArrayList<Number> sortedList = new ArrayList<>();
        int listLength = list.size();
        for (int i = 0; i < listLength; i++) {
            int smallestIndex = this.findSmallest(list);
            sortedList.add((Number) list.remove(smallestIndex));
        }
        return sortedList;
    }

    private int findSmallest(ArrayList<Object> list) {
        Double smallest = Double.parseDouble(list.get(0).toString());
        int smallestIndex = 0;
        for (int i = 1; i < list.size(); i ++) {
            Double j = Double.parseDouble(list.get(i).toString());
            if (j < smallest) {
                smallest = j;
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
