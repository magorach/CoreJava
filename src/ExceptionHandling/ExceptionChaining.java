package ExceptionHandling;

public class ExceptionChaining {

    public static void readFile() throws Exception {
     try {
         int [] arr = new int[5];
         System.out.println(arr[10]);
     }catch (ArrayIndexOutOfBoundsException e){
         throw new Exception("Error in reading array",e);
     }

    }
    public static void main(String[] args) {
        try{
            readFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.getCause().printStackTrace();
        }

    }
}
