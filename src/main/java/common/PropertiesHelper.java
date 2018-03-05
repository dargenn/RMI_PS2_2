package common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class PropertiesHelper {
    private PropertiesHelper() {
    }

    static Properties getProperties() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = PropertiesHelper.class.getClassLoader().getResourceAsStream("configuration.properties");
        properties.load(inputStream);
        return properties;
    }
}
