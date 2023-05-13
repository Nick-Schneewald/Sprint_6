import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LionsHaveManeParamTest {

    Feline feline = Mockito.mock(Feline.class);
    @Parameterized.Parameter(0)
    public String sex;

    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][] {
                {"Самец",true},
                {"Самка",false},
        });
    }
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);

    }
    @Test
    public void shouldHaveMane() throws Exception{
        Lion lion = new Lion(sex,feline);
        Assert.assertEquals(expectedResult, lion.doesHaveMane());
    }
}
