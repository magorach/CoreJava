package DesignPatterns.AdapterDesignPattern;

public class ChargerXYZ implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("Your Iphone is charging");
    }
}
