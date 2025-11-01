package Generics;

public class Stats <T extends Number >{

    T [] arr ;

    public Stats(T[] arr) {
        this.arr = arr;
    }

    //average
    double average(){
        double sum =0;
        for (T i : arr){
            sum += i.doubleValue();
        }
        return sum/arr.length;
    }
}
