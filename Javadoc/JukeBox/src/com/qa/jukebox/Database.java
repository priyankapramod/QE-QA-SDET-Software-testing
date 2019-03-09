package com.qa.jukebox;

import java.util.ArrayList;
import java.util.List;


/**
 * Database is a class to model database.
 * <pre>
 *   Database tempDB= new Database(tempSongList);
 *   tempDB.addSong(song3);
 *   tempDB.toString();
 *   tempDB.play()
 *   tempDB.play(2)
 *   tempDB.removeSong(song3)
 *   
 * </pre>
 * @author Priyanka.D.N. (priyanka@gmail.com)
 * @version 1.2 12 February 2019
 * @see java.util.ArrayList
 */
public class Database {

	
   /**
    * songList is song's list name
	*/	
   private List<Song> songList;
   
   
   /** 
    * Constructs a new <b>Database</b>
    */
   public Database(){
      this.songList=new ArrayList<Song>();
   }
   
   
   
   
   
   
   /** 
    * 
    * Constructs a new <b>Database</b> and assigns it a
    * @param songList a list of songs of player's interest
   */
   public Database(List<Song> songList){
      this.songList=songList;
   }
   
   
   
   
   
   /**
    * Gives list of the songs of player's database. 
    *
    * @return The current list of  songs of this player 
    */
   public List<Song> getSongList() {
      return songList;
   }
   
   
   
   /**
    * Gives selected  song from the database. 
    *
    * @return selected song from the  list 
    * @param index  from list of songs of player's interest
    */
   public Song getSongList(int index) {
      if(songList.size()>=index)
         return songList.get(index);
      else
         return null;
   }
   
   
   /**
    * sets songList to new value with the parameter passed.
    *
    * @param songList New value for this songs list. 
    */
   public void setSongList(List<Song> songList) {
      this.songList = songList;
   }
   
   
   /**
    * Determine whether this songList is empty or not.
    * @return true. if the list is empty. Otherwise false
    *  
    * 
    */
   public boolean isEmpty(){
      return this.songList.isEmpty();
   }
   
   
   /**
    * The addSong method is called to add new song to this player's database
    *
    * @param     song  the value to be added to the songList
    */
   public void addSong(Song song){
      songList.add(song);
   }
   
   
   /**
    * The removeSong method(song obj) is called to remove selected song from the player's database
    *
    * @param     song Object the value to be removed from the songList
    */
   public void removeSong(Song song){
      if(songList.contains(song)){
         songList.remove(song);
      }
   }
   
   
   
   /**
    * The removeSong method(index) is called to remove selected song from the player's database
    * @param index in list,  the value to be removed from the songList
    */
   public void removeSong(int index){
         songList.remove(index);
   }
   
   
   
   private void trace(String s){
      System.out.println(s);
   }
   
   
   
   /**
    * The string representation is each song in the songlist
    * Where each song from list is accessed using index of list i.e., database.
    */
   public String toString(){   
      System.out.println("Song List:\n================");
      for(int i=0;i<songList.size();i++){
         trace(i+":\t"+songList.get(i).toString());
      }
      return "";
   }

   // Henry's comment
   //   Database does not need to have the functionality of play.
   /**
    * The play method(index) is called to play selected song from the player's database.
    *
    * @param      index,  the song that is  selected to be played from the songList
    */
   public void play(int index){
      System.out.println("Playing Song : "+ songList.get(index).toString());
      songList.get(index).play();
   }
   
   
   /**
    * The play method is called on this player's database or songlist where each song is played in a row. 
    */
   public void play(){
      for(int index=0;index<songList.size();index++)
         play(index);
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
         tempSongList.add(song2);
         tempSongList.add(song1);
         
         Database tempDB= new Database(tempSongList);
         tempDB.toString();
         System.out.println("\nAdding Song ");
         tempDB.addSong(song3);
         tempDB.toString();
         System.out.println("Playing Complete SongList");
         tempDB.play();
         
         System.out.println("Playing Song @ index 2");
         tempDB.play(2);
      }   
}