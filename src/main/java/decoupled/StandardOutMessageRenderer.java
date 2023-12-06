package decoupled;

public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

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
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
