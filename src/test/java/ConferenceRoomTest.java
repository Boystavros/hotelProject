import cc_Towers.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        this.conferenceRoom = new ConferenceRoom(5, "Main");
    }

    @Test
    public void hasName(){
        assertEquals("Main", conferenceRoom.getName());
    }

    @Test
    public void guestsStartsEmpty(){
        assertEquals(0, conferenceRoom.getGuests().size());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, conferenceRoom.getCapacity());
    }
}
