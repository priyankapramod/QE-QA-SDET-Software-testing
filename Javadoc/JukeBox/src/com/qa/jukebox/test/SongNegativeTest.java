package com.qa.jukebox.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.jukebox.Song;

public class SongNegativeTest {
	
	private Song testSong1, testSong2;
	
	
    public SongNegativeTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    	System.out.println("in before class...SongNegativeTest.java");
    }
    
    @AfterClass
    public static void tearDownClass() {
    	System.out.println("in after class...SongNegativeTest.java");
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
   
    
    

    @Ignore    
    @Test
    public void testSongDefaultConstructor() {
    	
    	Song song4 = new Song();
        assertEquals(song4.getClass(), new Song().getClass());
    }
    
    @Ignore
    @Test
    public void testSongParameterizedConstructor() {
        assertEquals(testSong2, testSong1);
    }
    

     @Test
     public void testIsLong1() {
    	 testSong1.setDuration(20);
       assertFalse("Song is long",testSong1.isLong());
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
         song.setName("cricket");
         assertFalse(" ",song.getName() == null);
         
     }
     
     //testing name - getter method
     @Test
     public void testGetSongName() {
    	 Song song = new Song();
         song.setName(null);
         assertFalse(song.getName() == "hai ra hai ra");
     }
     
     
   //testing artist - setter method
     @Test
     public void testSetArtistName() {
         Song song = new Song();
         song.setArtist("rehman");
         assertFalse(song.getArtist() == null);
     }
     
     //testing artist - getter method
     @Test
     public void testGetArtistName() {
    	 Song song = new Song();
         song.setArtist(null);
         assertFalse(song.getArtist() == "balu");
     }
     
     
   //testing album - setter method
     @Test
     public void testSetAlbumName() {
         Song song = new Song();
         song.setAlbum("jeans");
         assertFalse(song.getAlbum() == "99");
     }
     
     //testing album - getter method
     @Test
     public void testGetAlbumName() {
    	 Song song = new Song();
         song.setAlbum("roja");
         assertFalse(song.getAlbum() == "mock");
     }
     
   //testing url - setter method
     @Test
     public void testSetUrlName() {
         Song song = new Song();
         song.setUrl(null);
         assertFalse(song.getUrl() == "jeans.mp3");
     }
     
     //testing url - getter method
     @Test
     public void testGetUrlName() {
    	 Song song = new Song();
         song.setUrl("roja.mp3");
         assertFalse(song.getUrl() == null);
     }
     
     
   //testing format - setter method
     @Test
     public void testSetFormatName() {
         Song song = new Song();
         song.setFormat(null);
         assertFalse(song.getFormat() == "Mp3");
     }
     
     //testing format - getter method
     @Test
     public void testGetFormatName() {
    	 Song song = new Song();
         song.setFormat(null);
         assertFalse(song.getFormat() == "p3");
     }
     
   //testing duration - setter method
     @Test
     public void testSetDurationName() {
         Song song = new Song();
         song.setDuration(0);
         assertFalse(song.getDuration() == 214);
     }
     
     //testing duration - getter method
     @Test
     public void testGetDurationName() {
    	 Song song = new Song();
         song.setDuration(20);
         assertFalse(song.getDuration() == 1000);
     }
     
     @Ignore
     @Test
     public void testMtoString() {
    	 assertEquals(testSong1.toString(), testSong2.toString());
     }
     

}
