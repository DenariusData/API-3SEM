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

<br>

---
### ✅ Este protótipo valida a entrega dos requisitos confirmados para a sprint, onde suas descrições podem ser checadas a seguir:

- **RF 01: Desenvolver uma interface de cadastro de empresas e profissionais, incluindo foto**  
Este requisito contempla a criação de uma interface intuitiva para o cadastro de empresas e seus respectivos profissionais, permitindo o envio de informações básicas e a inclusão de foto de perfil.  
Essa funcionalidade é essencial para estruturar a base de dados do sistema Altime, possibilitando que cada empresa gerencie seus colaboradores de forma individualizada.  
Foi implementada na Sprint 1 como uma das prioridades do MVP, com foco em usabilidade e funcionalidade. A interface será refinada nas próximas sprints para incluir melhorias visuais e validações adicionais conforme o feedback dos usuários.

- **RF 02: Desenvolver filtragem por data, empresa e profissional**  
Este requisito visa permitir que os usuários realizem buscas específicas utilizando filtros por data, empresa e profissional.  
Essa funcionalidade é fundamental para facilitar a navegação e o gerenciamento de registros dentro do sistema Altime, especialmente em cenários com grande volume de dados.  
A implementação deste requisito permitirá aos gestores identificar rapidamente registros de ponto, eventos ou comportamentos específicos com base nos critérios selecionados.

- **RF 03: Permitir a extração de relatórios**  
A funcionalidade de exportação de relatórios tem como objetivo fornecer aos usuários a possibilidade de gerar documentos em formatos como PDF ou Excel, contendo dados relevantes sobre registros de ponto, presença de funcionários e análises por período.  
Essa extração será útil para fins de auditoria, controle interno ou prestação de contas.  
Os relatórios poderão ser gerados com base nos filtros aplicados, tornando a ferramenta ainda mais versátil e adaptável às necessidades das empresas.

- **RF 04: Dashboard com gráficos e possibilidade de filtragem**  
Este requisito se refere ao desenvolvimento de dashboards interativos, com gráficos dinâmicos que apresentam métricas relevantes como frequência de registros, média de horas trabalhadas, entre outros indicadores.  
Os dados poderão ser filtrados por período, empresa ou colaborador, permitindo uma análise visual clara e eficiente do comportamento organizacional.  
Essa funcionalidade é um dos diferenciais do Altime, pois oferece aos gestores uma visão estratégica e rápida sobre as operações da empresa.

- **RF 05: API para consumo dos dados (Desejável)**  
A criação de uma API RESTful está prevista como uma funcionalidade desejável, permitindo que outras aplicações ou serviços possam se integrar ao sistema Altime.  
Através dessa API, será possível consumir dados de empresas, profissionais e registros de ponto, facilitando integrações com sistemas de RH, ERPs ou aplicações móveis.  
Embora não seja uma prioridade da Sprint 1, a API está planejada para fases futuras de desenvolvimento, com foco em escalabilidade e interoperabilidade.

- **RNF 06: Front-end com design minimalista**  
O sistema Altime foi projetado com uma interface limpa e moderna, seguindo os princípios do design minimalista, a fim de oferecer uma experiência de uso intuitiva e agradável.  
O foco está na simplicidade visual, sem comprometer a usabilidade. Ícones claros, cores suaves e espaçamento adequado foram aplicados para garantir que os usuários possam navegar pelo sistema de forma fluida, com destaque para as funcionalidades principais e sem excesso de elementos visuais.

- **RNF 07: Guia de instalação**  
Para facilitar o processo de implantação do sistema em diferentes ambientes, foi desenvolvido um guia de instalação detalhado.  
Esse guia descreve passo a passo os procedimentos necessários para configurar o sistema Altime, incluindo dependências, configurações do banco de dados, ambiente de execução e instruções específicas para desenvolvedores e administradores.  
O objetivo é reduzir a curva de aprendizado e garantir uma instalação rápida e eficaz.

- **RNF 08: Documentação da API**  
A documentação da API RESTful do sistema Altime está sendo elaborada para fornecer uma descrição clara e completa dos endpoints, métodos HTTP, estruturas de requisição e resposta, além de exemplos de uso.  
Essa documentação é essencial para facilitar a integração com outras plataformas e sistemas de terceiros, permitindo que desenvolvedores externos possam consumir os dados do sistema com segurança e praticidade.  
A documentação seguirá padrões reconhecidos, como OpenAPI (Swagger).

- **RNF 09: Modelagem de Banco de Dados**  
A modelagem do banco de dados foi cuidadosamente planejada para garantir a integridade, consistência e escalabilidade dos dados.  
A estrutura relacional define as principais entidades do sistema, como empresas, profissionais, registros de ponto e usuários, com suas devidas chaves primárias e estrangeiras.  
A modelagem foi elaborada com base em boas práticas de normalização e performance, possibilitando futuras expansões e integrações com segurança.


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
