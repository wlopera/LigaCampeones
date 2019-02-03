package com.spring.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ms.dao.LigaRepositorio;
import com.spring.ms.dao.Winner;

@Service
public class LigaServiceApiImpl implements LigaServiceApi {

	@Autowired
	LigaRepositorio dao;

	@Override
	public List<Winner> getWinners() {

		System.out.println("Consultando datos ");
		
		return dao.findAll();
	}

	@Override
	public Winner saveWinner(Winner winner) {
		System.out.println("Campeonato creado: " + dao.saveAndFlush(winner).toString());
		
		return dao.saveAndFlush(winner);
	}

}
