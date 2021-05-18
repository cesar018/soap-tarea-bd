package pe.edu.upeu.soap.ws.entity;

public class Cliente {
	private String cantidad;
    private String direccion;
    private String dni;
    private String tipodoc;
    private String fecha;
    private int idcliente;
    private String nombres;
    private String numdoc;
    private String nomprod;
    private String stock;
    private String precia;

    public String getCantidad() {
        return cantidad;
    }


    public void setCantidad(String value) {
        this.cantidad = value;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String value) {
        this.direccion = value;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String value) {
        this.dni = value;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String value) {
        this.tipodoc = value;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String value) {
        this.fecha = value;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int value) {
        this.idcliente = value;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String value) {
        this.nombres = value;
    }

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String value) {
        this.numdoc = value;
    }

    public String getNomprod() {
        return nomprod;
    }

    public void setNomprod(String value) {
        this.nomprod = value;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String value) {
        this.stock = value;
    }

    public String getPrecia() {
        return precia;
    }

    public void setPrecia(String value) {
        this.precia = value;
    }

}
