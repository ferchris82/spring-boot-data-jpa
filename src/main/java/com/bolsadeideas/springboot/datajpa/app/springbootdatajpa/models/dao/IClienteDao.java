package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
    
}
