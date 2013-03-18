import com.adstream.webservice.orders.*;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import java.lang.Exception;
import java.net.URL;
import java.net.URLClassLoader;


/**
 * Created with IntelliJ IDEA.
 * User: mikepollitt
 * Date: 18/03/13
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    private static WSOrderManager orderManagerService;

    public static void main(String[] args) {
        if (args.length != 2) {
            printUsage();
            return;
        }
        String username = args[0];
        String password = args[1];

        try {
            orderManagerService = new WSOrderManager();
            System.out.println("Calling createNewAdvertiserAndProduct...");
            WSOrderManagerSoap s = orderManagerService.getWSOrderManagerSoap();
            AdvertiserProduct ap = s.createNewAdvertiserAndProduct("Mike's Test Advertiser", "Mike's Test Product");
            System.out.println("Got: Advertiser: " + ap.getNewAdvertiser() + ", Product: " + ap.getNewProduct());
        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

    private static void printUsage() {
        System.out.println("\nUsage: java Test USER PASS\n");
    }

}
