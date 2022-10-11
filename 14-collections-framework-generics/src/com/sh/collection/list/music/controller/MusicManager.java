package com.sh.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.sh.collection.list.music.model.vo.Music;

public class MusicManager {

    private ArrayList<Music> musicList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public MusicManager() {
        musicList.add(new Music("좋은밤 좋은꿈", "너드커넥션"));
        musicList.add(new Music("밤편지", "아이유"));
        musicList.add(new Music("버터", "BTS"));
        musicList.add(new Music("고작", "오지은"));
        musicList.add(new Music("별빛이 내린다", "안녕바다"));
    }

    // 1. 음악 리스트 리턴
    public List<Music> selectList() {
        System.out.println(musicList);
        return musicList;
    }

    // 2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드.
    public void addList(Music music) {
        musicList.add(music);
    }

    // 3. 3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
    public void addAtZero(Music music) {
        musicList.add(0, music);
    }

    // 4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제) - 삭제여부를 리턴
    public boolean removeMusic(String musicName) {
        for (int i = 0; i < musicList.size(); i++) {
            Music music = musicList.get(i);
            if (music.getTitle().equals(musicName)) {
                musicList.remove(music);
                return true;
            } else {
                System.out.println("삭제 실패! : 존재하지 않는 곡입니다.");
            }
        }
        return false;
    }

    // 5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체) - 교체 성공여부를 리턴
    public boolean replaceMusic(Music oldMusic, Music newMusic) {

        if (musicList.indexOf(oldMusic) == -1) {
            System.out.println("교체 실패! : 존재하지 않는 곡입니다.");
            return false;
        } else {
            musicList.set(musicList.indexOf(oldMusic), newMusic);
            return true;
        }
    }

    // 6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. (곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를
    // 출력하고, 없다면, "검색결과가 없습니다"출력)
    public List<Music> searchMusicByTitle(String title) {
        for (int i = 0; i < musicList.size(); i++) {
            Music music = musicList.get(i);
            if (music.getTitle().contains(title)) {
                System.out.println(music);
            } else {
                System.out.println("검색 실패! : 검색 결과가 없습니다.");
                break;
            }
        }
        return musicList;
    }

    // 7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
    public List<Music> searchMusicBySinger(String singer) {
        System.out.print("검색할 가수 이름 입력 > ");
        String searchSinger = sc.next();

        for (Music str : musicList) {
            if (str.equals(searchSinger) == true) {
                System.out.println(musicList.get(musicList.indexOf(searchSinger)));
            } else {
                System.out.println("교체 실패 : 존재하지 않는 가수입니다.");
            }
        }
        return musicList;
    }

    // 8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
    public List<Music> orderBy(Comparator<Music> c) {

        return musicList;

    }

}
