package com.qa.jukebox;

import java.util.ArrayList;
import java.util.List;

/**
 * Jukebox is a class to model jukebox.
 * <pre>
 *   Jukebox j= new Jukebox(tempDB, -123);
 *   tempDB.addSong(song3);
 *   tempDB.toString();
 *   tempDB.play()
 * </pre>
 * @author Priyanka.D.N. (priyanka@gmail.com)
 * @version 1.2 12 February 2019
 * @see java.util.ArrayList
 */
public class Jukebox {
   private Database db;
   private int creditCard;
   public Jukebox(){
   }
   
   
   
   /** Constructs a new <b>Jukebox</b> and assigns it a
    * @param db the player interested songList.
    * @param creditCard of the player for payment
    */
   public Jukebox(Database db, int creditCard) {
      super();
      this.db = db;
      this.creditCard = creditCard;
   }   
   
   
   
   /**
    * Gives this player's database of songs. 
    *
    * @return The current songlist of the player. 
    */
   public Database getDb() {
      return db;
   }
   
   
   /**
    * sets database to new value with the parameter passed.
    *
    * @param db New value for this database songs. 
    */
   public void setDb(Database db) {
      this.db = db;
   }
   
   
   /**
    * Gives the creditcard used for the payment of jukebox. 
    *
    * @return The current creditcard used for the payment of jukebox. 
    */
   public int getCreditCard() {
      return creditCard;
   }
   
   
   
   
   /**
    * sets creditcard to new value with the parameter passed.
    *
    * @param creditCard New value for this jukebox. 
    */
   public void setCreditCard(int creditCard) {
      this.creditCard = creditCard;
   }
   
   
   /**
    * Determine whether the creditcard is valid or not.
    * @return true if creditcard balance is greater than zero. false otherwise 
    */
   public boolean isValidCreditCard(){
      if(creditCard>0)
         return true;
      else
         return false;
   }
   
   
   
   /**
    * The play method(index) is called to play selected song from the player list of songs interest
    *
    * @param      index,  the song that is  selected to be played from the songList
    */
   void play(int i) {
         Song song=db.getSongList(i);
         song.play();
   }
   
   
   /**
    * The play method is called on this player's database(songlist) where each song is played in a row. 
    */
   void play() {
      for (int index=0;index<db.getSongList().size();index++)
      {
         Song song=db.getSongList(index);
         trace("Currently Playing :"+song.getName());
         song.play();
      }
   }
   
   
   
   
   private void trace(String s){
      System.out.println(s);
   }
   
   
   //Driver
   public static void main(String[] args){
      Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
            "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
      Song song2=new Song("Kannala Kannala", "Kaushik Krish", 
            "Thani Oruvan", "Kannala.mp3", "Mp3", 215);
      Song song3=new Song("Kadhal Cricket", "Kharesma Ravichandran",
            "Thani Oruvan", "D://Cricket.mp3", "Mp3", 214);
      List<Song> tempSongList= new ArrayList<Song>();
      tempSongList.add(song1);
      tempSongList.add(song2);
      tempSongList.add(song3);
      
      Database tempDB= new Database(tempSongList);
      Jukebox j= new Jukebox(tempDB, -123);
      
      //Validation of Credit Card
      System.out.println("Validity of CC : "+j.isValidCreditCard());
      j.getDb().toString();

      System.out.println("\nDeleting Song @ index 2");
      //Deleting Song @ index 2
      j.getDb().removeSong(2);
      j.getDb().toString();
      
      System.out.println("Playing the SongList");
      j.play();
      
      System.out.println("Playing Song @ index 2");
      j.play(2);
   }   
}
    