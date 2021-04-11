package com.example.integracao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.integracao.domain.Disciplina;
@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer>{

}
