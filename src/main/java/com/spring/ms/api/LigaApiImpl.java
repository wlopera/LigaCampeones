package com.spring.ms.api;

import com.spring.ms.dto.Ganador;

public class LigaApiImpl implements LigaApi {

	@Override
	public Ganador getGanadorByTemporada(int temporada) {

		Ganador ganador = new Ganador();
		ganador.setTemporada(2018);
		ganador.setCampeon("Real Madrid C. F.");
		ganador.setResultado("3-1");
		ganador.setSubCampeon("Liverpool");
		ganador.setSede("Estadio Olímpico, Kiev, Ucrania");

		return ganador;
	}

}
