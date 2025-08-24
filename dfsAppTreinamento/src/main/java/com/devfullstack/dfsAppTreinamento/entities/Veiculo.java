package com.devfullstack.dfsAppTreinamento.entities;

import java.util.Objects;

@En
public class Veiculo {

	@I
	private long id;
	private String nome;
	private String modelo;
	private String marca;
	private Integer ano;
	private String cor;
	private String placa;
	private String renavan;
	private String descricao;

	public Veiculo() {

	}

	public Veiculo(long id, String nome, String modelo, String marca, Integer ano, String cor, String placa,
			String renavan, String descricao) {
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		this.placa = placa;
		this.renavan = renavan;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return id == other.id;
	}

}
