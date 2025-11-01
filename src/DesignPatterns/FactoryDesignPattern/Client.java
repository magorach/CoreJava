package DesignPatterns.FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {

//        Employee employee = new AndroidDeveloper();
        Employee aman = EmployeeFactory.getEmployee("Android developer");
        System.out.println(aman.salary());


        Employee pushkar = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(pushkar.salary());
    }
}
