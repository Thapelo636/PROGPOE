/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progpoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author khuma
 */
public class PROGPOETest {
    
    

    /**
     * Test of checkUsername method, of class PROGPOE.
     */
    @Test
    public void testUsernameCorrect() {
         assertTrue(PROGPOE.checkUsername("ky_1"));
    }

    @Test
    public void testUsernameIncorrect() {
    assertFalse(PROGPOE.checkUsername("kyle!!!!!!"));
    }

    /**
     * Test of checkPassword method, of class PROGPOE.
     */
    @Test
    public void testPasswordCorrect() {
        assertTrue(PROGPOE.checkPassword("Ch&sec@ke99!"));
    }

    @Test
    public void testPasswordIncorrect() {
        assertFalse(PROGPOE.checkPassword("password"));
    }

    /**
     * Test of checkPhone method, of class PROGPOE.
     */
    @Test
    public void testPhoneCorrect() {
        assertTrue(PROGPOE.checkPhone("+27838968976"));
    }

    @Test
    public void testPhoneIncorrect() {
        assertFalse(PROGPOE.checkPhone("08966553"));
    }
    
    /**
     * Test of loginUser method, of class PROGPOE.
     */
    @Test
    public void testLoginSuccess() {
        PROGPOE.username = "user_1";
        PROGPOE.password = "Pass@123";

        assertTrue(PROGPOE.loginUser("user_1", "Pass@123"));
    }

    @Test
    public void testLoginFail() {
        PROGPOE.username = "user_1";
        PROGPOE.password = "Pass@123";

        assertFalse(PROGPOE.loginUser("wrong", "wrong"));
    }
    
}
