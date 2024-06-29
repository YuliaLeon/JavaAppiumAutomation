import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber()
    {
        int a = this.getLocalNumber();

        if (a == 14) {
            System.out.println("a = 14");
        } else {
            Assert.fail("a != 14");
        }
    }
    @Test
    public void testGetClassNumber()
    {
        int b = this.getClassNumber();

        if (b > 45) {
            System.out.println("Success! b > 45");
        } else {
            Assert.fail("Failure! b < 45");
        }
    }
}
