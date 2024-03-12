package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.models.entity.Cliente;

public interface IClienteService {
    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);
}
