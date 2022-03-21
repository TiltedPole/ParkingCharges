/*
A parking garage charges €2.00 minimum fee to park for up to three hours.
The garage charges an additional €0.50 per hour for each hour or part thereof in excess of three hours.
The maximum charge for any given 24-hour period €10.00.
Assume that no car parks for longer than 24 hours at a time.
Implement a method that calculates the parking charges for a customer based on the number of hours parked.
 */

public class ParkingCharges {

    public static int Calculate(int hours){
        int fee = 2;

        if (hours < 3 && hours > 24){
            // throw exception
            return 0;
        }else{
            fee += (0.50 * (hours - 3));
            if (fee >= 10){
                fee = 10;
            }
            return fee;
        }
    }
}
