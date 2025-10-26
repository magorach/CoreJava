package Enumeration_Learning;


public class Test {

     enum  Beer{
         KF("KingFisher"),
         KO("KnockOUt"),
         RC("RoyalChampion"),
         FO("FRostOrange");

        private String nameOfBeer;

         private Beer(String nameOfBeer) {
             this.nameOfBeer = nameOfBeer;
         }

         public String display(){
            return "I wanna have "+ this.name();
         }
    }
    public static void main(String[] args) {

        Beer b = Beer.RC;
        String result = switch (b){
            case KF -> "today KF lao"; // --> return string
            default -> "Weekend";
        };
        System.out.println(result);
//        switch (b){
//            case KO->{
//                System.out.println("Today KO laao");
//            }
//            case FO->{
//                System.out.println("Today Fo laao");
//            }case RC->{
//                System.out.println("Today RC laao");
//            }case KF->{
//                System.out.println("Today Kf laao");
//            }
        }
//        System.out.println(b.nameOfBeer);
//        System.out.println(b.display());
//        Beer enumBeer = Beer.valueOf("RC");
//        System.out.println(enumBeer.display());
//        System.out.println(enumBeer);
//
//        Beer[] values = Beer.values();
//        for (Beer i :values){
//            System.out.println(i.display());
//        }


}

