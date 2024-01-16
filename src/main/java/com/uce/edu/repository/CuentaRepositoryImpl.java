package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CuentaRepositoryImpl implements ICuentaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Cuenta seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, id);
	}

	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cuenta c1= this.seleccionar(id);
		this.entityManager.remove(c1);
	}

	@Override
	public Cuenta seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<Cuenta>myQuery=this.entityManager.createQuery("SELECT c FROM Cuenta c WHERE c.numero =: variable", Cuenta.class);
		myQuery.setParameter("variable", numero);
		return myQuery.getSingleResult();
	}


}
