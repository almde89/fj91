
package br.com.caelum.fj91.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DicionarioService", targetNamespace = "http://ws.caelum.com.br/", wsdlLocation = "http://localhost:8080/Dicionario?wsdl")
public class DicionarioService
    extends Service
{

    private final static URL DICIONARIOSERVICE_WSDL_LOCATION;
    private final static WebServiceException DICIONARIOSERVICE_EXCEPTION;
    private final static QName DICIONARIOSERVICE_QNAME = new QName("http://ws.caelum.com.br/", "DicionarioService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Dicionario?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DICIONARIOSERVICE_WSDL_LOCATION = url;
        DICIONARIOSERVICE_EXCEPTION = e;
    }

    public DicionarioService() {
        super(__getWsdlLocation(), DICIONARIOSERVICE_QNAME);
    }

    public DicionarioService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DICIONARIOSERVICE_QNAME, features);
    }

    public DicionarioService(URL wsdlLocation) {
        super(wsdlLocation, DICIONARIOSERVICE_QNAME);
    }

    public DicionarioService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DICIONARIOSERVICE_QNAME, features);
    }

    public DicionarioService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DicionarioService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Dicionario
     */
    @WebEndpoint(name = "DicionarioPort")
    public Dicionario getDicionarioPort() {
        return super.getPort(new QName("http://ws.caelum.com.br/", "DicionarioPort"), Dicionario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Dicionario
     */
    @WebEndpoint(name = "DicionarioPort")
    public Dicionario getDicionarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.caelum.com.br/", "DicionarioPort"), Dicionario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DICIONARIOSERVICE_EXCEPTION!= null) {
            throw DICIONARIOSERVICE_EXCEPTION;
        }
        return DICIONARIOSERVICE_WSDL_LOCATION;
    }

}
