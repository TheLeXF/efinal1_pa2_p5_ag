package com.uce.edu.service;

import com.uce.edu.repository.modelo.Cuenta;

public interface ICuentaService {
	
	public Cuenta buscar( Integer id);
	public void agregar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public void borrar(Integer id);
	public Cuenta buscarPorNumero(String numero);
	
}
