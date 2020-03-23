package com.suyridan.spring.boot.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suyridan.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.suyridan.spring.boot.backend.apirest.models.entity.Cliente;

@Service
public class ClientesServiceImpl implements IClientesService {

	@Autowired
	private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

}
