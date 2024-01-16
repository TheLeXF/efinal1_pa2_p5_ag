package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cuenta")
	@SequenceGenerator(name = "seq_cuenta", sequenceName = "seq_cuenta", allocationSize = 1)
	@Column(name = "cuen_id")
	private Integer id;
	@Column(name = "cuen_numero")
	private String numero;
	@Column(name = "cuen_tipo")
	private String tipo;
	@Column(name = "cuen_saldo")
	private BigDecimal saldo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cuen_id_propietario")
	private Propietario propietario;
	
	@OneToMany(mappedBy = "ctaOrigen",cascade = CascadeType.ALL)
	private List<Transferencia> transferenciasRecibidas;
	@OneToMany(mappedBy = "ctaDestino",cascade = CascadeType.ALL)
	private List<Transferencia>transferenciasRealizadas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public List<Transferencia> getTransferenciasRecibidas() {
		return transferenciasRecibidas;
	}

	public void setTransferenciasRecibidas(List<Transferencia> transferenciasRecibidas) {
		this.transferenciasRecibidas = transferenciasRecibidas;
	}

	public List<Transferencia> getTransferenciasRealizadas() {
		return transferenciasRealizadas;
	}

	public void setTransferenciasRealizadas(List<Transferencia> transferenciasRealizadas) {
		this.transferenciasRealizadas = transferenciasRealizadas;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", propietario=" + propietario
				+ "]";
	}
	
	
	
	
}
