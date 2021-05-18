package pe.edu.upeu.soap.ws.daoImpl;

import java.net.MalformedURLException;
import java.net.URL;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
@WebServiceClient(name = "ClienteDaoImplService", targetNamespace = "http://daoImpl.ws.soap.upeu.edu.pe/", wsdlLocation = "http://localhost:6060/soap/cliente?wsdl")
public class ClienteDaoImplService extends Service{
    private final static URL CLIENTEDAOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTEDAOIMPLSERVICE_EXCEPTION;
    private final static QName CLIENTEDAOIMPLSERVICE_QNAME = new QName("http://daoImpl.ws.soap.upeu.edu.pe/", "ClienteDaoImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:6060/soap/cliente?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTEDAOIMPLSERVICE_WSDL_LOCATION = url;
        CLIENTEDAOIMPLSERVICE_EXCEPTION = e;
    }

    public ClienteDaoImplService() {
        super(__getWsdlLocation(), CLIENTEDAOIMPLSERVICE_QNAME);
    }

    public ClienteDaoImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTEDAOIMPLSERVICE_QNAME, features);
    }

    public ClienteDaoImplService(URL wsdlLocation) {
        super(wsdlLocation, CLIENTEDAOIMPLSERVICE_QNAME);
    }

    public ClienteDaoImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTEDAOIMPLSERVICE_QNAME, features);
    }

    public ClienteDaoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClienteDaoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClienteDao
     */
    @WebEndpoint(name = "ClienteDaoImplPort")
    public ClienteDao getClienteDaoImplPort() {
        return super.getPort(new QName("http://daoImpl.ws.soap.upeu.edu.pe/", "ClienteDaoImplPort"), ClienteDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClienteDao
     */	
    @WebEndpoint(name = "ClienteDaoImplPort")
    public ClienteDao getClienteDaoImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://daoImpl.ws.soap.upeu.edu.pe/", "ClienteDaoImplPort"), ClienteDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTEDAOIMPLSERVICE_EXCEPTION!= null) {
            throw CLIENTEDAOIMPLSERVICE_EXCEPTION;
        }
        return CLIENTEDAOIMPLSERVICE_WSDL_LOCATION;
    }
}
