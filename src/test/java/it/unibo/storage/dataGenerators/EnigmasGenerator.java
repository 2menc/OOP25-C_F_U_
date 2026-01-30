package it.unibo.storage.dataGenerators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import it.unibo.api.enigmas.Enigma;
import it.unibo.impl.templates.EnigmaTemplate;
import it.unibo.storage.enigma.EnigmaSave;

public class EnigmasGenerator {

    public static void main(String[] args) {
        
        List<Enigma> enigmasToSave = new ArrayList<>();
        populateList(enigmasToSave);
        
        final EnigmaSave storage = new EnigmaSave();
        storage.saveEnigmas(enigmasToSave);
    }


    @Test
    void testFileContent() {
        List<Enigma> checkList = new ArrayList<>();
        populateList(checkList);
        final EnigmaSave storage = new EnigmaSave();

        storage.loadEnigmas();        
        assertEquals(checkList, storage.getEnigmas());
    }

    private static void populateList(final List<Enigma> list) {
    }

}
