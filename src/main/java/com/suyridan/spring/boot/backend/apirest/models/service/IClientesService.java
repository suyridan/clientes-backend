package com.suyridan.spring.boot.backend.apirest.models.service;

import java.util.List;

import com.suyridan.spring.boot.backend.apirest.models.entity.Cliente;

public interface IClientesService {
	
	public List<Cliente> findAll();
	
}
