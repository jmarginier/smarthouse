
package smarthouse.ejb.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.jinouts.xml.namespace.QName;
import org.jinouts.jws.WebMethod;
import org.jinouts.jws.WebParam;
import org.jinouts.jws.WebResult;
import org.jinouts.jws.WebService;
import org.jinouts.xml.bind.annotation.XmlSeeAlso;
import org.jinouts.xml.ws.RequestWrapper;
import org.jinouts.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-03-06T17:27:10.961+01:00
 * Generated source version: 2.7.3
 * 
 */
public final class HousePilot_HousePilotPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.ejb.smarthouse/", "HousePilotBeanService");

    private HousePilot_HousePilotPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HousePilotBeanService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        HousePilotBeanService ss = new HousePilotBeanService(wsdlURL, SERVICE_NAME);
        HousePilot port = ss.getHousePilotPort();  
        
        {
        System.out.println("Invoking executeAction...");
        smarthouse.ejb.service.ActionRequest _executeAction_arg0 = null;
        try {
            smarthouse.ejb.service.ActionResponse _executeAction__return = port.executeAction(_executeAction_arg0);
            System.out.println("executeAction.result=" + _executeAction__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
