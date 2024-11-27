package DataDrivenTesing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropetiesFile {

    public static void main(String[] args) throws IOException {
        // Main method to demonstrate reading data from a properties file

        // Step 1: Specify the location of the properties file
        // Using System.getProperty("user.dir") to get the current working directory dynamically
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\config.properties");

        // Step 2: Create a Properties object
        // This will be used to load and access the key-value pairs in the properties file
        Properties propertiesobj = new Properties();

        // Step 3: Load the properties file into the Properties object
        propertiesobj.load(file);

        // Step 4: Read specific key-value pairs from the properties file
        String url = propertiesobj.getProperty("appurl");        // Read value for key "appurl"
        String email = propertiesobj.getProperty("email");       // Read value for key "email"
        String pwd = propertiesobj.getProperty("password");      // Read value for key "password"
        String orid = propertiesobj.getProperty("orderid");      // Read value for key "orderid"
        String custid = propertiesobj.getProperty("customerid"); // Read value for key "customerid"

        // Step 5: Print the retrieved key-value pairs
        System.out.println(url + " " + email + " " + pwd + " " + orid + " " + custid);

        // Step 6: Read all the keys from the properties file
        // Using keySet() to get a set of all keys
        Set<Object> keys = propertiesobj.keySet();
        System.out.println(keys); // Prints all the keys in the properties file

        // Step 7: Read all the values from the properties file
        // Using values() to get a collection of all values
        Collection<Object> values = propertiesobj.values();
        System.out.println(values); // Prints all the values in the properties file

        // Step 8: Close the FileInputStream to release resources
        file.close();
    }
}
