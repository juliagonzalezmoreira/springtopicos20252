package br.gov.sp.fatec.springtopicos20252.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.springtopicos20252.entity.Funcionalidade;

public interface FuncionalidadeRepository extends JpaRepository<Funcionalidade, Long>{

    List<Funcionalidade> findByDataAtivacaoBeforeAndAutorizacaoNomeContaining(LocalDate dataAtivacao, String nomeAutorizacao);

    @Query("select f from Funcionalidade f " +
           "join f.autorizacao a " +
           "where f.dataAtivacao < :data " +
           "and lower(a.nome) like lower(concat('%', :palavra, '%'))")
    List<Funcionalidade> buscarPorDataAtivacaoMenorEAutorizacaoContendo(@Param("data") LocalDate dataAtivacao, @Param("palavra") String nomeAutorizacao);

}
