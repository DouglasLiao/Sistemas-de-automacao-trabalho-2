package com.example.integracao.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.integracao.domain.Disciplina;
import com.example.integracao.repositories.DisciplinaRepository;

@Service
public class DBService {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	public void instantiateTestDataBase()  throws ParseException {
		
		Disciplina dis1 = new Disciplina(null, "BLU3100", "Introducao a ECA","72", "-", "-", "-");
		Disciplina dis2 = new Disciplina(null, "BLU3101", "Introducao a informatica para Automacao","72", "BLU6000", "-", "-");
		Disciplina dis3 = new Disciplina(null, "BLU6001", "Calculo","108", "-", "-", "-");
		Disciplina dis4 = new Disciplina(null, "BLU6002", "Desenho Tecnico para Engenharia","72", "-", "-", "-");
		Disciplina dis5 = new Disciplina(null, "BLU6905", "Geometria e Algebra Linear","108", "BLU6005", "-", "-");
		/*
		Disciplina dis6 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis7 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis8 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis9 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis10 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis11= new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis12 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis13 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis14 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis15 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis16 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis17 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis18 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis19 = new Disciplina(null, "BLU", "","", "", "", "");
		Disciplina dis20 = new Disciplina(null, "BLU", "","", "", "", "");*/
		
		
		disciplinaRepository.saveAll(Arrays.asList(dis1, dis2, dis3, dis4, dis5));
		
	}
	
	
}
