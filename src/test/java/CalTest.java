import org.junit.Test;
import org.junit.Assert;

public class CalTest {
    @Test
    public void shouldReturn2(){
        Cal cal = new Cal();
        int s = cal.compute(1,1,'+');
        int v = 2;
        Assert.assertEquals(v, s);
    }


    @Test
    public void shouldReturn0(){
        Cal cal = new Cal();
        int s = cal.compute(1,1,'-');
        int v = 0;
        Assert.assertEquals(v, s);
    }
}