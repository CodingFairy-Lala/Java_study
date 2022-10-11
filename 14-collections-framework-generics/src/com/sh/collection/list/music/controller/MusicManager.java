package com.sh.collection.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.sh.collection.list.music.model.vo.Music;

public class MusicManager {

    private ArrayList<Music> musicList;

    public MusicManager() {
        musicList.add(new Music("좋은밤 좋은꿈", "너드커넥션"));
        musicList.add(new Music("밤편지", "아이유"));
        musicList.add(new Music("버터", "BTS"));
        musicList.add(new Music("고작", "오지은"));
        musicList.add(new Music("별빛이 내린다", "안녕바다"));
    }

    // 1. 음악 리스트 리턴
    public List<Music> selectList() {
        return musicList;
    }

    // 2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드.
    public void addList(Music music) {

    }
}
