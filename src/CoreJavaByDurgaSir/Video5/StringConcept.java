package CoreJavaByDurgaSir.Video5;

public class StringConcept {
    public static void main(String[] args) {


        // Case 1
        String s = new String("durga");
        s.concat("software");
        System.out.println(s);// durga---> string is immutable

        // But in String Buffer
        StringBuffer sb = new StringBuffer("durga");
        sb.append("software");
        System.out.println(sb); // durgasoftware ---> SB is mutable

        //Case 2
        String s1 = new String("durga");
        String s2 = new String("durga");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2));  //true

        // But in String Buffer
        StringBuffer sb1 = new StringBuffer("durga");
        StringBuffer sb2 = new StringBuffer("durga");
        System.out.println(sb1 == sb2 ); //false
        System.out.println(sb1.equals(sb2)); // false

        // Case 5
        String s3 = new String("durga");
        s3.concat("software");
        String s4 = s3.concat("Solutions");
        s3 = s3.concat("soft");
        System.out.println(s3);
        System.out.println(s4 );

    }
}
