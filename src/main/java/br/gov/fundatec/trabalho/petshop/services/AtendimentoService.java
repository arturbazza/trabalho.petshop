package br.gov.fundatec.trabalho.petshop.services;

import br.gov.fundatec.trabalho.petshop.models.*;

import java.util.List;
import java.util.Optional;

public interface AtendimentoService {
    Atendimento abrirAtendimento(Atendimento atendimento);
    Optional<Atendimento> buscarAtendimentoPorId(Long id);
    Atendimento adicionarProdutoAoAtendimento(Long idAtendimento, Produto produto);
    Atendimento finalizarAtendimento(Long idAtendimento);

}
