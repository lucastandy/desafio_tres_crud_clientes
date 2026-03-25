package com.desafiodevsuperior.desafio_tres.dto;

import java.time.LocalDate;

import com.desafiodevsuperior.desafio_tres.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {
	
	private Long id;
	@NotBlank(message = "Nome não pode ser vazio")
	private String name;
    private String cpf;
    private Double income;
    @PastOrPresent(message = "Data não pode ser futura")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO() {}

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birthDate = entity.getBirthDate();
        this.children = entity.getChildren();
    }

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
    
    
   
}
