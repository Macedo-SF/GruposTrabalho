package com.github.macedosf.grupostrabalho;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Pessoa {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 65)
    private String nome;

    @Column(nullable = false, length = 250)
    private String email;

    private LocalDate nascimento;
    
    @Transient
    private Byte idade;
    
    @ManyToMany
    Set<Grupo> AtuacaoGrupo;
}
