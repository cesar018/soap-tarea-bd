package pe.edu.upeu.soap.ws.daoImpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import pe.edu.upeu.soap.ws.entity.Cliente;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readVentaResponse", propOrder = {
    "_return"
})
public class ReadVentasResponse {
	  @XmlElement(name = "return")
	    protected Cliente _return;

	    /**
	     * Obtiene el valor de la propiedad return.
	     * 
	     * @return
	     *     possible object is
	     *     {@link Cliente }
	     *     
	     */
	    public Cliente getReturn() {
	        return _return;
	    }

	    /**
	     * Define el valor de la propiedad return.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link Cliente }
	     *     
	     */
	    public void setReturn(Cliente value) {
	        this._return = value;
	    }
}
