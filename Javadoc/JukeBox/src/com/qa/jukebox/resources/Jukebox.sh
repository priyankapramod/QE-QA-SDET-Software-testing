#!/bin/sh
# this file should be in com.qa.jukebox.resources folder
echo "Starting compilation..."
# add 
javac -cp "/Users/priyanpramod/Desktop/jl1.0.jar" ../Song.java ../Database.java ../Jukebox.java -Xlint:unchecked
echo "Compilation Complete."
echo
echo "Execution"
echo "========="
java -classpath "../../../../:/Users/priyanpramod/Desktop/jl1.0.jar" com.qa.jukebox.Jukebox
#relative path from current folder
#src parent folder of com.qa.jukebox.Jukebox


#absolute path is from root. so can be executed from anywhere 