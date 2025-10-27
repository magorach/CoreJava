package DesignPatterns.AdapterDesignPattern;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Program started");

//        AppleCharger appleCharger = new ChargerXYZ();
//        Iphone13 iphone13 = new Iphone13(appleCharger);
//        iphone13.chargeIphone();
        AppleCharger charger = new AdapterCharger(new DkCharger());
        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.chargeIphone();
    }

}
