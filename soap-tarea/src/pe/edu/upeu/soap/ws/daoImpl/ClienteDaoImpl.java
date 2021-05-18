package pe.edu.upeu.soap.ws.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.jws.WebService;

import pe.edu.upeu.soap.ws.entity.Cliente;
import pe.edu.upeu.soap.ws.util.Conexion;
@WebService(endpointInterface = "pe.edu.upeu.soap.ws.dao.ClienteDao")
public class ClienteDaoImpl {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	public Cliente readVenta(String fecha_ini, String fecha_fin, int id) {
		Cliente client = new Cliente();


		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement("Select fecha,nombres, direccion ,  dni , nomprod , tipodoc , numdoc ,  "
					+ " cantidad, stock, precia  from detalle_venta d join ventas v on v.idventa = d.idventa "
					+ " join producto p on p.idproducto = d.idproducto join cliente c "
					+ " on v.idcliente = c.idcliente where"
					+ " c.idcliente = ? and v.fecha >= ?  and v.fecha <= ? ");
			ps.setInt(1, id);
			ps.setString(2, fecha_ini);
			ps.setString(3, fecha_fin);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				
					client.setFecha(rs.getString("fecha"));
					client.setNombres(rs.getString("nombre"));
					client.setDireccion(rs.getString("direccion"));
					client.setDni(rs.getString("dni"));
					client.setNomprod(rs.getString("producto"));
					client.setTipodoc(rs.getString("documento"));
					client.setNumdoc(rs.getString("numdoc"));
					client.setCantidad(rs.getString("cantidad"));
					client.setStock(rs.getString("stock"));
					client.setPrecia(rs.getString("subtotal"));	
			}
						
		} catch (Exception e) {
			System.out.println(e);
		}					
		return client;
	}
	
}
