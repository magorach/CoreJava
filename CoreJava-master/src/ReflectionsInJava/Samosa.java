package ReflectionsInJava;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Samosa implements Serializable,Cloneable{

    private static Samosa samosa;

    private Samosa(){
//        if (samosa !=null){
//            throw new RuntimeException("You are trying to break singleton pattern");
//        }
    }

    public static Samosa getSamosa(){
        if(samosa == null){
            synchronized (Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    private Object readResolve() {
        return samosa;
    }

    @Override
    public Object clone () throws CloneNotSupportedException{
        return super.clone();
    }


}
