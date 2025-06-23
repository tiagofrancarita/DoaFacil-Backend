name: Sugestão ou Report
description: Sugira uma funcionalidade, reporte um bug ou proponha melhorias no projeto
title: "[tipo]: título da sua issue"
labels: []
assignees: []

body:
  - type: dropdown
    id: tipo
    attributes:
      label: Tipo de contribuição
      description: Selecione o tipo da sua issue
      options:
        - feat (Nova funcionalidade)
        - bug (Algo não está funcionando)
        - enhancement (Melhoria em funcionalidade existente)
        - docs (Documentação)
        - discussion (Sugestão ou decisão a discutir)
    validations:
      required: true

  - type: textarea
    id: descricao
    attributes:
      label: Descrição
      description: Descreva claramente o que você quer propor ou relatar.
      placeholder: Ex: Criar o endpoint para cadastro de doações com os campos XYZ.
    validations:
      required: true

  - type: textarea
    id: passos
    attributes:
      label: Tarefas
      description: Detalhe os passos necessários ou o que deve ser feito.
      placeholder: |
        - [ ] Criar entidade
        - [ ] Criar controller
        - [ ] Criar serviço
        - [ ] Testar o fluxo
    validations:
      required: false

  - type: textarea
    id: observacoes
    attributes:
      label: Observações adicionais
      description: Informações extras, prints, referências ou dúvidas
      placeholder: Ex: Essa funcionalidade pode ser integrada com o recurso X
    validations:
      required: false