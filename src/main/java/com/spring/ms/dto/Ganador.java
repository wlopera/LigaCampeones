package com.spring.ms.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Ganador implements Serializable {

	private static final long serialVersionUID = 1291101771702400365L;

	private Long id;
	private int temporada;
	private String campeon;
	private String resultado;
	private String subCampeon;
	private String sede;

}
