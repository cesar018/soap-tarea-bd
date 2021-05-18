package pe.edu.upeu.soap.ws.daoImpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import pe.edu.upeu.soap.ws.entity.Cliente;

public interface ClienteDao {
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readVenta", targetNamespace = "http://dao.ws.soap.upeu.edu.pe/", className = "pe.edu.upeu.soap.ws.dao.ReadVenta")
    @ResponseWrapper(localName = "readVentaResponse", targetNamespace = "http://dao.ws.soap.upeu.edu.pe/", className = "pe.edu.upeu.soap.ws.dao.ReadVentaResponse")
    @Action(input = "http://dao.ws.soap.upeu.edu.pe/ClienteDao/readVentaRequest", output = "http://dao.ws.soap.upeu.edu.pe/ClienteDao/readVentaResponse")
    public Cliente readVenta(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);
}
