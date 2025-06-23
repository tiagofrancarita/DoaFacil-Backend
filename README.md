# 🍽️ DoaFácil - Conectando Solidariedade

## 🌍 Propósito

**DoaFácil** é uma plataforma social desenvolvida em Java com o objetivo de **combater a fome e o desperdício de alimentos**, conectando de forma simples e eficiente:
- Pessoas físicas e empresas que desejam doar alimentos
- Instituições (ONGs, igrejas, associações) que distribuem doações para quem mais precisa

Essa aplicação nasce com o propósito de ajudar comunidades vulneráveis, **mesmo onde o acesso à internet é limitado**, através da atuação de instituições locais e voluntários cadastrados.

---

## 💡 Motivação

> Milhões de brasileiros passam fome todos os dias, enquanto toneladas de alimentos são desperdiçadas por mercados e restaurantes.

A proposta do DoaFácil é transformar esse cenário, oferecendo uma **solução tecnológica acessível e socialmente responsável** para conectar quem pode ajudar com quem precisa ser ajudado.

---

## ⚙️ Funcionalidades (MVP)

- Cadastro de doadores (pessoas físicas ou empresas)
- Cadastro de instituições receptoras
- Registro de doações (tipo de alimento, quantidade, validade, localização)
- Sistema de notificação de doações disponíveis para instituições da região
- Confirmação de retirada e histórico de doações
- Relatórios de impacto (quantidade doada, regiões atendidas, etc.)

---

## 👥 Perfis de Usuário

- **Doador**: cadastra doações e acompanha seu histórico
- **Instituição Receptora**: busca, aceita e distribui doações localmente
- **Administrador (futuro)**: gerencia sistema e aprova instituições

---

## 📦 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL ou PostgreSQL
- JWT (autenticação)
- Clean Architecture
- Docker (futuramente)
- RabbitMQ (para notificação futura)
- Swagger (documentação de API)

---

## 🛠️ Estrutura do Projeto (Clean Architecture)

```bash
br.com.doafacil
├── application      # Casos de uso
├── domain           # Entidades e regras de negócio
├── infrastructure   # Banco, filas, segurança
├── interfaces       # Controllers, DTOs, entrada/saída
└── config           # Configurações do Spring Boot
