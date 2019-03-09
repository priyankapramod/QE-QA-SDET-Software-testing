#!/bin/sh
# Takes Command line argument of the class to be executed
echo "Starting compilation..."
javac -cp "/Users/priyanpramod/Desktop/jl1.0.jar" ../Song.java ../Database.java ../Jukebox.java -Xlint:unchecked
echo "Compilation Complete."
echo
echo "Execution"
echo "========="
java "../../../../:/Users/priyanpramod/Desktop/jl1.0.jar" com.qa.jukebox.Song #classpath set from src folder (linux )