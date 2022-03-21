/*
A parking garage charges €2.00 minimum fee to park for up to three hours.
The garage charges an additional €0.50 per hour for each hour or part thereof in excess of three hours.
The maximum charge for any given 24-hour period €10.00.
Assume that no car parks for longer than 24 hours at a time.
Implement a method that calculates the parking charges for a customer based on the number of hours parked.
 */

public class ParkingCharges {

    public static double CalculatePrice(double hours) throws ParkingChargesExceptionHandler{
        double fee = 2.00;

        if (hours <= 0 || hours > 24.00){
            throw new ParkingChargesExceptionHandler("Invalid hours.");
        }else if(hours > 0 && hours < 3){
            return fee;
        }else{
            fee += (0.50 * (Math.ceil(hours) - 3));

            if (fee >= 10.00){
                fee = 10.00;
            }
            return fee;
        }
    }
}
