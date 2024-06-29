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
}
