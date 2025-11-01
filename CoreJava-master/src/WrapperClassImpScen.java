public class WrapperClassImpScen {
    public static void main(String[] args) {

//
//        Integer a  =100;
//        Integer b = 100;
//        System.out.println(a==b);
//
//        Integer x = null;
//        int y = x;  // ---> null pointer exception
//
//        Integer i = 10;
//        Long l = 10L;
//        System.out.println(i.equals(l)); // false
//        System.out.println(i == l);      // ❌ compilation error
//
//        Integer m  = 10;
//        Integer x = m+10;
//        System.out.println(x);

        int[] arr = {1,2,3};
        try {
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            int x = 10/0;               // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error!");
        }
    }
}
