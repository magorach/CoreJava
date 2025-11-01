package DesignPatterns.AdapterDesignPattern;

public class DkCharger implements AndroidCharger{


    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your android phone is charging");
    }
}
