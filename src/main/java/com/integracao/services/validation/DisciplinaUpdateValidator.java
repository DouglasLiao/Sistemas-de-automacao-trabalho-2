package com.integracao.services.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.integracao.dto.DisciplinaDTO;
import com.integracao.repositories.DisciplinaRepository;
import com.integracao.resources.exception.FieldMessage;

public class DisciplinaUpdateValidator implements ConstraintValidator<DisciplinaUpdate, DisciplinaDTO> {

	@Autowired
	private HttpServletRequest request;
		
	@Autowired
	private DisciplinaRepository repo;

	@Override
	public void initialize(DisciplinaUpdate ann) {
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean isValid(DisciplinaDTO objDto, ConstraintValidatorContext context) {
		
		Map<String, String> map = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

		
		List<FieldMessage> list = new ArrayList<>();

		// inclua os testes aqui, inserindo erros na lista
		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}
