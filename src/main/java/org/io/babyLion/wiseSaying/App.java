package org.io.babyLion.wiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run () {
        System.out.println("== 명언 앱 ==");

        int number = 0;

        List<WiseSay> wiseSays = new ArrayList<>();

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {

                int id = number + 1;

                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = sc.nextLine().trim();

                WiseSay say = new WiseSay(id, content, author);
                wiseSays.add(say);

                System.out.printf("%s번 명언이 등록되었습니다.\n", id);

                number = id;

            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(20));

                for (int i = 0; i < wiseSays.size(); i++ ){
                    WiseSay wiseSay = wiseSays.get(i);
                    System.out.printf("%d / %s / %s\n", wiseSay.getId(), wiseSay.getAuthor(), wiseSay.getContent());
                }
            }

        }
    }


}
