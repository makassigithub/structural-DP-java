package org.makassi.adapter;

public class Mp4MediaPlayerAdapter implements MediaPlayer {
    private final Mp4MediaPlayer mp4MediaPlayer =  new Mp4MediaPlayer();
    @Override
    public void play(String fileName) {
        mp4MediaPlayer.playMp4(fileName);
    }
}
