package com.codescripters.clientesapirest.clientesapirest.models.services;

import com.codescripters.clientesapirest.clientesapirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
