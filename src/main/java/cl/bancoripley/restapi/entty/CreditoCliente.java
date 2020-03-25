package cl.bancoripley.restapi.entty;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "credito_clientes")
public class CreditoCliente {

	@Id
	@Column(name = "folio")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal folio;
	@Column(name = "rut")
	private String rut;
	@Column(name = "fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@Column(name = "monto_credito")
	private BigDecimal montoCredito;
	@Column(name = "cuotas")
	private int cuotas;
	@Column(name = "tasa_interes")
	private double tasaInteres;
	@Column(name = "valor_cuota")
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
