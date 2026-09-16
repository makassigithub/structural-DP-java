package org.makassi.adapter;

public class Mp3MediaPlayerAdapter implements MediaPlayer {
    private final Mp3MediaPlayer mp3MediaPlayer =  new Mp3MediaPlayer();

    @Override
    public void play(String fileName) {
        mp3MediaPlayer.playMp3(fileName);
    }
}
