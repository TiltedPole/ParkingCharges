import junit.framework.TestCase;

public class ParkingCharges_test extends TestCase{

    // Test Number: 1
    // Objective: Error is displayed.
    // Input(s): Hours: 27.00
    // Expected Output: "Invalid hours"
    public void testParkingCharges001(){
        double result = 0.00;
        ParkingCharges testObj = new ParkingCharges();

        try{
            result = testObj.CalculatePrice(27.00);
            fail("No exception.");

        } catch (ParkingChargesExceptionHandler e) {
            assertEquals("Invalid hours.", e.getMessage());
        }
    }

    // Test Number: 2
    // Objective: The generated price is displayed
    // Input(s): Hours: 12
    // Expected Output: 6.50
    public void testParkingCharges002(){
        try{
            ParkingCharges testObj = new ParkingCharges();
            assertEquals(6.50, testObj.CalculatePrice(12));
        } catch (ParkingChargesExceptionHandler e) {
            fail("Error");
        }
    }

    // Test Number: 3
    // Objective: The generated price is displayed
    // Input(s): Hours: 2
    // Expected Output: 2.00
    public void testParkingCharges003(){
        try{
            ParkingCharges testObj = new ParkingCharges();
            assertEquals(2.00, testObj.CalculatePrice(2));
        } catch (ParkingChargesExceptionHandler e) {
            fail("Error");
        }
    }

    // Test Number: 4
    // Objective: The generated price is displayed
    // Input(s): Hours: 24
    // Expected Output: 10.00
    public void testParkingCharges004(){
        try{
            ParkingCharges testObj = new ParkingCharges();
            assertEquals(10.00, testObj.CalculatePrice(24));
        } catch (ParkingChargesExceptionHandler e) {
            fail("Error");
        }
    }

    // Test Number: 5
    // Objective: The generated price is displayed
    // Input(s): Hours: 8.25
    // Expected Output: 5.00
    public void testParkingCharges005(){
        try{
            ParkingCharges testObj = new ParkingCharges();
            assertEquals(5.00, testObj.CalculatePrice(9.25));
        } catch (ParkingChargesExceptionHandler e) {
            fail("Error");
        }
    }

    // Test Number: 6
    // Objective: Error is displayed.
    // Input(s): Hours: -12
    // Expected Output: "Invalid Hours"
    public void testParkingCharges006(){
        double result = 0.00;
        ParkingCharges testObj = new ParkingCharges();

        try{
            result = testObj.CalculatePrice(-12);
            fail("No exception.");

        } catch (ParkingChargesExceptionHandler e) {
            assertEquals("Invalid hours.", e.getMessage());
        }
    }
}