package com.doafacil.DoaFacil.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "doadores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doador {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    private String email;

    private String telefone;

    @Enumerated(EnumType.STRING)
    private TipoDoador tipo; // PF ou PJ

    @Column(name = "documento", unique = true)
    private String cpfCnpj;

    private LocalDateTime dataCadastro;

    private String endereco;

    private String numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String cep;
}
