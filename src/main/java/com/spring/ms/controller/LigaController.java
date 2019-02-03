package com.spring.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ms.dao.Winner;
import com.spring.ms.dto.Ganador;
import com.spring.ms.service.LigaServiceApi;


@RestController
public class LigaController {
	
	@Autowired
	LigaServiceApi ligaServiceApi;
	
	@RequestMapping(value="/liga", method=RequestMethod.GET)
	public Ganador getGanadorByTemporada() {
		
		Winner winner = new Winner();
		winner.setSeason(2019);
		winner.setChampion("Barcelona F.C");
		winner.setScore("3-1");
		winner.setSubChampion("Real Madrid C. F.");
		winner.setHeadquarters("Lisboa, Portugal");
		
		ligaServiceApi.saveWinner(winner);
		
		System.out.println("----------------GANADORES -------------------");
		for(Winner data : ligaServiceApi.getWinners()) {
			System.out.println(data);
		}
		
		Ganador ganador = new Ganador();
		ganador.setTemporada(2018);
		ganador.setCampeon("Real Madrid C. F.");
		ganador.setResultado("3-1");
		ganador.setSubCampeon("Liverpool");
		ganador.setSede("Estadio Olímpico, Kiev, Ucrania");
		
		return ganador;
	}
	

}
