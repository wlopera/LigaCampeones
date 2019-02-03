package com.spring.ms.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "WINNER")
public class Winner implements Serializable {

	private static final long serialVersionUID = 2022993372678303830L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "SEASON")
	private int season;

	@Column(name = "CHAMPION")
	private String champion;

	@Column(name = "SCORE")
	private String score;

	@Column(name = "SUBCHAMPION")
	private String subChampion;

	@Column(name = "HEADQUARTERS")
	private String headquarters;

}
