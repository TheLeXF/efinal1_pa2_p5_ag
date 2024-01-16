package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaRepository;
import com.uce.edu.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements ICuentaService {
	
	@Autowired
	private ICuentaRepository cuentaRepository;
	
	@Override
	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.seleccionar(id);
	}

	@Override
	public void agregar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaRepository.eliminar(id);
	}

	@Override
	public Cuenta buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.seleccionarPorNumero(numero);
	}



}
