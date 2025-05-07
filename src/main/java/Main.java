import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class Main implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Argon2Util argon2Util = new Argon2Util();
        String password = argon2Util.hashWithArgon2Defaults("password");
        argon2Util.equals("password", password);
    }
}

