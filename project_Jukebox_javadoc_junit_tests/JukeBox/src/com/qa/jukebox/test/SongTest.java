package com.qa.jukebox.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.jukebox.Song;

import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;

/*
 *
 * @author Priyanka
 */
public class SongTest {
    private Song testSong1, testSong2;
    public SongTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    	System.out.println("in before class...SongPositiveTest.java");
    }
    
    @AfterClass
    public static void tearDownClass() {
    	System.out.println("in after class...SongPositiveTest.java");
    }
    
    @Before
    public void setUp() {
    	
        testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
        testSong2 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
    }
    
    @After
    public void tearDown() {
    	
        testSong1 = null;
        testSong2 = null;
    }
   
    
    @Test
    public void testSongDefaultConstructor() {
    	
    	Song song4 = new Song();
        assertEquals(song4.getClass(), new Song().getClass());
    }
    
    @Test
    public void testSongParameterizedConstructor() {
        assertEquals(testSong2, testSong1);
    }
    
    

     @Test
     public void testIsLong1() {
       assertTrue("Song is long",testSong1.isLong());
     }
     
     //Testing Play() method in Song.java
     //Reading a local file that was no longer available.
     @Ignore
     @Test(expected =  Exception.class)
     public void testException() {
    	 try {
    		 Song song1 = new Song(null,null,null,null,null,0);
    		 song1.play();
    	 }catch(Exception e) {
    		 assertEquals(e.getMessage(),"passed null value or no song in your file system.");
    	 }
     }
     
     //testing name - setter method
     @Test
     public void testSetSongName() {
         Song song = new Song();
         song.setName("zeans");
         assertTrue(song.getName() == "zeans");
     }
     
     //testing name - getter method
     @Test
     public void testGetSongName() {
    	 Song song = new Song();
         song.setName("hai ra hai ra");
         assertTrue(song.getName() == "hai ra hai ra");
     }
     
     
   //testing artist - setter method
     @Test
     public void testSetArtistName() {
         Song song = new Song();
         song.setArtist("rehman");
         assertTrue(song.getArtist() == "rehman");
     }
     
     //testing artist - getter method
     @Test
     public void testGetArtistName() {
    	 Song song = new Song();
         song.setArtist("balu");
         assertTrue(song.getArtist() == "balu");
     }
     
     
   //testing album - setter method
     @Test
     public void testSetAlbumName() {
         Song song = new Song();
         song.setAlbum("jeans");
         assertTrue(song.getAlbum() == "jeans");
     }
     
     //testing album - getter method
     @Test
     public void testGetAlbumName() {
    	 Song song = new Song();
         song.setAlbum("roja");
         assertTrue(song.getAlbum() == "roja");
     }
     
   //testing url - setter method
     @Test
     public void testSetUrlName() {
         Song song = new Song();
         song.setUrl("jeans.mp3");
         assertTrue(song.getUrl() == "jeans.mp3");
     }
     
     //testing url - getter method
     @Test
     public void testGetUrlName() {
    	 Song song = new Song();
         song.setUrl("roja.mp3");
         assertTrue(song.getUrl() == "roja.mp3");
     }
     
     
   //testing format - setter method
     @Test
     public void testSetFormatName() {
         Song song = new Song();
         song.setFormat("Mp3");
         assertTrue(song.getFormat() == "Mp3");
     }
     
     //testing format - getter method
     @Test
     public void testGetFormatName() {
    	 Song song = new Song();
         song.setFormat("p3");
         assertTrue(song.getFormat() == "p3");
     }
     
   //testing duration - setter method
     @Test
     public void testSetDurationName() {
         Song song = new Song();
         song.setDuration(214);
         assertTrue(song.getDuration() == 214);
     }
     
     //testing duration - getter method
     @Test
     public void testGetDurationName() {
    	 Song song = new Song();
         song.setDuration(20);
         assertTrue(song.getDuration() == 20);
     }
     
     
     @Test
     public void testMtoString() {
    	 assertEquals(testSong1.toString(), testSong2.toString());
     }
     
     
     
     
}