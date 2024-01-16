package com.uce.edu.service;

import java.math.BigDecimal;

import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaService {
	
	public Transferencia buscar( Integer id);
	
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	
	
}
