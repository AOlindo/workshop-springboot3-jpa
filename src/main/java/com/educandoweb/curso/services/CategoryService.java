package com.educandoweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.Category;
import com.educandoweb.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll(){//busca todos os usuários
		return repository.findAll();
	}
	
	public Category findById(Long id) {//busca usuários por ID
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
