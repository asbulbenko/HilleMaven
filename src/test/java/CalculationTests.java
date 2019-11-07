import org.junit.Assert;
import org.junit.Test;

public class CalculationTests {

    @Test
    public void testSummOfTwoIntValues(){
        Assert.assertEquals("Check summarize 2 + 2 ", Calculation.sum(2,2), 4);
    }

    @Test
    public void testSubtitutionOfTwoIntValues(){
        Assert.assertEquals("Check subtition 2 - 5 ", Calculation.sub(2,5), -3);
    }
}
