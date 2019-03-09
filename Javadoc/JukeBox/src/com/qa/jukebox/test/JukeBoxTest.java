package com.qa.jukebox.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.jukebox.Database;
import com.qa.jukebox.Jukebox;
import com.qa.jukebox.Song;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Priyanka
 */
public class JukeBoxTest {
	private Jukebox testJB;
	private Database db;
	private java.util.List songListJB;
	private Song song1, song2;
	private int ccn = 123;

	public JukeBoxTest() {
	}

	@BeforeClass
	public static void setUpClass() {
		System.out.println("in before class...JukeBoxPositiveTest.java");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("in before class...JukeBoxPositiveTest.java");
	}

	@Before
	public void setUp() {
		song1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		song2 = new Song("Kannala Kannala", "Kaushik Krish", "Thani Oruvan", "Kannala.mp3", "Mp3", 215);

		songListJB = new java.util.ArrayList();

		songListJB.add(song1);
		songListJB.add(song2);

		db = new Database(songListJB);

		testJB = new Jukebox(db, ccn);
	}

	@After
	public void tearDown() {
		testJB = null;
	}
	
	@Test
	public void testDefaultJukeboxConstructor() {
		Jukebox jk = new Jukebox();
		assertEquals(testJB.getClass(), jk.getClass());
		
	}
	
	
	@Test
    public void testJukeboxParameterizedConstructor() {
		Jukebox jk = new Jukebox(db, ccn);
		for(int i = 0; i < jk.getDb().getSongList().size(); i++) {
			assertEquals(jk.getDb().getSongList(0), testJB.getDb().getSongList(0));
		}
		assertEquals(jk.getCreditCard(), testJB.getCreditCard());
    }

	// testing Database obj - getter method
	@Test
	public void testGetDB() {
		assertSame(db, testJB.getDb());// object expected, object actual
	}

	// testing Database obj - setter method
	@Test
	public void testSetDB() {
		Song testSong1 = new Song("Kannala Kannala", "Kaushik Krish", "Thani Oruvan", "Kannala.mp3", "Mp3", 215);
		List songListTest = new ArrayList<Song>();
		songListTest.add(testSong1);
		Database testDBSetter = new Database();
		testDBSetter.setSongList(songListTest); /// method to be tested
		Jukebox testJBsetter = new Jukebox(testDBSetter, 444);
		
		assertSame(testDBSetter, testJBsetter.getDb());// object expected, object actual
		
	}
	
	//testing creditcard - setter method
    @Test
    public void testSetCreditCard() {
    	testJB.setCreditCard(234);
        assertEquals(234, testJB.getCreditCard());
    }
    
    //testing creditcard - getter method
    @Test
    public void testGetCreditcard() {
    	assertEquals(123, testJB.getCreditCard());     
    }

	@Test
	public void testIsValidCreditCard() {
		assertTrue("creditcard has value > 0",testJB.isValidCreditCard());
		//assertEquals("Credit card is valid if value is greater than 0", true, testJB.isValidCreditCard());
	}
	
	
	@Ignore
	//testing Database.play(index) method.
	@Test(expected =  Exception.class)
    public void testExceptionPLAYIndex() {
		Song song=db.getSongList(0);
        song.play();
    }
	
	@Ignore
	//testing Database.play() method.
	@Test(expected =  Exception.class)
    public void testExceptionPLAY() {
		for (int index=0;index<db.getSongList().size();index++)
	      {
	         Song song=db.getSongList(index);
	         song.play();
	      }
    }
	
	
	
}
