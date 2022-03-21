import junit.framework.TestCase;

public class ParkingCharges_test extends TestCase{

    // Test Number: 1
    // Objective: The generated price is displayed
    // Input(s): Hours: 12
    // Expected Output: 6.50
    public void testParkingCharges001(){
        try{
            ParkingCharges testObj = new ParkingCharges();
            assertEquals(6.50, testObj.CalculatePrice(12));
        } catch (ParkingChargesExceptionHandler e) {
            fail("Error");
        }
    }
}