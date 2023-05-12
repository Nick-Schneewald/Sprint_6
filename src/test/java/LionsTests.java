import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class LionsTests {

    @Mock
    Feline feline;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void objCreationTest(){
        try {
            Lion lion = new Lion("Самец", feline);
        } catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
