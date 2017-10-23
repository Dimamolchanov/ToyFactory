package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private static Properties properties;
    private static final String PROPERTIES_FILE_NAME = String.format("properties/toyoptions.properties");

    private PropertiesLoader() {
    }

    public static Properties loadProperties() {

        if (properties == null) {
            properties = new Properties();

            try {
                properties.load(new FileInputStream(PROPERTIES_FILE_NAME));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    public static String getProperty(String key) {
        String propertyValue = loadProperties().getProperty(key);
        return propertyValue;
    }

}
