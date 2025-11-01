package Mock;

import java.util.Collections;
import java.util.Comparator;

public class ClothesColourComparator implements Comparator<Clothes> {


    @Override
    public int compare(Clothes c1, Clothes c2) {
       int sizeCompare = c1.size.compareTo(c2.size);
       if(sizeCompare == 0){
           return c1.colour.compareTo(c2.colour);
       }
       return  sizeCompare;
    }
}
