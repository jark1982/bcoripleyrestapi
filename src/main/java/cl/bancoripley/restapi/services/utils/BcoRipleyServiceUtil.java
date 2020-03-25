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
}
