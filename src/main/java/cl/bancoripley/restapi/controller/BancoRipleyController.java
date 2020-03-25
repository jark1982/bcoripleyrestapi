package cl.bancoripley.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.bancoripley.restapi.controller.util.BancoRipleyControllerUtil;
import cl.bancoripley.restapi.model.CreditoClienteDTO;
import cl.bancoripley.restapi.services.BcoRipleyService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/bcoRipleyRestApi")
@CrossOrigin
public class BancoRipleyController {

	@Autowired
	BcoRipleyService bcoRipleyService;

	@PostMapping
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Something went wrong"),
			@ApiResponse(code = 201, message = "Create") })

	public ResponseEntity<CreditoClienteDTO> addCreditoCliente(@RequestBody CreditoClienteDTO creditoClienteDTO)
			throws Exception {

		if (!BancoRipleyControllerUtil.validarRut(creditoClienteDTO.getRut())) {
			throw new Exception("El rut ingresado nmo es válido");
		}
		if (!BancoRipleyControllerUtil.validarNumeroDeCuotas(creditoClienteDTO.getCuotas())) {
			throw new Exception("La Cantidad de cuotas debe ser entre 1 y 60");
		}
		bcoRipleyService.addCreditoCliente(creditoClienteDTO);
		return new ResponseEntity<CreditoClienteDTO>(creditoClienteDTO, new HttpHeaders(), HttpStatus.CREATED);
	}
	
	@GetMapping("getAllCreditoCliente")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Something went wrong"),
			@ApiResponse(code = 200, message = "Success") })

	public ResponseEntity<List<CreditoClienteDTO>> getAllCreditoCliente()
			throws Exception {

				return new ResponseEntity<List<CreditoClienteDTO>>(bcoRipleyService.getAllCreditoCliente(), new HttpHeaders(), HttpStatus.OK);
	}

}
