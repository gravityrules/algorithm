import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FirstRecurringElemTest {

    @Test
    void test_firstRecurElem_Num_Missing() {
        assertEquals(-1, FirstRecurringElem.firstRecurElem(Arrays.asList(2,3,4,5,6)));
    }

    @Test
    void test_firstRecurElem_Num_Present() {
        assertEquals(3, FirstRecurringElem.firstRecurElem(Arrays.asList(2,3,4,3,5,6)));
        assertEquals(4, FirstRecurringElem.firstRecurElem(Arrays.asList(2,3,4,4,3,5,6)));
    }
}