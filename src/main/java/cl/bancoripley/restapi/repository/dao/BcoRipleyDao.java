package cl.bancoripley.restapi.repository.dao;

import java.math.BigDecimal;
import java.util.List;

import cl.bancoripley.restapi.entty.CreditoCliente;

public interface BcoRipleyDao {

	public List<CreditoCliente> getAllCreditoCliente() ;
	 
	public CreditoCliente getCreditoCliente(BigDecimal folio) ;
 
	public CreditoCliente addCreditoCliente(CreditoCliente creditoCliente);
 
	public void updateCreditoCliente(CreditoCliente creditoCliente) ;
 
	public void deleteCreditoCliente(BigDecimal folio) ;
	
}
