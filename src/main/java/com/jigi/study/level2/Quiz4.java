package com.jigi.study.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Quiz4 {
    public String[] solution(String[] record) {
        ChatRoom chatRoom = new ChatRoom();
        for (String message : record) {
            chatRoom.send(new Command(message));
        }
        return chatRoom.display();
    }

    class ChatRoom {

        private List<Command> commands = new ArrayList<>();
        private HashMap<String, User> users = new HashMap<>();

        public ChatRoom() {
        }

        public void send(Command command) {
            Input input = command.read();
            if (input.isEnter()) {
                User user = command.getUser();
                users.put(user.getUserId(), user);
                commands.add(command);
                return;
            }
            if (input.isChange()) {
                User findUser = users.get(command.getUserId());
                findUser.changeNick(command.getNick());
                return;
            }
            commands.add(command);
        }

        public String[] display() {
            return commands.stream()
                    .map(c -> c.getResult(users.get(c.getUserId())))
                    .toArray(String[]::new);
        }
    }

    class User {
        private final String userId;
        private String nick;

        public User(String userId, String nick) {
            this.userId = userId;
            this.nick = nick;
        }

        public String getUserId() {
            return userId;
        }

        public String getNick() {
            return nick;
        }

        public void changeNick(String nick) {
            this.nick = nick;
        }
    }

    class Command {
        private final Input input;
        private final String[] messages;

        public Command(String message) {
            this.messages = message.split(" ");
            this.input = Input.findInputByCode(messages[0]);
        }

        public Input read() {
            return input;
        }

        public String getResult(User user) {
            if (input.isEnter()) {
                return user.getNick() + "님이 들어왔습니다.";
            }
            if (input.isLeave()) {
                return user.getNick() + "님이 나갔습니다.";
            }
            return null;
        }

        public User getUser() {
            return new User(messages[1], messages[2]);
        }

        public String getUserId() {
            return messages[1];
        }

        public String getNick() {
            return messages[2];
        }
    }

    enum Input {
        Enter, Leave, Change;

        public static Input findInputByCode(String code) {
            return Arrays.stream(Input.values())
                    .filter(i -> i.name().equals(code))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("잘못된 명령입니다."));
        }

        public boolean isEnter() {
            return this == Enter;
        }

        public boolean isLeave() {
            return this == Leave;
        }

        public boolean isChange() {
            return this == Change;
        }
    }
}
