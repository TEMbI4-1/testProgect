import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class SimpleTest {

    @Test
    public void test(){
        int a = 10;
        int b= 20;
        Assert.assertEquals(30,a + b);
    }
    @Test
    public void test2(){
        double c = 15.3;
        double d = 3.1;
        Assert.assertEquals(4.935,c/d,0.001);
    }
    @Test
    public void test3(){
        double c = 15.3;
        double d = 3.1;
        Assertions.assertEquals(4.935,c/d,1e-3);
    }
}
