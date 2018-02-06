package com.example.tyler.passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /*@BeforeClass
    public void runOnce() {
        System.out.println("This will only run once before everything else");
    }

    @AfterClass
    public void alsoRunOnce() {
        System.out.println("This will only run once after everything else");
    }

    @Before
    public void beforeEachTest() {
        System.out.println("This will run before each test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This will run after each test");
    }*/

    //testing "password" lower case
    @Test
    public void notPassword1() throws Exception {
        assertEquals(false, Validator.validatePW("password"));
    }

    //testing "password" upper case
    @Test
    public void notPassword2() throws Exception {
        assertEquals(false, Validator.validatePW("PASSWORD"));
    }

    //testing "password" mixed case
    @Test
    public void notPassword3() throws Exception {
        assertEquals(false, Validator.validatePW("pAssWOrD"));
    }

    //checking <8 characters
    //testing "password" lower case
    @Test
    public void pwTooShort() throws Exception {
        assertEquals(false, Validator.validatePW("short"));
    }

    //checking >8 characters
    //testing "password" lower case
    @Test
    public void pwLongEnough() throws Exception {
        assertEquals(true, Validator.validatePW("longenough"));
    }
}

