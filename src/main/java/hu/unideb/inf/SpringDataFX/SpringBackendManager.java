package hu.unideb.inf.SpringDataFX;

import hu.unideb.inf.SpringDataFX.frontend.BackendManager;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringBackendManager implements BackendManager {

    ConfigurableApplicationContext ctx;

    @Override
    public void start() {
        ctx = SpringApplication.run(SpringDataFxApplication.class);
    }

    @Override
    public void stop() {
        if ((ctx!=null)&&(ctx.isClosed())) return;
        ctx.close();
    }

    @Override
    public void print() {

    }
}
