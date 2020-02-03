package classes;

import java.util.concurrent.atomic.AtomicInteger;

public class Chat {
    Chat()
    {
        chatID = num.incrementAndGet();
    }
    int chatID;
    static AtomicInteger num = new AtomicInteger(1);

    public int getChatID() {
        return chatID;
    }

    public void setChatID(int chatID) {
        this.chatID = chatID;
    }
}
