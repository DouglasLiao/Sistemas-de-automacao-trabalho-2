package com.example.integracao.services;

import java.util.List;
import java.util.Optional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.integracao.domain.Disciplina;
import com.example.integracao.dto.DisciplinaDTO;
import com.example.integracao.repositories.DisciplinaRepository;
import com.example.integracao.services.exceptions.DataIntegrityException;
import com.example.integracao.services.exceptions.ObjectNotFoundException;

@Service
public class DisciplinaService {
	
	@Autowired
	private DisciplinaRepository repo;
	
	public Disciplina find(Integer id) {
		Optional<Disciplina> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Disciplina.class.getName()));
	}
	
	@Transactional
	public Disciplina insert(Disciplina obj) {
		obj.setId(null);
		obj = repo.save(obj);
		return obj;
	}
	
	public Disciplina update(Disciplina obj) {
		Disciplina newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir porque há pedidos relacionados");
		}
	}
	
	public List<Disciplina> findAll() {
		return repo.findAll();
	}
	
	public Page<Disciplina> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	
	public Disciplina fromDTO(DisciplinaDTO objDto) {
		Disciplina dis = new Disciplina(null, objDto.getCodigo(), objDto.getNome(), objDto.getCargahoraria(), objDto.getEquivalentes(), objDto.getEmenta(), objDto.getPrerequisitos());
		return dis;
	}
	
	private void updateData(Disciplina newObj, Disciplina obj) {
		newObj.setCodigo(obj.getCodigo());
		newObj.setNome(obj.getNome());
		newObj.setCargahoraria(obj.getCargahoraria());
		newObj.setEquivalentes(obj.getEquivalentes());
		newObj.setEmenta(obj.getEmenta());
		newObj.setPrerequisitos(obj.getPrerequisitos());
	}
}
