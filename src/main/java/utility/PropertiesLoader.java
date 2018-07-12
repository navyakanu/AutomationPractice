package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by navyab on 7/2/18.
 */
public class PropertiesLoader {

    public static Properties prop;

    public static void LoadProperties() throws IOException {

        prop = new Properties();
        InputStream input = null;
        String pathtoPropertiesFile = System.getProperty("user.dir") + "/src/main/resources/config.properties";
        input = new FileInputStream(pathtoPropertiesFile);
        prop.load(input);

    }

    public static String getPropertyDetails(String s) {

        String details = PropertiesLoader.prop.getProperty(s);
        return details;
    }


}
