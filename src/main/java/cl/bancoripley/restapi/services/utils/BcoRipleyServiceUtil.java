package cl.bancoripley.restapi.services.utils;

import java.util.ArrayList;
import java.util.List;

import cl.bancoripley.restapi.entty.CreditoCliente;
import cl.bancoripley.restapi.model.CreditoClienteDTO;

public class BcoRipleyServiceUtil {

	public static CreditoCliente castCreditoCliente(CreditoClienteDTO creditoClienteDTO) {

		CreditoCliente creditoCliente = new CreditoCliente();

		creditoCliente.setFolio(creditoClienteDTO.getFolio());
		creditoCliente.setRut(creditoClienteDTO.getRut());
		creditoCliente.setFecha(creditoClienteDTO.getFecha());
		creditoCliente.setMontoCredito(creditoClienteDTO.getMontoCredito());
		creditoCliente.setCuotas(creditoClienteDTO.getCuotas());
		creditoCliente.setTasaInteres(creditoClienteDTO.getTasaInteres());
		creditoCliente.setValorCuota(creditoClienteDTO.getValorCuota());

		return creditoCliente;

	}

	public static List<CreditoClienteDTO> castListCreditoClienteDTO(List<CreditoCliente> list) {
		List<CreditoClienteDTO> listDTO = new ArrayList<CreditoClienteDTO>();

		for (CreditoCliente creditoCliente : list) {
			CreditoClienteDTO creditoClienteDTO = new CreditoClienteDTO();

			creditoClienteDTO.setFolio(creditoCliente.getFolio());
			creditoClienteDTO.setRut(creditoCliente.getRut());
			creditoClienteDTO.setFecha(creditoCliente.getFecha());
			creditoClienteDTO.setMontoCredito(creditoCliente.getMontoCredito());
			creditoClienteDTO.setCuotas(creditoCliente.getCuotas());
			creditoClienteDTO.setTasaInteres(creditoCliente.getTasaInteres());
			creditoClienteDTO.setValorCuota(creditoCliente.getValorCuota());
			listDTO.add(creditoClienteDTO);

		}
		return listDTO;

	}

public static CreditoClienteDTO getvalorCuota(CreditoClienteDTO creditoClienteDTO) {

		int cuotas = creditoClienteDTO.getCuotas();
		BigDecimal montoCredito = creditoClienteDTO.getMontoCredito();
        long valorCuota =montoCredito.intValue() / cuotas;

		switch (cuotas) {
		case 1:
			valorCuota = (long) (valorCuota*1.0);
			creditoClienteDTO.setTasaInteres(0.0);
			break;
		case 3:
			valorCuota = (long) (valorCuota*1.05);
			creditoClienteDTO.setTasaInteres(0.5);

			break;
		default:
			if (cuotas > 5 && cuotas < 13) {
				valorCuota = (long) (valorCuota*1.1);
				creditoClienteDTO.setTasaInteres(1.0);

			}
			if (cuotas > 12 && cuotas < 25) {
				valorCuota = (long) (valorCuota*1.15);
				creditoClienteDTO.setTasaInteres(1.5);

			}
			if (cuotas > 24 && cuotas < 37) {
				valorCuota = (long) (valorCuota*1.2);
				creditoClienteDTO.setTasaInteres(2.0);

			}
			if (cuotas > 36 && cuotas < 49) {
				valorCuota = (long) (valorCuota*1.25);
				creditoClienteDTO.setTasaInteres(2.5);
			}
			if (cuotas > 48 && cuotas < 61) {
				valorCuota = (long) (valorCuota*1.3);
				creditoClienteDTO.setTasaInteres(3.0);


			}
			break;
		}
		creditoClienteDTO.setValorCuota(valorCuota);
		return creditoClienteDTO;
	}
}
