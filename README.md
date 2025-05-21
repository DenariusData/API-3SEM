![banner altime](https://github.com/user-attachments/assets/67ebd3ee-6f1e-4ba8-83ea-7d849f34c1e8)

<div align="center">

</div>

<span id="topo">

<h1 align="center">Sprint 1: 10/05/2025 a 30/05/2025</h1>

<p align="center">
    <a href="#objetivos">🎯 Objetivos da sprint</a> &nbsp |&nbsp &nbsp
    <a href="#entregas">✅ Entregas</a> &nbsp |&nbsp &nbsp
    <a href="#metricas">📈 Métricas do time</a> &nbsp |&nbsp &nbsp
    <a href="#links">🔗 Links úteis</a>
</p>

---

O projeto se baseia no desenvolvimento do **Altime**, um sistema web voltado para o cadastro e gestão de empresas, no qual cada empresa pode registrar seus funcionários e gerenciar o controle de ponto de forma prática e eficiente.

Além das funcionalidades de cadastro, o sistema permite o registro e acompanhamento de pontos pelos colaboradores, oferecendo também recursos avançados de visualização de dados por meio de dashboards interativos e tabelas analíticas.

---

<span id="objetivos">

## 🎯 Objetivos da Sprint

<details>
<summary>🔽 Backlog com User Stories e Estimativas</summary>

<br>

| Rank | Requisito Funcional | User Story | Estimativa | Sprint | Critério de Aceitação |
|-------|---------------------|------------|------------|--------|----------------------|
| 1  | RF1                 | Eu, enquanto usuário do sistema quero cadastrar as empresas e funcionários no sistema para que seja possível realizar o controle do projeto | 10h | 1 | O sistema deve permitir o cadastro de empresas e funcionários com campos obrigatórios, garantindo a persistência das informações no banco de dados. |
| 2  | RNF4                | Eu, enquanto Administrador do sistema quero que tenha um banco de dados que será aonde irá ser armazenado todas as informações do sistema | 12h | 1 | Deve haver um banco de dados estruturado, seguro e otimizado para armazenar todas as informações essenciais do sistema. |
| 3  | RF3                 | Eu, enquanto usuário do sistema quero que seja possível extrair os relatórios de forma manual em formato pdf e csv para trabalhar com os dados de outra maneira | 8h | 1 | O sistema deve disponibilizar a extração de relatórios em PDF e CSV, permitindo a seleção de filtros antes da geração do arquivo. |
| 4  | RNF2, RNF3          | Eu, enquanto administrador do sistema quero que tenha um guia de instalação e uso para o usuário para que o sistema possa ser utilizado por diversos usuários distintos | 6h | 1 | Deve existir um manual de instalação e um guia de uso detalhado, contendo instruções passo a passo. |

</details>

---

<span id="entregas">

## ✅ Entregas

Para extrair e entender os desejos do cliente, foi construído um **protótipo inicial no Figma**, criando a identidade visual e design do sistema. Esse protótipo foi apresentado para validação com o cliente e, posteriormente, implementado utilizando **React**, integrando as funcionalidades acordadas para a primeira sprint.

➡️ Acesse o protótipo diretamente pelo [Figma clicando aqui](https://www.figma.com/board/fyhWp4Ji3oQa5PNxootLjf/DenariusData---Sistema-de-Registro-de-Pontos?node-id=0-1&p=f&t=zvkWaiQgHAmyolei-0).

---

### 📹 Veja abaixo o resultado final da entrega:

https://github.com/user-attachments/assets/be18e166-2110-4c0b-95a7-65a570d69ac7

<!-- Substitua o caminho do gif pelo seu arquivo -->
![Resultado final da entrega](./caminho/para/seu-gif.gif)
<br>

---
### ✅ Este protótipo valida a entrega dos requisitos confirmados para a sprint, onde suas descrições podem ser checadas a seguir:

<details>
<summary>🔽 Requisitos Confirmados para a Sprint</summary>

| Código   | Requisito                                           | Descrição                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
|----------|----------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **RF 01** | Desenvolver uma interface de cadastro de empresas e profissionais, incluindo foto | Criação de interface intuitiva para cadastro de empresas e profissionais, com envio de informações básicas e foto de perfil. Essencial para estruturar a base do sistema Altime, permitindo gestão individualizada dos colaboradores. Implementado na Sprint 1 como prioridade do MVP, com foco em usabilidade e funcionalidade. Interface será refinada nas próximas sprints com melhorias visuais e validações conforme feedback dos usuários.                                                                 |
| **RF 02** | Desenvolver filtragem por data, empresa e profissional | Permitir buscas específicas por data, empresa e profissional, facilitando navegação e gestão de registros em cenários com grande volume de dados. Ajuda gestores a identificar rapidamente registros de ponto e eventos com base em critérios selecionados.                                                                                                                                                                                                                                                   |
| **RF 03** | Permitir a extração de relatórios                   | Funcionalidade para gerar relatórios em formatos como PDF e Excel, contendo dados sobre registros de ponto, presença e análises por período. Útil para auditoria, controle interno e prestação de contas. Relatórios gerados com filtros aplicados, tornando a ferramenta versátil e adaptável às necessidades das empresas.                                                                                                                                                                                      |
| **RF 04** | Dashboard com gráficos e possibilidade de filtragem | Desenvolvimento de dashboards interativos com gráficos dinâmicos que mostram métricas como frequência de registros e média de horas trabalhadas. Dados podem ser filtrados por período, empresa ou colaborador para análise visual eficiente. Funcionalidade diferencial do Altime, oferecendo visão estratégica rápida para gestores.                                                                                                                                                                           |
| **RF 05** | API para consumo dos dados (Desejável)              | API RESTful para integrar outras aplicações ao sistema Altime, permitindo consumo de dados de empresas, profissionais e registros de ponto. Facilita integrações com RH, ERPs e apps móveis. Não prioritário na Sprint 1, mas planejado para fases futuras com foco em escalabilidade e interoperabilidade.                                                                                                                                                                                                     |
| **RNF 06** | Front-end com design minimalista                     | Interface limpa e moderna, seguindo design minimalista para experiência intuitiva e agradável. Prioriza simplicidade visual, usabilidade, com ícones claros, cores suaves e espaçamento adequado para navegação fluida, destacando funcionalidades principais sem excesso visual.                                                                                                                                                                                                                                |
| **RNF 07** | Guia de instalação                                   | Guia detalhado para implantação do sistema em diferentes ambientes, incluindo dependências, configurações de banco, ambiente de execução e instruções para desenvolvedores e administradores. Objetiva reduzir curva de aprendizado e garantir instalação rápida e eficaz.                                                                                                                                                                                                                                   |
| **RNF 08** | Documentação da API                                  | Documentação clara e completa da API RESTful, com descrição de endpoints, métodos HTTP, estruturas de requisição e resposta, e exemplos. Facilita integração com outras plataformas e desenvolvedores externos, seguindo padrões como OpenAPI (Swagger).                                                                                                                                                                                                                                                       |
| **RNF 09** | Modelagem de Banco de Dados                          | Modelagem planejada para garantir integridade, consistência e escalabilidade dos dados. Estrutura relacional com entidades principais (empresas, profissionais, registros de ponto, usuários), usando chaves primárias e estrangeiras. Elaborada com boas práticas de normalização e performance, permitindo expansões e integrações seguras.                                                                                                                                                                |

</details>


➡️ [Voltar ao topo](#topo)

---

<span id="metricas">

## 📈 Métricas do time

Em prol de um melhor aproveitamento das habilidades de cada integrante, o time foi separado em duas frentes: **frontend** e **backend**.  
Na primeira sprint, o time de frontend ficou responsável pela confecção do protótipo, projeto frontend e integração de funcionalidades, enquanto o time de backend ficou responsável pela criação dos microsserviços necessários e pesquisas sobre o tema do desafio.

O acompanhamento de atividades, de responsabilidade da **Scrum Master**, se encontra na imagem adiante, que contém o gráfico **Burndown** gerado pela equipe (onde o eixo X são os dias trabalhados na sprint e os valores do eixo Y representam as entregas e esforços realizados com o passar do tempo), incluindo as atividades desenvolvidas e seus responsáveis.

<div align="center">

![Burndown Chart](foto do burndown)

</div>

---

<span id="links">

## 🔗 Links úteis

- Tags geradas em cada repositório que simbolizam o fim da 1ª sprint:
  - ex1: [clique aqui para acessar "ex"](linkaqui)
  - ex2: [clique aqui para acessar "ex"](linkaqui)
  - ex3: [clique aqui para acessar "ex"](linkaqui)
  - ex4: [clique aqui para acessar "ex"](linkaqui)

<br>

➡️ [Voltar ao topo](#topo)
