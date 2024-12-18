package com.cico.Dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@AllArgsConstructor 
@NoArgsConstructor
@Getter
@Setter
@ToString
public class adharDTO {

	
	private int aid;
	private String aaddress;
	@NotEmpty
	private long anumber;
	
}
