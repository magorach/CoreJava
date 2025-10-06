package CoreJavaByDurgaSir.TypesOfInnerClasses;

public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }
    public void reservedRoom( String guestName, int numOfRooms){
        class ReservationValidator{

            boolean validate(){
                if (guestName == null || guestName.isBlank()){
                    System.out.println("Guest name cannot be empty");
                    return false;
                }
                if(numOfRooms < 0){
                    System.out.println("Rooms cannot be negative");
                    return false;
                }
                if (reservedRooms +numOfRooms > totalRooms){
                    System.out.println("Not enough rooms");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if (validator.validate()){
            reservedRooms += numOfRooms;
            System.out.println("Reservation conformed for "+ guestName + " for "+ numOfRooms) ;
        }else {
            System.out.println("Reservation cancelled  for "+ guestName + " for "+ numOfRooms) ;
        }
    }


}
