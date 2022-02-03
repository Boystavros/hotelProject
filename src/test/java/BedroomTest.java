import cc_Towers.Bedroom;
import cc_Towers.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        this.bedroom = new Bedroom(1, 1, RoomType.DOUBLE);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }


}
