package chapter02;

import chapter02.decoupled.*;
import chapter02.decoupled.HelloSpringMessageProvider;
import chapter02.decoupled.MessageProvider;
import chapter02.decoupled.MessageRenderer;
import chapter02.decoupled.MessageSupportFactory;
import chapter02.decoupled.StandardOutMessageRenderer;

public class HelloProSpring5 {

    public static void main(String... args) {

        // version 0.1
        // System.out.println(":::::::::::::::::: RUN MAIN ::::::::::::::::::");
        // System.out.println("version 0.1");
        // System.out.println("Hello, ProSpring5!");
        // System.out.println(":::::::::::::::::: END MAIN ::::::::::::::::::");

        // version 0.2
        // if (args.length > 0) {
        //     System.out.println(":::::::::::::::::: RUN MAIN ::::::::::::::::::");
        //     System.out.println("version 0.2");
        //     System.out.println(args[0]);
        //     System.out.println(":::::::::::::::::: END MAIN ::::::::::::::::::");
        // } else {
        //     System.out.println(":::::::::::::::::: RUN MAIN ::::::::::::::::::");
        //     System.out.println("version 0.2");
        //     System.out.println("Hello, ProSpring5! :: else");
        //     System.out.println(":::::::::::::::::: END MAIN ::::::::::::::::::");
        // }

        // version 0.3: 구현체 이름을 적어서 인스턴스를 생성하여 사용
        // MessageRenderer renderer = new StandardOutMessageRenderer();
        // MessageProvider provider = new HelloSpringMessageProvider();
        //
        // renderer.setMessageProvider(provider);
        // renderer.render();

        // version 0.4: 구현체 이름을 적을 필요 없이 주입받아서 사용
        MessageRenderer renderer = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider provider = MessageSupportFactory.getInstance().getMessageProvider();

        System.out.println("version 0.4: 구현체 이름을 적을 필요 없이 주입받아서 사용");
        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
