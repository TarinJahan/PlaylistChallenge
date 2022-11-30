package io.zipcoder;

import java.util.TreeSet;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int currentSong = 0;
        for (int i = startIndex + 1; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                currentSong = i;
            }
        }

        int up = currentSong - startIndex;
        int down = (startIndex + playList.length) - currentSong;

        return Math.min(up, down);
    }
}
