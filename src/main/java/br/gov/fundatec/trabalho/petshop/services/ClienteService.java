package br.gov.fundatec.trabalho.petshop.services;

import br.gov.fundatec.trabalho.petshop.models.*;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente criarCliente(Cliente cliente);
    Optional<Cliente> buscarClientePorId(Long id);
    Cliente atualizarCliente(Long id, Cliente cliente);

    //Cliente atualizarCliente(Long id, Cliente clienteAtualizado);

    void deletarCliente(Long id);
    List<Cliente> listarClientes();

}
