import com.example.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CatsTests {
    @Mock
    Feline feline;

    @Mock
    Cat mockCat;
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void objCreationTest(){
        Cat cat = new Cat(feline);
        Assert.assertNotEquals(null,cat);
    }

    @Test
    public void testTheSound(){
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу",cat.getSound());
    }
}
