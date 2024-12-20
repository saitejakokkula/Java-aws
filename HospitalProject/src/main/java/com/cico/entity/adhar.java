package com.cico.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor 
@NoArgsConstructor
@Getter
@Setter
@ToString
public class adhar {

	@Id
	private int aid;
	private String aaddress;
	@NotEmpty
	private long anumber;
	
}