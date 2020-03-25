package cl.bancoripley.restapi.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CreditoClienteDTO {

	private BigDecimal folio;
	
	private String rut;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha;

	private BigDecimal montoCredito;

	private int cuotas;

	private double tasaInteres;

	private long valorCuota;

	public BigDecimal getFolio() {
		return folio;
	}

	public void setFolio(BigDecimal folio) {
		this.folio = folio;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMontoCredito() {
		return montoCredito;
	}

	public void setMontoCredito(BigDecimal montoCredito) {
		this.montoCredito = montoCredito;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public long getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(long valorCuota) {
		this.valorCuota = valorCuota;
	}

}
