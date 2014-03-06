import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by Michael Bragg on 06/03/2014.
 *
 *
 */
public class MainTest {


    @Test
    public void test1() {
        List mockedlist = mock(List.class);

        mockedlist.add("one");

        verify(mockedlist).add("one");



    }
}
