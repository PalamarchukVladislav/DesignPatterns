package mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    private Admin admin;
    private List<User> users = new ArrayList<>();

    void setAdmin(Admin admin) {
        this.admin = admin;
    }

    SimpleTextChat() {

    }

    void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }

}
