package com.sh.collection.list.music.view;

import java.util.Scanner;

import com.sh.collection.list.music.controller.MusicManager;

public class MusicMenu {
    Scanner sc = new Scanner(System.in);
    MusicManager manager = new MusicManager();
    
    String menu =     "================ Music Playlist Menu ================\n"+
    "1.목록보기\n"+
    "2.마지막에 음악추가\n"+
    "3.맨처음에 음악추가\n"+
    "4.곡삭제\n"+
    "5.곡변경\n"+
    "6.곡명검색\n"+
    "7.가수검색\n"+
    "8.목록정렬(곡명오름차순)\n"+
    "0.종료\n"+
    "================================================================\n"+">> 메뉴선택 : ";



}
