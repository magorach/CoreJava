package ReflectionsInJava;

import java.lang.constant.Constable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class SecretClass{
    private String message;

    private SecretClass(String message) {
        this.message = message;
    }
    public void showMessage(){
        System.out.println("Secret message"+ " "+ message);
    }
}
public class AccessingPrivateConstructor {
    public static void main(String[] args) throws Exception {

//        // class object that contains metadata
//        Class<?> c = Class.forName("ReflectionsInJava.SecretClass");
//
//
//        //get the private constructor
//        Constructor <?> construct = c.getDeclaredConstructor(String.class);
//
//        //make it accessible
//        construct.setAccessible(true);
//
//
//        //create instance using reflection
//        Object obj = construct.newInstance("Hello via Reflection");
//        Method m = c.getDeclaredMethod("showMessage");
//        m.invoke(obj);

//        Samosa samosa1 = Samosa.getSamosa();
//        Samosa samosa2 = Samosa.getSamosa();
//        System.out.println(samosa1.hashCode());
//        System.out.println(samosa2.hashCode());

    }
}
