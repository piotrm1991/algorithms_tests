package binary_search;

import java.util.ArrayList;

public class BinarySearch {

    public Object search(ArrayList<Object> list, Object item) {
        if (list == null) return null;
        if (list.isEmpty() || item == null) return null;
        list.removeIf(x -> x == null || x.toString().matches("[a-zA-Z]+"));

        int low = 0;
        int high = list.size() - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            Double guess = new Double(list.get(mid).toString());
            Double itemCast = new Double(item.toString());
            if (guess.equals(itemCast)) {
                return mid;
            } else if(guess > itemCast) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }
}
