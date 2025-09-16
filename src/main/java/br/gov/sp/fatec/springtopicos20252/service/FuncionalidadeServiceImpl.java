package br.gov.sp.fatec.springtopicos20252.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.springtopicos20252.entity.Funcionalidade;
import br.gov.sp.fatec.springtopicos20252.repository.FuncionalidadeRepository;

@Service
public class FuncionalidadeServiceImpl implements FuncionalidadeService {

    @Autowired
    private FuncionalidadeRepository funcionalidadeRepo;

    @Override
    public List<Funcionalidade> buscarTodos() {
        return funcionalidadeRepo.findAll();
    }

    @Override
    public Funcionalidade novaFuncionalidade(Funcionalidade funcionalidade) {
        if (funcionalidade.getDataAtivacao() == null) {
            funcionalidade.setDataAtivacao(LocalDate.now());
        }
        if (funcionalidade.getAutorizacao() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Autorização não informada!");
        }
        if (funcionalidade.getLimiteAcessos() != null && funcionalidade.getLimiteAcessos() < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Limite de acessos inválido!");
        }
      if (!funcionalidade.getNome().matches("[A-Za-zÀ-ú ]+")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nome deve conter apenas letras!");
        }


        return funcionalidadeRepo.save(funcionalidade);
    }

    @Override
    public List<Funcionalidade> buscarPorDataAtivacaoMenorEAutorizacaoContendo(LocalDate dataAtivacao, String nomeAutorizacao) {
        return funcionalidadeRepo.buscarPorDataAtivacaoMenorEAutorizacaoContendo(dataAtivacao, nomeAutorizacao);
    }

}
