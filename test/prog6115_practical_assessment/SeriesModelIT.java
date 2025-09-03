/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prog6115_practical_assessment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SYLVESTER FIRMINO
 */
public class SeriesModelIT {
    
    public SeriesModelIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setEpisodes method, of class SeriesModel.
     */
    @Test
    public void testSetEpisodes() {
        System.out.println("setEpisodes");
        int newEpisodes = 0;
        SeriesModel instance = null;
        instance.setEpisodes(newEpisodes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class SeriesModel.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int newAge = 0;
        SeriesModel instance = null;
        instance.setAge(newAge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class SeriesModel.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "";
        SeriesModel instance = null;
        instance.setName(newName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SeriesModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        SeriesModel instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SeriesModel.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SeriesModel instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class SeriesModel.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        SeriesModel instance = null;
        String expResult = "";
        String result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEpisodes method, of class SeriesModel.
     */
    @Test
    public void testGetEpisodes() {
        System.out.println("getEpisodes");
        SeriesModel instance = null;
        String expResult = "";
        String result = instance.getEpisodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
