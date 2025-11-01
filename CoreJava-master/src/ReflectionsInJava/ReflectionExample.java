package ReflectionsInJava;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private void display(){
        System.out.println(
                "Private method invoked to display Company name: "+ name
        );
    }
}

public class ReflectionExample{
    public static void main(String[] args) throws Exception {

        //create instance of company
        Company company = new Company("YouTube");
        System.out.println("Company name "+ company.getName());

        //change the name from YouTube to Ytube
        Field nameFeild = Company.class.getDeclaredField("name");
        nameFeild.setAccessible(true);// disable java access check
        nameFeild.set(company,"YTube");
        System.out.println("Company name: "+ company.getName());

        //invoke private methods
        Method m = Company.class.getDeclaredMethod("display");
        m.setAccessible(true);
        Object obj = m.invoke(company);
    }
}
