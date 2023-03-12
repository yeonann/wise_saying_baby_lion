package org.io.babyLion.wiseSaying.wiseSay.controller;

import org.io.babyLion.wiseSaying.Container;
import org.io.babyLion.wiseSaying.WiseSay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayController {

    private int number;
    private List<WiseSay> wiseSays;

    public WiseSayController() {
        this.number = 0;
        this.wiseSays = new ArrayList<>();
    }

    public void write () {

        int id = number + 1;

        System.out.print("명언 : ");
        String content = Container.getSc().nextLine().trim();
        System.out.print("작가 : ");
        String author = Container.getSc().nextLine().trim();

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
