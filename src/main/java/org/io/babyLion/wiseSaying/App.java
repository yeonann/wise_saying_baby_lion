package org.io.babyLion.wiseSaying;

import org.io.babyLion.wiseSaying.system.controller.SystemController;
import org.io.babyLion.wiseSaying.wiseSay.controller.WiseSayController;

import java.util.HashMap;
import java.util.Map;

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
            } else if (command.startsWith("삭제")) {

                String[] commandBits = command.split("\\?", 2);
                String actioncode = commandBits[0];
                Map<String, String> parameters = new HashMap<>();
                String[] parameterBits = commandBits[1].split("&");

                for (String parameter : parameterBits) {
                    String[] parameterBit = parameter.split("=", 2);
                    String key = parameterBit[0];
                    String value = parameterBit[1];

                    parameters.put(key, value);
                }

                System.out.printf("%s\n", actioncode);
                System.out.printf("%s\n", parameters);
                System.out.println("삭제되었습니다.");

            }
        }
    }


}
