package br.gov.fundatec.trabalho.petshop.services;
import br.gov.fundatec.trabalho.petshop.models.*;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    Produto criarProduto(Produto produto);
    Optional<Produto> buscarProdutoPorId(Long id);
    Produto atualizarProduto(Long id, Produto produto);
    void deletarProduto(Long id);
    List<Produto> listarProdutos();

}
