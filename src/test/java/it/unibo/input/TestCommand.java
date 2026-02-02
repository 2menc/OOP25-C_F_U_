package it.unibo.input;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import it.unibo.api.Position;
import it.unibo.api.doors.Door;
import it.unibo.api.enigmas.Enigma;
import it.unibo.api.rooms.Room;
import it.unibo.api.rooms.RoomManager;
import it.unibo.impl.DoorImpl;
import it.unibo.impl.PlayerImpl;
import it.unibo.impl.RoomManagerImpl;
import it.unibo.impl.templates.EnigmaTemplate;
import it.unibo.impl.templates.RoomTemplate;

public class TestCommand {

    private RoomManager model;
    private Room room;

    @BeforeEach
    void initializeTest() {
        room = new RoomTemplate("id");
        room.setLayout(8, initializeDoorMap(), initializeEnigmMap());
        model = new RoomManagerImpl(new PlayerImpl(new Position(1, 3)));
        model.enterNextRoom(room);
    }

    @Test
    void testMovement() {
        Optional<Enigma> enigma;
        enigma = new MoveRight().execute(model);
        assertFalse(enigma.isPresent());
        assertEquals(model.getCurrentPosition(), new Position(2, 3));
        new MoveDown().execute(model);
        enigma = new MoveDown().execute(model);
        assertTrue(enigma.isPresent());
        assertEquals(model.getCurrentPosition(), new Position(2,4));
        new MoveRight().execute(model);
        new MoveDown().execute(model);
        new MoveRight().execute(model);
        new MoveRight().execute(model);
        new MoveDown().execute(model);
        enigma = new MoveDown().execute(model);
        assertFalse(enigma.isPresent());
        assertEquals(model.getCurrentPosition(), new Position(5, 6));
        enigma = new MoveRight().execute(model);
        assertTrue(enigma.isPresent());
        assertEquals(model.getCurrentPosition(), new Position(5, 6));
        new MoveUp().execute(model);
        assertEquals(model.getCurrentPosition(), new Position(5, 5));
        new MoveLeft().execute(model);
        assertEquals(model.getCurrentPosition(), new Position(4, 5));
        new MoveDown().execute(model);
        assertEquals(this.room, model.getCurrentRoom());
        enigma = new MoveDown().execute(model);
        assertFalse(enigma.isPresent());
        System.out.println(model.getCurrentPosition());
        assertNotEquals(this.room, model.getCurrentRoom());
    }

    private Map<Position, Enigma> initializeEnigmMap() {
        final Map<Position, Enigma> enigmaMap = new HashMap<>();
        enigmaMap.put(new Position(3, 1), new EnigmaTemplate("testEnigma1", null, "testQuestion1", 
                List.of("qst1", "qst2", "qst3", "qst4"), "qst4"));
                enigmaMap.put(new Position(6, 6), new EnigmaTemplate("testEnigma2", null, "testQuestion2", 
                List.of("qst1", "qst2", "qst3", "qst4"), "qst1"));
        enigmaMap.put(new Position(2, 5), new EnigmaTemplate("testEnigma3", null, "testQuestion2", 
                List.of("qst1", "qst2", "qst3", "qst4"), "qst2"));
        return enigmaMap;
    }

    private Map<Position, Door> initializeDoorMap() {
        final Map<Position, Door> doorMap = new HashMap<>();
        Door door = new DoorImpl("testDoor1", new RoomTemplate("id2"));
        door.setOpen(true);
        doorMap.put(new Position(4, 7), door);
        return doorMap;
    }
}
