package com.github.macedosf.grupostrabalho;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 65)
    private String nome;
    
    private Boolean ativo;
    
    @ManyToOne
    @JoinColumn(name = "liderId")
    private Pessoa lidera;
    
    @ManyToMany
    Set<Pessoa> GruposAtuando;
}
