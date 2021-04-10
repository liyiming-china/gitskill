import org.junit.Test;
import org.junit.Assert;

public class CalTest {
    @Test
    public void shouldReturn2() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Cal cal = new Cal();
        int s = cal.compute(1,1,"Add");
        int v = 2;
        Assert.assertEquals(v, s);
    }


    @Test
    public void shouldReturn0() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Cal cal = new Cal();
        int s = cal.compute(1,1,"Sub");
        int v = 0;
        Assert.assertEquals(v, s);
    }
}