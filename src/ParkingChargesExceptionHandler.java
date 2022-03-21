public class ParkingChargesExceptionHandler extends Exception{

    String message;

    public ParkingChargesExceptionHandler(String errorMessage){
        message = errorMessage;
    }

    public String getMessage(){
        return message;
    }
}
