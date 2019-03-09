package com.qa.jukebox.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Priyanka
 */
@RunWith(Suite.class)
//@Suite.SuiteClasses({JukeBoxTest.class, DatabaseTest.class, SongTest.class})
@Suite.SuiteClasses({JukeBoxTest.class, DatabaseTest.class, SongTest.class, JukeBoxNegativeTest.class, DatabaseNegativeTest.class, SongNegativeTest.class})
public class JukeBoxTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    	System.out.println("in before Suite class...JukeBoxTestSuite.java");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    	System.out.println("in after Suite class...JukeBoxTestSuite.java");
    }

    @Before
    public void setUp() throws Exception {
    	System.out.println("test case starts...JukeBoxTestSuite.java");
    }

    @After
    public void tearDown() throws Exception {
    	System.out.println("test case ends...JukeBoxTestSuite.java");
    }
    
}