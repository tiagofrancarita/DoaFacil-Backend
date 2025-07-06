package com.doafacil.DoaFacil.interfaces.DTO;

import com.doafacil.DoaFacil.domain.enums.TipoDoador;

import java.time.LocalDateTime;
import java.util.UUID;

public record DoadorDTO (
        UUID id,
        String nome,
        String email,
        String telefone,
        TipoDoador tipo,
        String cpfCnpj,
        LocalDateTime dataCadastro,
        String endereco,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String cep
) {
}
