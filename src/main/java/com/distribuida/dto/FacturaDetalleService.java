package com.distribuida.dto;

import java.util.List;



import com.distribuida.entities.FacturaDetalle;

public interface FacturaDetalleService {
	
public List<FacturaDetalle> findAll();
	
	public FacturaDetalle findOne(int id);
	
	public void add(FacturaDetalle facturaDetalle);
	
	public void up(FacturaDetalle facturaDetalle);
	
	public void del(int id);
	
	public List<FacturaDetalle> findAll(String busqueda);
	
	
	public void add(int idFacturaDetealle, int cantidad, Double subtotal, int idFactura, int idLibro);

	void up(int idFacturaDetealle, int cantidad, Double subtotal, int idFactura, int idLibro);


}
