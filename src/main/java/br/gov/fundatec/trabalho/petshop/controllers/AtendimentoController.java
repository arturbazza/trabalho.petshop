package br.gov.fundatec.trabalho.petshop.controllers;

import br.gov.fundatec.trabalho.petshop.models.*;
import br.gov.fundatec.trabalho.petshop.services.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    private final AtendimentoService atendimentoService;

    public AtendimentoController(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    @PostMapping("/abrir")
    public ResponseEntity<Atendimento> abrirAtendimento(@RequestBody Atendimento atendimento) {
        Atendimento novoAtendimento = atendimentoService.abrirAtendimento(atendimento);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAtendimento);
    }

    @PostMapping("/{id}/adicionar-produto")
    public ResponseEntity<Atendimento> adicionarProdutoAoAtendimento(@PathVariable Long id, @RequestBody Produto produto) {
        Atendimento atendimentoAtualizado = atendimentoService.adicionarProdutoAoAtendimento(id, produto);
        return ResponseEntity.ok(atendimentoAtualizado);
    }

    @PutMapping("/{id}/finalizar")
    public ResponseEntity<Atendimento> finalizarAtendimento(@PathVariable Long id) {
        Atendimento atendimentoFinalizado = atendimentoService.finalizarAtendimento(id);
        return ResponseEntity.ok(atendimentoFinalizado);
    }

}
