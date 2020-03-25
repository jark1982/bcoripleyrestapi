package cl.bancoripley.restapi.services;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bancoripley.restapi.entty.CreditoCliente;
import cl.bancoripley.restapi.model.CreditoClienteDTO;
import cl.bancoripley.restapi.repository.dao.BcoRipleyDao;
import cl.bancoripley.restapi.services.utils.BcoRipleyServiceUtil;

@Service
@Transactional
public class BcoRipleyService {

	@Autowired
	BcoRipleyDao bcoRipleyDao;

	public List<CreditoClienteDTO> getAllCreditoCliente() {
		List<CreditoClienteDTO> list = BcoRipleyServiceUtil.castListCreditoClienteDTO(bcoRipleyDao.getAllCreditoCliente());
		return list;
	}

	public CreditoCliente getCreditoCliente(BigDecimal folio) {
		return bcoRipleyDao.getCreditoCliente(folio);
	}

	public CreditoClienteDTO addCreditoCliente(CreditoClienteDTO creditoClienteDTO) {
		CreditoCliente creditoCliente = BcoRipleyServiceUtil.castCreditoCliente(creditoClienteDTO);
		creditoCliente = bcoRipleyDao.addCreditoCliente(creditoCliente);
		return creditoClienteDTO;
	}

	public void updateCreditoCliente(CreditoCliente creditoCliente) {
		bcoRipleyDao.updateCreditoCliente(creditoCliente);
	}

	public void deleteCreditoCliente(BigDecimal folio) {
		bcoRipleyDao.deleteCreditoCliente(folio);
	}
}
