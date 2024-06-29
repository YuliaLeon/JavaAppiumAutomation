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
            Assert.fail("First test: a != 14");
        }
    }
    @Test
    public void testGetClassNumber()
    {
        int b = this.getClassNumber();

        if (b > 45) {
            System.out.println("b > 45");
        } else {
            Assert.fail("Second test: b < 45");
        }
    }
    @Test
    public void testGetClassString()
    {
        String c = this.getClassString();

        if (c.contains("Hello") || c.contains("hello")) {
            System.out.println("String contains hello word");
        } else {
            Assert.fail("Third test: there is no hello word");
        }
    }
}
