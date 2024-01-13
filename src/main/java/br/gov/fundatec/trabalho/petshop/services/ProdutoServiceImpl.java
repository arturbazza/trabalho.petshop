package br.gov.fundatec.trabalho.petshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Optional<Produto> buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isPresent()) {
            Produto produto = produtoOptional.get();
            produto.setValor(produtoAtualizado.getValor());
            produto.setDescricao(produtoAtualizado.getDescricao());

            return produtoRepository.save(produto);
        }
        return null;
    }

    @Override
    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

}
