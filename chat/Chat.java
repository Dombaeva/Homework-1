package dmdew.map.homeworkUser.chat;

import java.util.List;

public class Chat {
    private String name;
    private List<User> user;

    public Chat(String name, List<User> user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public List<User> getUser() {
        return user;
    }
}

