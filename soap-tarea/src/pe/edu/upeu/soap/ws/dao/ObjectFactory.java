package pe.edu.upeu.soap.ws.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import pe.edu.upeu.soap.ws.daoImpl.ReadVenta;
import pe.edu.upeu.soap.ws.daoImpl.ReadVentasResponse;
import pe.edu.upeu.soap.ws.entity.Cliente;
@XmlRegistry
public class ObjectFactory {
	   private final static QName _ReadVenta_QNAME = new QName("http://dao.ws.soap.upeu.edu.pe/", "readVenta");
	    private final static QName _ReadVentaResponse_QNAME = new QName("http://dao.ws.soap.upeu.edu.pe/", "readVentaResponse");

	    /**
	     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.upeu.soap.ws.dao
	     * 
	     */
	    public ObjectFactory() {
	    }

	    /**
	     * Create an instance of {@link ReadVenta }
	     * 
	     */
	    public ReadVenta createReadVenta() {
	        return new ReadVenta();
	    }

	    /**
	     * Create an instance of {@link ReadVentaResponse }
	     * 
	     */
	    public ReadVentasResponse createReadVentaResponse() {
	        return new ReadVentasResponse();
	    }

	    /**
	     * Create an instance of {@link Cliente }
	     * 
	     */
	    public Cliente createCliente() {
	        return new Cliente();
	    }

	    /**
	     * Create an instance of {@link JAXBElement }{@code <}{@link ReadVenta }{@code >}}
	     * 
	     */
	    @XmlElementDecl(namespace = "http://dao.ws.soap.upeu.edu.pe/", name = "readVenta")
	    public JAXBElement<ReadVenta> createReadVenta(ReadVenta value) {
	        return new JAXBElement<ReadVenta>(_ReadVenta_QNAME, ReadVenta.class, null, value);
	    }

	    /**
	     * Create an instance of {@link JAXBElement }{@code <}{@link ReadVentaResponse }{@code >}}
	     * 
	     */
	    @XmlElementDecl(namespace = "http://dao.ws.soap.upeu.edu.pe/", name = "readVentaResponse")
	    public JAXBElement<ReadVentasResponse> createReadVentaResponse(ReadVentasResponse value) {
	        return new JAXBElement<ReadVentasResponse>(_ReadVentaResponse_QNAME, ReadVentasResponse.class, null, value);
	    }

}
