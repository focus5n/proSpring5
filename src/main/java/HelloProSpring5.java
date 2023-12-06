import decoupled.HelloSpringMessageProvider;
import decoupled.MessageProvider;
import decoupled.MessageRenderer;
import decoupled.StandardOutMessageRenderer;

public class HelloProSpring5 {

    public static void main(String... args) {

        // version 0.1
        // System.out.println(":::::::::::::::::: RUN MAIN ::::::::::::::::::");
        // System.out.println("version 0.1");
        // System.out.println("Hello, ProSpring5!");
        // System.out.println(":::::::::::::::::: END MAIN ::::::::::::::::::");

        // version 0.2
        /*
        if (args.length > 0) {
            System.out.println(":::::::::::::::::: RUN MAIN ::::::::::::::::::");
            System.out.println("version 0.2");
            System.out.println(args[0]);
            System.out.println(":::::::::::::::::: END MAIN ::::::::::::::::::");
        } else {
            System.out.println(":::::::::::::::::: RUN MAIN ::::::::::::::::::");
            System.out.println("version 0.2");
            System.out.println("Hello, ProSpring5! :: else");
            System.out.println(":::::::::::::::::: END MAIN ::::::::::::::::::");
        }
        */

        // version 0.3
        MessageRenderer renderer = new StandardOutMessageRenderer();
        MessageProvider provider = new HelloSpringMessageProvider();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
