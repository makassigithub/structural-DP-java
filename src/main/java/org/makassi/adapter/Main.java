package org.makassi.adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mp4Player = new Mp4MediaPlayerAdapter();
        MediaPlayer mp3Player = new Mp3MediaPlayerAdapter();
        MediaPlayer flvPlayer = new FlvMediaPlayerAdapter();

        mp4Player.play("solo-dance.mp4");
        mp3Player.play("nice-music.mp3");
        flvPlayer.play("solo-movie.flv");
    }
}