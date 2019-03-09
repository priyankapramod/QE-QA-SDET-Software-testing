package com.qa.jukebox.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.jukebox.Database;
import com.qa.jukebox.Song;

/**
 *
 * @author Priyanka
 */
public class DatabaseTest {
	private List<Song> songList;
	private Song testSong1, testSong2;
	private Database testDB;

	public DatabaseTest() {
	}

	@BeforeClass
	public static void setUpClass() {
		System.out.println("in before class...DatabasePositiveTest.java");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("in after class...DatabasePositiveTest.java");
	}

	@Before
	public void setUp() {
		songList = new ArrayList<>();

		testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		testSong2 = new Song("Kannala Kannala", "Kaushik Krish", "Thani Oruvan", "Kannala.mp3", "Mp3", 215);

		songList.add(testSong1);
		songList.add(testSong2);

		testDB = new Database(songList);
	}

	@After
	public void tearDown() {
		songList = null;
		testDB = null;
	}
	
	
	@Test
	public void testDefaultDatabaseConstructor() {
		Database db = new Database();
		assertEquals(testDB.getClass(), db.getClass());
		
	}
	
	
	@Test
    public void testDatabaseParameterizedConstructor() {
		Database db = new Database(songList);
		for(int i = 0; i < testDB.getSongList().size(); i++) {
			assertEquals(testDB.getSongList(i), db.getSongList(i));
		}
    }

	@Test
	public void testGetSongListReturnsList() {
		songList = new ArrayList<>();

		testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		testSong2 = new Song("Kannala Kannala", "Kaushik Krish", "Thani Oruvan", "Kannala.mp3", "Mp3", 215);

		songList.add(testSong1);
		songList.add(testSong2);

		List<Song> result = testDB.getSongList();
		assertEquals(songList, result);

	}
	@Test
	public void testGetSongListReturnsSong() {
		assertSame(testSong1, testDB.getSongList(0));
	}

	@Test
	public void testIsEmpty() {
		assertFalse("List is not empty", testDB.isEmpty());
	}

	@Test
	public void testSetSongList() {
		songList = new java.util.ArrayList();
		Song song1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		Song song2 = new Song("Kannala Kannala", "Kaushik Krish", "Thani Oruvan", "Kannala.mp3", "Mp3", 215);

		songList.add(song1);
		songList.add(song2);

		Database testSetterDB = new Database();
		testSetterDB.setSongList(songList);

		List<Song> result = new ArrayList<Song>(testSetterDB.getSongList());
		assertEquals(songList, result);
	}

	@Test
	public void testAddSong() {
		Song newSong = new Song("hai", "rehman", "jeans", "jeans.mp3", "Mp3", 300);
		testDB.addSong(newSong);
		
		assertSame("addSong() method tested", newSong,testDB.getSongList(2));//object expected, object actual
	}
	
	
	@Test
	public void testRemoveSongObjSong() {
		Song newSong = new Song("hai", "rehman", "jeans", "jeans.mp3", "Mp3", 300);
		testDB.removeSong(newSong);
		
		List<Song> result = new ArrayList<Song>(testDB.getSongList());
		assertEquals(songList, result);// assertEquals(expResult, result);
		
	}
	
	@Test
	public void testRemoveSongIndex() {
		Song newSong = new Song("hai", "rehman", "jeans", "jeans.mp3", "Mp3", 300);
		testDB.addSong(newSong); 
		testDB.removeSong(2);
		
		List<Song> result = new ArrayList<Song>(testDB.getSongList());
		assertEquals(songList, result);// assertEquals(expResult, result);
		
	}
	
	
	@Ignore
	//testing Database.play(index) method.
	@Test(expected =  Exception.class)
    public void testExceptionPLAYIndex() {
   		 Song songnull = new Song(null,null,null,null,null,0);
   		 testDB.addSong(songnull);
   		 testDB.play(2);
    }
	
	@Ignore
	//testing Database.play() method.
	@Test(expected =  Exception.class)
    public void testExceptionPLAY() {
   		 Song songnull = new Song(null,null,null,null,null,0);
   		 testDB.addSong(songnull);
   		 testDB.play(2);
    }
	
	@Test
	public void testMtoString() {
		Database testDB2 = new Database(songList);
   	 assertEquals(testDB.toString(), testDB2.toString());
    }
	
	
	
}
