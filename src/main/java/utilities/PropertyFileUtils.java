package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtils {
    static String CONFIG_FILE_PATH = "src/main/resources/config.properties";
    public static String getProperty(String propertyName) {
        Properties properties = new Properties();
        try {
            FileInputStream configFile = new FileInputStream(CONFIG_FILE_PATH);
            properties.load(configFile);
            return properties.getProperty(propertyName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}