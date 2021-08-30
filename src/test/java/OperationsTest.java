import ec.utbildning.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperationsTest {




    @Test
    @DisplayName("Add - should return the sum of the passed arguments")
    public void add(){
        Assertions.assertEquals(5.0, Operations.add(2.0, 3.0));
    }

    @Test
    @DisplayName("Subtract - should return the difference between the passed arguments")
    public void subtract(){
        Assertions.assertEquals(4.0, Operations.subtract(9.0, 5.0));
    }

    @Test
    @DisplayName("Multiply - should return the product of the the factors")
    public void multiply(){
        Assertions.assertEquals(12.0, Operations.multiply(3.0, 4.0));
    }

    @Test
    @DisplayName("Divide - should return the answer qoutient of the division")
    public void divide_divisionWithoutRemainder(){
        Assertions.assertEquals(2, Operations.divide(4, 2));
    }

    @Test
    @DisplayName("Divide - should return the answer qoutient of the division, with accurate decimals")
    public void divide_divisionWithRemainder(){
        Assertions.assertNotEquals(2.0, Operations.divide(5, 2));
        Assertions.assertEquals(2.5, Operations.divide(5, 2));
    }

    @Test
    @DisplayName("Sqrt - Should return the square root of the passed argument")
    public void sqrt(){
        Assertions.assertEquals(3.0, Operations.sqrt(9.0));
    }



}
