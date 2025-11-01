package InterviewImplementations;

public class StringImmutabiltyTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = s1;  // s2 refers to same object as s1

        System.out.println("Before modification:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println(s1 == s2);   // true

        s1 = s1.concat(" World");  // creates a NEW String object

        System.out.println("\nAfter modification:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("\n(s1 == s2)? " + (s1 == s2));   // false
    }
}
