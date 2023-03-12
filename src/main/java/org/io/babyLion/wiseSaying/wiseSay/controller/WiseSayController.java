package org.io.babyLion.wiseSaying.wiseSay.controller;

import org.io.babyLion.wiseSaying.WiseSay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayController {

    private final Scanner sc;
    private int number;
    private List<WiseSay> wiseSays;

    public WiseSayController(Scanner sc) {
        this.sc = sc;
        this.number = 0;
        this.wiseSays = new ArrayList<>();
    }

    public void write () {
        int id = number + 1;

        System.out.print("명언 : ");
        String content = sc.nextLine().trim();
        System.out.print("작가 : ");
        String author = sc.nextLine().trim();

        WiseSay say = new WiseSay(id, content, author);
        wiseSays.add(say);

        System.out.printf("%s번 명언이 등록되었습니다.\n", id);
        number = id;
    }

    public void list () {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("-".repeat(20));

        for (int i = 0; i < wiseSays.size(); i++ ){
            WiseSay wiseSay = wiseSays.get(i);
            System.out.printf("%d / %s / %s\n", wiseSay.getId(), wiseSay.getAuthor(), wiseSay.getContent());
        }
    }
}
