package test;

import utils.EmptyNameException;
import model.Equipment;
import utils.InvalidInputException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipmentTest {

    private static Equipment equipment;

    @Before
    public void setUp() {
        try {
            equipment = new Equipment("myEquipment", 500);
        } catch (InvalidInputException | EmptyNameException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getName() {
        assertEquals("myEquipment", equipment.getName());
    }

    @Test
    public void setName() {
        try {
            equipment.setName("yourEquipment");
        } catch (EmptyNameException e) {
            e.printStackTrace();
        }
        assertEquals("yourEquipment", equipment.getName());
        try {
            equipment.setName("");
        } catch (EmptyNameException e) {
            e.printStackTrace();
        }
        assertEquals("yourEquipment", equipment.getName());
    }

    @Test
    public void getVolume() {
        assertEquals(500, equipment.getVolume());
    }

    @Test
    public void setVolume() {
        try {
            equipment.setVolume(1000);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
        assertEquals(1000, equipment.getVolume());
        try {
            equipment.setVolume(0);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
        assertEquals(1000, equipment.getVolume());
        try {
            equipment.setVolume(-100);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
        assertEquals(1000, equipment.getVolume());
    }
}