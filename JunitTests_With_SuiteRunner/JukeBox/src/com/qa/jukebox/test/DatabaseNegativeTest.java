package com.qa.jukebox.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

public class DatabaseNegativeTest {
	private List<Song> songList;
	private Song testSong1, testSong2;
	private Database testDB;
	
	public DatabaseNegativeTest(){
		
	}
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("in before class...DatabaseNegativeTest.java");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("in after class...DatabaseNegativeTest.java");
	}

	@Before
	public void setUp() {
		ArrayList songList = new ArrayList<>();

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
	
	@Ignore
	@Test
	public void testDefaultDatabaseConstructor() {
		Database db = new Database();
		assertEquals(testDB.getClass(), db.getClass());
		
	}
	
	@Ignore
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
		
		assertFalse("list is null", result  ==  null);

	}
	
	
	@Test
	public void testGetSongListReturnsSong() {
		List<Song> result = testDB.getSongList();
		assertFalse("Song from list is null", result.get(0) == null);
	}

	
	//testDB.isEmpty()  == false  --->  assert true
	@Test
	public void testIsEmpty() {
		assertTrue("List is not empty", testDB.isEmpty() != true);
		
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
		assertFalse("song list has not set to null", testSetterDB.getSongList() == null);
	}

	@Test
	public void testAddSong() {
		Song newSong = new Song("hai", "rehman", "jeans", "jeans.mp3", "Mp3", 300);
		testDB.addSong(newSong);
		
		assertFalse("addSong() method tested", testDB.getSongList(2) == null);//object expected, object actual
	}
	
	
	@Test
	public void testRemoveSongObjSong() {
		Song newSong = new Song("hai", "rehman", "jeans", "jeans.mp3", "Mp3", 300);
		testDB.removeSong(newSong);
		
		List<Song> result = new ArrayList<Song>(testDB.getSongList());
		assertFalse("" , testDB.getSongList().size() == 3);// assertEquals(expResult, result);
		
	}
	
	@Test
	public void testRemoveSongIndex() {
		Song newSong = new Song("hai", "rehman", "jeans", "jeans.mp3", "Mp3", 300);
		testDB.addSong(newSong); 
		testDB.removeSong(2);
		
		List<Song> result = new ArrayList<Song>(testDB.getSongList());
		assertFalse("" , testDB.getSongList().size() == 3);
		
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
	
	
	@Ignore
	@Test
	public void testMtoString() {
		Database testDB2 = new Database(songList);
   	 assertEquals(testDB.toString(), testDB2.toString());
    }
	

}
