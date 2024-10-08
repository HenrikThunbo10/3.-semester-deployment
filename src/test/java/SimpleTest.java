import org.junit.Assert;

public class SimpleTest
{
    public void testPass()
    {
        String test = "Hello";
        Assert.assertEquals("Hello", test);
    }

    public void testFail()
    {
        String test = "Hello";
        Assert.assertEquals("Hello1", test);
    }
}
