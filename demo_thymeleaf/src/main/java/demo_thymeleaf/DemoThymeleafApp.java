package demo_thymeleaf;

import org.noear.solon.Solon;

/**
 * @author noear 2021/6/12 created
 */
public class DemoThymeleafApp {
    public static void main(String[] args) {
        Solon.start(DemoThymeleafApp.class, args)
                .onError(e->e.printStackTrace());
    }
}
