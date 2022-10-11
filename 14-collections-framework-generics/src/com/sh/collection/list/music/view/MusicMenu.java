package com.sh.collection.list.music.view;

import java.util.Comparator;
import java.util.Scanner;

import com.sh.collection.list.music.controller.MusicManager;
import com.sh.collection.list.music.model.vo.Music;

public class MusicMenu {
    private MusicManager manager = new MusicManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        String menu = "----- Music Playlist Menu -----\r\n" +
                "1.목록보기\r\n" +
                "2.마지막에 음악추가\r\n" +
                "3.맨 처음에 음악추가\r\n" +
                "4.곡삭제\r\n" +
                "5.곡변경\r\n" +
                "6.곡명검색\r\n" +
                "7.가수검색\r\n" +
                "8.목록정렬(곡명오름차순)\r\n" +
                "0.종료\r\n" +
                "--------------------------------\r\n" +
                ">> 메뉴선택 : ";

        while (true) {
            System.out.print(menu);

            String choice = sc.next();
            Music music = new Music();

            switch (choice) {
                case "1":
                    manager.selectList();
                    break;
                case "2":
                    System.out.print("마지막에 추가할 곡 제목 입력 > ");
                    music.setTitle(sc.next());
                    System.out.print("\n가수 이름 입력 > ");
                    music.setSinger(sc.next());
                    manager.addList(music);
                    break;
                case "3":
                    System.out.print("맨 처음에 추가할 곡 제목 입력 > ");
                    music.setTitle(sc.next());
                    System.out.print("가수 이름 입력 > ");
                    music.setSinger(sc.next());
                    manager.addAtZero(music);
                    break;
                case "4":
                    System.out.print("삭제할 곡 제목 입력 >");
                    String musicName = sc.next();
                    manager.removeMusic(musicName);
                    break;
                case "5":
                    System.out.print("교체할 곡 제목 입력 >");
                    String replaceMusic = sc.next();
                    System.out.print("교체할 가수 이름 입력 > ");
                    String replaceSinger = sc.next();
                    Music oldMusic = new Music(replaceMusic, replaceSinger);

                    System.out.print("교체하여 추가할 곡 제목 입력 > ");
                    String newMusicAtZero = sc.next();
                    System.out.print("가수 이름 입력 > ");
                    String newSingerAtZero = sc.next();
                    Music newMusic = new Music(newMusicAtZero, newSingerAtZero);
                    manager.replaceMusic(oldMusic, newMusic);
                    break;
                case "6":
                    System.out.print("검색할 곡 제목 입력 > ");
                    String title = sc.next();
                    manager.searchMusicByTitle(title);
                    break;
                case "8":
                    orderMenu();
                    break;
            }

        }

    }

    private void orderMenu() {
        String orderMenu = "================== 정렬 메뉴 ===================\r\n" +
                "1. 가수명 오름차순\r\n" +
                "2. 가수명 내림차순\r\n" +
                "3. 곡명 오름차순\r\n" +
                "4. 곡명 내림차순\r\n" +
                "5. 메인메뉴 돌아가기\r\n" +
                "================================================\r\n" +
                " >> 메뉴 선택 : ";
        // while(true) {
        // System.out.print(orderMenu);
        // String choice = sc.next();

        // switch(choice) {
        // case "1" : manager.orderBy(null); break;
        // case "2" : break;
        // case "3" : manager.orderBy(new Comparator<Music>()); break;

        // case "5" : return; // orderMenu 호출한 곳으로 리턴
        // }

        // }

    }
}