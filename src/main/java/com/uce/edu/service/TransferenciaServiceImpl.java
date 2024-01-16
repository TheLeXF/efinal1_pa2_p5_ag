package com.uce.edu.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaRepository;
import com.uce.edu.repository.ITransferenciaRepository;
import com.uce.edu.repository.modelo.Cuenta;
import com.uce.edu.repository.modelo.Transferencia;
@Service
public class TransferenciaServiceImpl implements ITransferenciaService{
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	@Autowired
	private ICuentaRepository cuentaRepository;

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.seleccionar(id);
	}

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		Cuenta c1 = this.cuentaRepository.seleccionarPorNumero(ctaDestino);
		
		Cuenta c2 = this.cuentaRepository.seleccionarPorNumero(ctaOrigen);
		
		if (c2.getSaldo().compareTo(monto)<=0) {
			System.out.println("No tiene saldo para realizar las Transferencia");
		}else {
			
			BigDecimal comision = new BigDecimal(0.10);
			BigDecimal saldo1 = c2.getSaldo();
			
			
			
		}
	}

}
