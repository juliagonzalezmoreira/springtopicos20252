package br.gov.sp.fatec.springtopicos20252.service;

import java.time.LocalDate;
import java.util.List;

import br.gov.sp.fatec.springtopicos20252.entity.Funcionalidade;

public interface FuncionalidadeService {

    public Funcionalidade novaFuncionalidade(Funcionalidade funcionalidade);

    public List<Funcionalidade> buscarTodos();

    public List<Funcionalidade> buscarPorDataAtivacaoMenorEAutorizacaoContendo(LocalDate dataAtivacao, String nomeAutorizacao);
}
