package com.algaworks.algamoney.api.model;

import com.algaworks.algamoney.api.dto.PessoaDto;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@NotNull
	@Size(min = 3, max = 100)
	private String nome;
	private Boolean ativo;
	
	@Embedded
	private Endereco endereco;
	
	public Pessoa(Long codigo, String nome, Boolean ativo, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.ativo = ativo;
		this.endereco = endereco;
	}
	
	

	public Pessoa() {
		super();
	}



	public Pessoa(PessoaDto pessoaDto) {
		this.nome = pessoaDto.getNome();
		this.ativo = pessoaDto.getAtivo();
		this.endereco = new Endereco(pessoaDto.getLogradouro(),
						pessoaDto.getNumero(),
						pessoaDto.getComplemento(),
						pessoaDto.getBairro(),
						pessoaDto.getCep(),
						pessoaDto.getCidade(),
						pessoaDto.getEstado());
	}



	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
