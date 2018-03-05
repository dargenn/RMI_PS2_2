package common;

import java.io.IOException;
import java.util.Properties;

public class SecurityUtils {
    private SecurityUtils() {
    }

    public static void prepareSecurity() throws IOException {
        Properties properties = PropertiesHelper.getProperties();
        System.setProperty("java.security.policy", properties.getProperty("security.policy.file.path"));
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
    }
}
