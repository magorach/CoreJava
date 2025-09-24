package CoreJavaByDurgaSir;  // video 4

import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) {

        // .getClass()
        int count =0;
        Object  o = new String("durga");
        Class c = o.getClass();

        Method[] methods = c.getDeclaredMethods();
        for ( Method m :methods){
            count++;
            System.out.println(m.getName() +"'");
        }
        System.out.println(count);
        // System.out.println(c.getName());

    }
}
