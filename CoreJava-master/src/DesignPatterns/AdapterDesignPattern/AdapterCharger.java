package DesignPatterns.AdapterDesignPattern;

public class AdapterCharger implements AppleCharger{

   private DkCharger charger;

    public AdapterCharger(DkCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
       charger.chargeAndroidPhone();   // internally charging by using android charger
        System.out.println("Your phone is charging with adapter");
    }
}
