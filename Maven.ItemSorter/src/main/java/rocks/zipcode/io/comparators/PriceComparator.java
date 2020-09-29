package rocks.zipcode.io.comparators;

/**
 * @author leon on 30/01/2019.
 */
import rocks.zipcode.io.Item;

import java.util.Comparator;
public class PriceComparator implements Comparator<Item>{
    public int compare(Item o1, Item o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
