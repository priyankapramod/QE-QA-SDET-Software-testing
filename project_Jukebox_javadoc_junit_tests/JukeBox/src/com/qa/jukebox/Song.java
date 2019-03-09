package com.qa.jukebox;

import java.io.File;
import java.io.FileInputStream;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javazoom.jl.player.Player;
/**
 * Song is a Song class 
 * <pre>
 *   Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
 *   song1.play();
 * </pre>
 * @author Priyanka.D.N. (priyanka@gmail.com)
 * @version 1.2 12 February 2019
 * @see java.io.File
 * @see java.io.FileInputStream
 * @see java.util.ArrayList
 * @see java.util.List
 * @see java.util.Scanner
 */
public class Song {
	
	//attribute   level 
	/**
	    * name is song's name
	    */	
   private String name;
   /**
    * artist is song's artist
    */
   private String artist;
   /**
    * album - from which album song is playing 
    */
   private String album;
   /**
    * url song's url 
    */
   private String url;
   /**
    * format  is song's format 
    */
   private String format;
   // Duration of Song in seconds
   /**
    * duration is the song's duration.
    */
   private int duration;
   
   
   
   
   /** Constructs a new <b>Song</b>
   */
   public Song(){
      
   }
   
   @Override 
   public boolean equals(Object that) {
	   if(that == null || !(that instanceof Song)) {
		   return false;
	   }
	   
	   if(this == that) {
		   return true;
	   }
	   Song thatSong = (Song) that;
	   return this.album.equals(thatSong.album) && 
			   this.artist.equals(thatSong.artist) &&
			   this.duration == thatSong.duration &&
			   this.format.equals(thatSong.format) &&
			   this.name.equals(thatSong.name) &&
			   this.url.equals(thatSong.url);
   }
   
   
   
   
   /** Constructs a new <b>Song</b> and assigns it a
    * @param name the song's name.
    * @param artist the song's artist
    * @param album the song's album
    * @param url the song's url
    * @param format the song's format
    * @param duration the duration of the song.
   */
   public Song(String name, String artist, String album, String url,
         String format, int duration) {
      super();
      this.name = name;
      this.artist = artist;
      this.album = album;
      this.url = url;
      this.format = format;
      this.duration = duration;
   }

   
   /**
    * Gives name of the song. 
    *
    * @return The current value of this song's name. 
    */
   public String getName() {
      return name;
   }
   
   
   
   /**
    * sets song's name to new value with the parameter passed.
    *
    * @param name New value for this song's name. 
    */
   public void setName(String name) {
      this.name = name;
   }
   
   
   
   /**
    * Gives artist  of this song. 
    *
    * @return The current value of this song's artist. 
    */
   public String getArtist() {
      return artist;
   }
   
   
   /**
    * sets song's artist to new value with the parameter passed.
    *
    * @param artist New value for this song's artist. 
    */
   public void setArtist(String artist) {
      this.artist = artist;
   }
   
   
   
   /**
    * Gives album of the song. 
    *
    * @return The current value of this song's album. 
    */
   public String getAlbum() {
      return album;
   }
   
   
   /**
    * sets song's album to new value with the parameter passed.
    *
    * @param album New value for this song's album. 
    */
   public void setAlbum(String album) {
      this.album = album;
   }
   
   
   /**
    * Gives url of the song. 
    *
    * @return The current value of this song's url. 
    */
   public String getUrl() {
      return url;
   }
  
   
   /**
    * sets song's url to new value with the parameter passed.
    *
    * @param url New value for this song's url. 
    */
   public void setUrl(String url) {
      this.url = url;
   }
   
   
   
   /**
    * Gives format of the song. 
    *
    * @return The current value of this song's format. 
    */
   public String getFormat() {
      return format;
   }
   
   
   
   /**
    * sets song's format to new value with the parameter passed.
    *
    * @param format New value for this song's format. 
    */
   public void setFormat(String format) {
      this.format = format;
   }
   
   
   /**
    * Gives duration of the song. 
    *
    * @return The current value of this song's duration. 
    */
   public int getDuration() {
      return duration;
   }
   
   
   /**
    * sets song's duration to new value with the parameter passed.
    *
    * @param duration New value for this song's duration. 
    */
   public void setDuration(int duration) {
      this.duration = duration;
   }
   
   
   
   /**
    * Determine whether this song's duration is greater that 50 time units or not.
    * @return true if duration is greater than 50 time units long or false otherwise.
    */
   public boolean isLong() {
      return duration>50;
   }
   
   
   
   /**
    * The string representation is "name=this.name, artist=this.artist, album=this.album, format=this.format, duration=this.duration"
    * Where NAME is the song's name and artist is the song's artist.
    * album is the song's album, format is song's format, duration is song's duration.
    */
   @Override
   public String toString() {
      return "Name: " + this.getName() + "\t" +
             "Artist:" + this.getArtist() + "\t" + 
             "Album:" + this.getAlbum() + "\t" +
             "Format:" + this.getFormat() + "\t" +
             "Duration:" + this.getDuration();
   }
   
//   /**
//    * The play method is called on the song we choose to play
//    *
//    * @param     r  the value to be added to the length of each side
//    */
   
   /**
    * The play method is called on the song player choose to play
    */
   public void play(){
      try{
         FileInputStream fis = new FileInputStream(this.getUrl());
         Player playMP3 = new javazoom.jl.player.Player(fis);
         playMP3.play();
      }catch(Exception e){
          System.out.println(e);
       }
   }
      //Driver
      public static void main(String[] args){
         System.out.println("Creating Song Object");
         Song song1 = new Song(null,null,null,null,null,0);
//         Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
//               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
         System.out.println("Playing Song");
         song1.play();
         
      }   
}