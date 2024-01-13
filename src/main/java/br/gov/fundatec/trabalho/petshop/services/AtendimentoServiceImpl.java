package br.gov.fundatec.trabalho.petshop.services;

import br.gov.fundatec.trabalho.petshop.models.*;
import br.gov.fundatec.trabalho.petshop.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AtendimentoServiceImpl implements AtendimentoService {

    private final AtendimentoRepository atendimentoRepository;
    private final ProdutoService produtoService;

    @Autowired
    public AtendimentoServiceImpl(AtendimentoRepository atendimentoRepository, ProdutoService produtoService) {
        this.atendimentoRepository = atendimentoRepository;
        this.produtoService = produtoService;
    }

    @Override
    public Atendimento abrirAtendimento(Atendimento atendimento) {
        return atendimentoRepository.save(atendimento);
    }

    @Override
    public Optional<Atendimento> buscarAtendimentoPorId(Long id) {
        return atendimentoRepository.findById(id);
    }

    @Override
    public Atendimento adicionarProdutoAoAtendimento(Long idAtendimento, Produto produto) {
        Optional<Atendimento> atendimentoOptional = atendimentoRepository.findById(idAtendimento);
        if (atendimentoOptional.isPresent()) {
            Atendimento atendimento = atendimentoOptional.get();

            Optional<Produto> produtoOptional = produtoService.buscarProdutoPorId(produto.getIdProduto());
            if (produtoOptional.isPresent()) {
                atendimento.getProdutos().add(produto);
                return atendimentoRepository.save(atendimento);
            }
        }
        return null;
    }

    @Override
    public Atendimento finalizarAtendimento(Long idAtendimento) {
        Optional<Atendimento> atendimentoOptional = atendimentoRepository.findById(idAtendimento);
        if (atendimentoOptional.isPresent()) {
            Atendimento atendimento = atendimentoOptional.get();

            atendimento.setEstado("Finalizado");
            return atendimentoRepository.save(atendimento);
        }
        return null;
    }
}
