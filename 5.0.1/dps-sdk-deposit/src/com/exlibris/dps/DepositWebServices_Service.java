
package com.exlibris.dps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "DepositWebServices", targetNamespace = "http://dps.exlibris.com/", wsdlLocation = "http://localhost:1801/dpsws/deposit/DepositWebServices?wsdl")
public class DepositWebServices_Service
    extends Service
{

    private final static URL DEPOSITWEBSERVICES_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.exlibris.dps.DepositWebServices_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.exlibris.dps.DepositWebServices_Service.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:1801/dpsws/deposit/DepositWebServices?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:1801/dpsws/deposit/DepositWebServices?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        DEPOSITWEBSERVICES_WSDL_LOCATION = url;
    }

    public DepositWebServices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DepositWebServices_Service() {
        super(DEPOSITWEBSERVICES_WSDL_LOCATION, new QName("http://dps.exlibris.com/", "DepositWebServices"));
    }

    /**
     * 
     * @return
     *     returns DepositWebServices
     */
    @WebEndpoint(name = "DepositWebServicesPort")
    public DepositWebServices getDepositWebServicesPort() {
        return super.getPort(new QName("http://dps.exlibris.com/", "DepositWebServicesPort"), DepositWebServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DepositWebServices
     */
    @WebEndpoint(name = "DepositWebServicesPort")
    public DepositWebServices getDepositWebServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dps.exlibris.com/", "DepositWebServicesPort"), DepositWebServices.class, features);
    }

}