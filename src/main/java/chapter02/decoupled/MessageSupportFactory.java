package chapter02.decoupled;

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties;
    private chapter02.decoupled.MessageRenderer renderer;
    private chapter02.decoupled.MessageProvider provider;

    private MessageSupportFactory() {
        properties = new Properties();

        try {
            properties.load(this.getClass().getResourceAsStream("/chapter02/messageSupportFactory.properties"));
            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            renderer = (chapter02.decoupled.MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (chapter02.decoupled.MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    // Make Singleton
    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public chapter02.decoupled.MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public chapter02.decoupled.MessageProvider getMessageProvider() {
        return provider;
    }
}
