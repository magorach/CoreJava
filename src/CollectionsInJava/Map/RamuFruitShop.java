package CollectionsInJava.Map;

import java.util.HashMap;

public class RamuFruitShop {
    public static void main(String[] args) {

        HashMap<String,Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple",50);
        fruitMap.put("Banana",30);
        fruitMap.put("Orange",80);
        fruitMap.put("Grape",20);
        System.out.println(fruitMap);

    }
}
