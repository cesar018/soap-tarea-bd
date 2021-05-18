package pe.edu.upeu.soap.ws.daoImpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readVenta", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class ReadVenta {
	   protected String arg0;
	    protected String arg1;
	    protected int arg2;

	    public String getArg0() {
	        return arg0;
	    }

	    public void setArg0(String value) {
	        this.arg0 = value;
	    }

	    public String getArg1() {
	        return arg1;
	    }

	    public void setArg1(String value) {
	        this.arg1 = value;
	    }

	    public int getArg2() {
	        return arg2;
	    }

	    public void setArg2(int value) {
	        this.arg2 = value;
	    }
}
