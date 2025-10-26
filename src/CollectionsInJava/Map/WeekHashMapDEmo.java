package CollectionsInJava.Map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMapDEmo {
    public static void main(String[] args) {

        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();
//        imageCache.put(new String("img1"),new Image("Image1"));            //  --> weak reference keys
////        imageCache.put("img2",new Image("Image2"));
//        imageCache.put(new String("img2"),new Image("Image2"));
        loadCache(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running ( some entries may be cleared):  "+ imageCache) ;
    }

    public static void loadCache( Map<String, Image> imageCache){
        String k1 = new String("imag1");              //--> although its strong reference but still its scope is limited in the method
        String k2 = new String("imag2");
        imageCache.put(k1,new Image("Image1"));
        imageCache.put(k2,new Image("Image2"));

    }
    public static void simulateApplicationRunning(){
        try {
            System.out.println("Simulation Application Running");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image {

    private String name;

    public Image(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}