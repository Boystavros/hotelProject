package cc_Towers;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getCapacity() {
        return capacity;
    }
}
