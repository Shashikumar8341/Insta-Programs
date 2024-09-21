package com.src.structuralpatterns;

//How the Adapter Pattern Works:
//The MediaPlayer interface is the target interface that the client (main application) expects.
//The AudioPlayer class is the main player that supports MP3 and can use the adapter to support VLC and MP4.
//The MediaAdapter acts as a bridge, adapting the request to work with AdvancedMediaPlayer implementations (VLC and MP4 players).
//When a non-MP3 format is requested, the adapter converts it to the appropriate advanced player and delegates the call.
//Example: Adapter Design Pattern
//Suppose you have a media player that can only play audio files,but you need it to play video files as well.Using the Adapter pattern,you can create a video player that works with the existing media player interface.
public class Main {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "song.mp3"); // Output: Playing mp3 file. Name: song.mp3
		audioPlayer.play("mp4", "video.mp4"); // Output: Playing mp4 file. Name: video.mp4
		audioPlayer.play("vlc", "movie.vlc"); // Output: Playing vlc file. Name: movie.vlc
		audioPlayer.play("avi", "movie.avi"); // Output: Invalid media. avi format not supported
	}
}
