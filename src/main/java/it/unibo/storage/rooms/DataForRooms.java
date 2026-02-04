package it.unibo.storage.rooms;

import java.util.List;

import it.unibo.storage.enigma.DataForEnigmas;


public class DataForRooms {
    /**
     *the id of the room
     */
    private String id;

    private int size;

    private List<EnigmaData> enigmas;
    private List<DoorData> doors;

    public DataForRooms() {}

    //getter
    public String getId() {
        return this.id;
    }

    public int getSize() {
        return this.size;
    }

    public List<EnigmaData> getEnigmas() {
        return this.enigmas;
    }

    public List<DoorData> getDoors() {
        return this.doors;
    }

    //setter
    public void setId(final String id) {
        this.id = id;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public void setEnigmas(final List<EnigmaData> enigmas) {
        this.enigmas = enigmas;
    }

    public void setDoors(final List<DoorData> doors) {
        this.doors = doors;
    }

    public static class EnigmaData{
        public int x;
        public int y;
        public DataForEnigmas data;
    }

    public static class DoorData{
        public int x;
        public int y;
        public DataForDoor data;
    }

}
