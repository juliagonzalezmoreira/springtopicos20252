package br.gov.sp.fatec.springtopicos20252.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fun_funcionalidade")
public class Funcionalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fun_id")
    private Long id;

    @Column(name = "fun_nome")
    private String nome;

    @Column(name = "fun_data_ativacao")
    private LocalDate dataAtivacao;

    @ManyToOne
    @JoinColumn(name = "fun_autorizacao")
    private Autorizacao autorizacao;

    @Column(name = "fun_url")
    private String url;

    @Column(name = "fun_limite_acessos")
    private Integer limiteAcessos;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAtivacao() {
        return dataAtivacao;
    }

    public void setDataAtivacao(LocalDate dataAtivacao) {
        this.dataAtivacao = dataAtivacao;
    }

    public Autorizacao getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(Autorizacao autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLimiteAcessos() {
        return limiteAcessos;
    }

    public void setLimiteAcessos(Integer limiteAcessos) {
        this.limiteAcessos = limiteAcessos;
    }
}
