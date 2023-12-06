package chapter02.decoupled;


public class HelloSpringMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        String message = "Hello, Spring5";
        return message;
    }
}
