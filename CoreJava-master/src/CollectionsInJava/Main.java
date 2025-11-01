package CollectionsInJava;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//class descendingComaparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2-o1;
//    }
//}
class MyComparator implements Comparator<Integer>{

    //ascending
    //5  3
    //3  5
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
//class StringLengthComparator implements Comparator<String> {
//    @Override
//    public int compare(String s1, String s2) {
//        if(s1.length() == s2.length()){
//            return 0;
//        }
//        return (s1.length() - s2.length());
//
//        // o1  o2
//        // ok   bye
//    }
//}
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,10,5);
        list.sort((a,b)-> b-a);;
        System.out.println(list);
//        list.sort(new MyComparator());
//        System.out.println(list);
//        list.sort(new descendingComaparator());
//        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple","date");
//       words.sort( new StringLengthComparator());
        words.sort((a,b)-> a.length() - b.length());
        System.out.println(words);
    }


}
