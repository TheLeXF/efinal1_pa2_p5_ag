package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Cuenta;
import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.service.ICuentaService;

@SpringBootApplication
public class Efinal1Pa2P5AgApplication implements CommandLineRunner {
	@Autowired
	private ICuentaService cuentaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Propietario p1 = new Propietario();
		p1.setApellido("Guanoluisa");
		p1.setNombre("Alexis");
		p1.setCedula("1727450296");
		
		Cuenta c1 = new Cuenta();
		c1.setNumero("12345");
		c1.setSaldo(new BigDecimal(120.60));
		c1.setTipo("Ahorros");
		c1.setPropietario(p1);
		
		
		Propietario p2 = new Propietario();
		p2.setApellido("Guanoluisa");
		p2.setNombre("Santiago");
		p2.setCedula("171515414");
		
		Cuenta c2 = new Cuenta();
		c2.setNumero("56987");
		c2.setSaldo(new BigDecimal(131.60));
		c2.setTipo("Corriente");
		c2.setPropietario(p2);
		
		this.cuentaService.agregar(c2);
		this.cuentaService.agregar(c1);
		
	}
	
	
}
