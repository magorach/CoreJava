package Mock;

import java.util.*;

public class Test {
    public static void main(String[] args) {

       List<Clothes> shop = new ArrayList<>();
       shop.add(new TShirt("M","Red"));
       shop.add(new Shirt("S","Blue"));
       shop.add(new TShirt("L","Green"));
       shop.add(new Shirt("L","Black"));
       shop.add(new Shirt("M","Yellow"));
        System.out.println("Before sorting");
        System.out.println(shop);
        Comparator<Clothes> size = Comparator.comparing(Clothes::getSize).reversed();
        shop.sort(size);
//        System.out.println("After sorting");
        System.out.println(shop);
//        // print all shirts
//        for (Clothes c :shop){
//            if (c instanceof Shirt){
//                System.out.println(c);
//            }
//        }

        // print all tshirts
//        for (Clothes c :shop){
//            if (c instanceof TShirt){
//                System.out.println(c);
//            }
//        }
//
        System.out.println("after colour sorting");
       // Comparator<Clothes> sorting = Comparator.comparing(Clothes::getSize,Comparator.reverseOrder()).thenComparing(Clothes::getColour);
        //shop.sort(sorting);
         Map<String,Integer> order = Map.of(
                 "XS",1,
                 "S",2,
                 "M",3,
                 "L",4,
                 "XL",5,
                 "XXL",6);
        Comparator<Clothes> comparing = Comparator.comparing((Clothes c) -> order.getOrDefault(c.getSize(), 0)).thenComparing(Clothes::getColour);
        System.out.println("final");
        shop.sort(comparing);
         System.out.println(shop);



    }
}
