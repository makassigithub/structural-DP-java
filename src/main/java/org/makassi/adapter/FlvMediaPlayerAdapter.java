package org.makassi.adapter;

public class FlvMediaPlayerAdapter implements MediaPlayer {
   private final FlvMediaPlayer flvMediaPlayer = new FlvMediaPlayer();

    @Override
    public void play(String fileName) {
      flvMediaPlayer.playFlv(fileName);
    }
}
