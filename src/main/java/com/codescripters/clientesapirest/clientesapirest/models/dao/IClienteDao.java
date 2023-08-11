package com.codescripters.clientesapirest.clientesapirest.models.dao;

import com.codescripters.clientesapirest.clientesapirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
