package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Cuenta;

public interface ICuentaRepository {
	
	public Cuenta seleccionar( Integer id);
	public void insertar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public void eliminar( Integer id);
	public Cuenta seleccionarPorNumero(String numero);
	
}
