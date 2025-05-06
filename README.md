# Sistema de Registro de Ponto

- 📘 [Tema e Descrição do Produto](#tema-e-descricao-do-produto)
- ✅ [Requisitos Funcionais](#requisitos-funcionais)
- ✅ [Requisitos Não Funcionais](#requisitos-nao-funcionais)
- ✅ [Modelagem do Banco de Dados](#modelagem-do-banco-de-dados)
- 🚀 [Como Executar o Projeto](#como-executar-o-projeto)
- 🔗 [Links Importantes](#links-importantes)
- 📝 [Documentação da Sprint](#documentação-da-sprint)
- 👨‍💻 [Equipe](#equipe)
- 🛠 [Tecnologias](#tecnologias)

---

## 📘 Tema e Descricao do Produto

Nosso projeto tem como objetivo o desenvolvimento de um **Sistema de Registro de Ponto** para controle eficiente das horas trabalhadas por profissionais terceirizados em uma determinada área de manutenção.

O sistema permitirá:

- Registro de entrada e saída de profissionais.
- Geração de relatórios detalhados sobre horários trabalhados.
- Consulta de dados por empresa, profissional e período específico.
- Correção de registros errados.

## ✅ Requisitos Funcionais

- Interface para cadastro de empresas e profissionais (incluindo foto).
- Filtragem de registros por data, empresa e profissional.
- Extração de relatórios em formatos padronizados.
- Dashboard interativo com gráficos e opções de filtragem.
- API para consumo dos dados (opcional).

## ✅ Requisitos Não Funcionais

- Interface minimalista e intuitiva.
- Guia de instalação do sistema.
- Documentação da API.
- Modelagem de Banco de Dados otimizada.

## ✅ Modelagem do Banco de Dados

A modelagem do banco de dados incluirá:
- Tabelas de empresas e profissionais.
- Tabelas de registros de ponto.
- Índices para otimizar buscas.
- Relacionamentos bem estruturados.

---

## 🚀 Como Executar o Projeto

### Backend (Spring Boot)

```bash
cd backend
./mvnw spring-boot:run
```

> ⚠️ Certifique-se de ter o MySQL rodando e o `application.properties` configurado.

### Frontend (React)

```bash
cd frontend
npm install
npm run dev
```

> O frontend será iniciado em `http://localhost:5173`

---

## 🔗 Links Importantes

- 🎥 [Demonstração em vídeo do sistema](https://www.youtube.com/watch?v=SEU_VIDEO)
- 🧠 [Repositório GitHub do produto](https://github.com/User-Business/API-3SEM)
- 📑 [Documentação da API (Swagger)](http://localhost:8080/swagger-ui.html) — substituir pelo link real

---

## 📝 Documentação da Sprint

- 📄 [Página Sprint 01](docs/sprint01.md)
- 📌 [Product Backlog](docs/backlog.md)

---

## 📸 Conheça nossa equipe:

| Nome | Função | LinkedIn | GitHub |
|------|--------|----------|--------|
| **Caio Osório** | PO | [LinkedIn](https://www.linkedin.com/in/caio-o-a67224200/) | [GitHub](https://github.com/User-Business) |
| **Gleialison Rezende** | SM | [LinkedIn](https://www.linkedin.com/in/gleialison-rezende-835453b0/) | [GitHub](https://github.com/Glei-Rezende) |
| **Beatriz Santos** | DEV | [LinkedIn](https://www.linkedin.com/in/beatriz-santos-0b6773220/) | [GitHub](https://github.com/BeatrizSantos00) |
| **Rafael Slivka** | DEV | [LinkedIn](https://www.linkedin.com/in/rafael-lopes-slivka-07753326a/) | [GitHub](https://github.com/rafaslivka) |
| **Tiago Bernardo** | DEV | [LinkedIn](https://www.linkedin.com/in/tiagobernardosantos/) | [GitHub](https://github.com/TiagoBernardoSantos) |
| **Victor Ryan** | DEV | [LinkedIn](https://www.linkedin.com/in/victor-ryan-51738b261) | [GitHub](https://github.com/yzvictorr) |

---

## 🛠 Tecnologias

![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-%2300758F.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![React](https://img.shields.io/badge/React-%2361DAFB.svg?style=for-the-badge&logo=react&logoColor=black)
![Docker](https://img.shields.io/badge/Docker-%230087C6.svg?style=for-the-badge&logo=docker&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-%2385EA2D.svg?style=for-the-badge&logo=swagger&logoColor=black)

---

> O projeto está em desenvolvimento e contará com entregas contínuas conforme o progresso da equipe.
