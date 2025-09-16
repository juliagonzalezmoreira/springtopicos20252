package br.gov.sp.fatec.springtopicos20252.controller;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20252.entity.Funcionalidade;
import br.gov.sp.fatec.springtopicos20252.service.FuncionalidadeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/funcionalidade")
public class FuncionalidadeController {

    @Autowired
    private FuncionalidadeService service;

    @GetMapping
    public ResponseEntity<List<Funcionalidade>> buscarTodos() {
        return ResponseEntity.ok().body(service.buscarTodos());
    }
    
    @PostMapping
    public ResponseEntity<Funcionalidade> cadastrarNovo(@RequestBody Funcionalidade funcionalidade) {
        funcionalidade = service.novaFuncionalidade(funcionalidade);
        return ResponseEntity
            .created(URI.create("/funcionalidade"))
            .body(funcionalidade);
    }

    @GetMapping("/dataAtivacaoAutorizacao")
    public ResponseEntity<List<Funcionalidade>> buscarPorDataAtivacaoMenorEAutorizacaoContendo(
            @RequestParam("dataAtivacao") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataAtivacao,
            @RequestParam("autorizacao") String nomeAutorizacao) {
        return ResponseEntity.ok().body(
            service.buscarPorDataAtivacaoMenorEAutorizacaoContendo(dataAtivacao, nomeAutorizacao)
        );
    }


}
