package com.github.macedosf.grupostrabalho;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 250)
    private String tipoLogradouro;

    @Column(nullable = false, length = 150)
    private String logradouro;
    
    @Column(nullable = false)
    private Integer numero;
    
    @Column(nullable = false, length = 25)
    private String Bairro;
    
    @ManyToOne
    @JoinColumn(name = "pessoaId")
    private Pessoa pessoa;
}