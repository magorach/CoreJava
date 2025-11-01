package CoreJavaByDurgaSir.Video6;


//Non-Static Inner Class
public class A {
    int age;
    public void show(){
        System.out.println("in show of A");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }

    //static nested class
    class Outer {
        static class Inner {
            void display() {
                System.out.println("Static nested class");
            }
        }
    }


    public static class Tester{
        public static void main(String[] args) {

            A obj = new A();
            obj.show();
          //  B obj = new B();    //--> CTE

          //  A.B Obj2 = new B();//
            A.B obj1 = obj.new B();


            // static nested class
            //Cannot access non-static members of the outer class directly.
            Outer.Inner obj2 = new Outer.Inner(); // no Outer object needed
            obj2.display();

        }
    }
}

