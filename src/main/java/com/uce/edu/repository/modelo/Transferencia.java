package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="transferencia")
public class Transferencia {
	
	@Id
	@Column(name = "tran_id")
	private Integer id;
	
	@Column(name = "tran_fecha_transferencia")
	private LocalDateTime fechasTransferencia;
	
	@ManyToOne()
	@JoinColumn(name = "tran_cta_origen")
	private Cuenta ctaOrigen;
	@ManyToOne()
	@JoinColumn(name = "tran_cta_destino" )
	private Cuenta ctaDestino;
	@Column(name = "tran_monto")
	private BigDecimal monto;
	@Column(name = "tran_comision")
	private BigDecimal comision;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFechasTransferencia() {
		return fechasTransferencia;
	}
	public void setFechasTransferencia(LocalDateTime fechasTransferencia) {
		this.fechasTransferencia = fechasTransferencia;
	}
	public Cuenta getCtaOrigen() {
		return ctaOrigen;
	}
	public void setCtaOrigen(Cuenta ctaOrigen) {
		this.ctaOrigen = ctaOrigen;
	}
	public Cuenta getCtaDestino() {
		return ctaDestino;
	}
	public void setCtaDestino(Cuenta ctaDestino) {
		this.ctaDestino = ctaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fechasTransferencia=" + fechasTransferencia + ", ctaOrigen=" + ctaOrigen
				+ ", ctaDestino=" + ctaDestino + ", monto=" + monto + ", comision=" + comision + "]";
	}

}
