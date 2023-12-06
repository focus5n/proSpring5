package chapter02.decoupled;

public class StandardOutMessageRenderer implements chapter02.decoupled.MessageRenderer {
    private chapter02.decoupled.MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            String alertMessage = "Please set the property messageProvider of class: ";
            throw new RuntimeException(alertMessage + StandardOutMessageRenderer.class.getName());
        } else {
            System.out.println(":::::::::::::::::: RUN RENDER ::::::::::::::::::");
            System.out.println("Provided By: " + messageProvider.getClass().getName());
            System.out.println(messageProvider.getMessage());
            System.out.println(":::::::::::::::::: END RENDER ::::::::::::::::::");
        }
    }

    @Override
    public void setMessageProvider(chapter02.decoupled.MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public chapter02.decoupled.MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
