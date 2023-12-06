package chapter02.decoupled;

public interface MessageRenderer {
    void render();
    void setMessageProvider(chapter02.decoupled.MessageProvider provider);
    chapter02.decoupled.MessageProvider getMessageProvider();
}
