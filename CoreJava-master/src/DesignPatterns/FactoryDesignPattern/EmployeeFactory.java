package DesignPatterns.FactoryDesignPattern;

public class EmployeeFactory {

    //get the employee
    // factory methods that return the objects of subclass

    public static Employee getEmployee(String empType){


        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        }
        else return null;
    }

}
