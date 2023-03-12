package org.io.babyLion.wiseSaying;

import org.io.babyLion.wiseSaying.system.controller.SystemController;
import org.io.babyLion.wiseSaying.wiseSay.controller.WiseSayController;

import java.util.Scanner;

public class App {


    public App() {
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        SystemController systemController = new SystemController();
        WiseSayController wiseSayController = new WiseSayController();

        while (true) {
            System.out.print("명령) ");
            String command = Container.getSc().nextLine().trim();

            if (command.equals("종료")) {
                systemController.exit();
                break;
            } else if (command.equals("등록")) {
                wiseSayController.write();
            } else if (command.equals("목록")) {
                wiseSayController.list();
            }
        }
    }


}
