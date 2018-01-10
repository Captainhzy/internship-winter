import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wyy on 18-1-10
 */
public class FirstTest {

    @Before
    public void init(){
        System.out.println("FirstTest.init");
    }

    @After
    public void destory(){
        System.out.println("FirstTest.destory");
    }

    @Test
    public void testHelloWorld(){
        System.out.println("Hello world!");
    }
}
