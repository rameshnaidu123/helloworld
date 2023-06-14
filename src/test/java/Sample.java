import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {


    int a=10,b=20;
    @Test
    public void m1(){

        Assert.assertEquals((10*20),200);
    }
    @Test
    public void m2(){
        Assert.assertEquals((10-20),-10);

    }
    @Test
    public void m3(){
        Assert.assertEquals((10+20),20);

    }

}
