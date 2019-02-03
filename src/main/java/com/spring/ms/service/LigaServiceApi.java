package com.spring.ms.service;

import java.util.List;

import com.spring.ms.dao.Winner;

public interface LigaServiceApi {

	List<Winner> getWinners();

	Winner saveWinner(Winner winner);

}
