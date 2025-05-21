![banner altime](https://github.com/user-attachments/assets/3044f087-39e6-417c-9cfe-e89b9c7b251e)

<br id="topo">
<p align="center">
    <a href="#sobre">Sobre</a>  |  
    <a href="#backlogs--user-stories">Backlogs & User Stories</a>  |  
    <a href="#protótipo--documentação">Protótipo & Documentação</a>  |  
    <a href="#tecnologias">Tecnologias</a>  |  
    <a href="#equipe">Equipe</a>
</p>

<span id="sobre">

## :bookmark_tabs: Sobre o projeto

A partir da apresentação do desafio enfrentado pela empresa parceira, a solução desenvolvida se configura em um sistema de controle de ponto, composto por três frentes de uso. O sistema permite o cadastro de empresas, funcionários e suas informações específicas, possibilitando uma gestão centralizada e eficiente.

Conta com um dashboard interativo, que oferece uma visão detalhada de todas as atividades, facilitando a análise e o acompanhamento dos dados relacionados à gestão de pessoas e processos. Através desse painel, os administradores podem tomar decisões com base em métricas, padrões e indicadores relevantes ao desempenho e organização interna.

> _Projeto baseado na metodologia ágil SCRUM, procurando desenvolver a Proatividade, Autonomia, Colaboração e Entrega de Resultados dos estudantes envolvidos_

:pushpin: **Status do Projeto:** Em Andamento ⏱️

### 🏁 Entregas de Sprints

Cada entrega foi realizada a partir da criação de uma **tag** em cada repositório (Backend, Frontend e Docs), além da criação de uma branch neste repositório com um relatório completo de tudo o que foi desenvolvido naquela sprint. Observe a relação a seguir:

| Sprint | Previsão   | Status        | Histórico                                                                 |
|--------|------------|----------------|---------------------------------------------------------------------------|
| 01     | 30/03/2025 | ✔️ Concluída    | [ver relatório](https://github.com/DenariusData/API-3SEM/tree/Sprint-1)   |
| 02     | 27/04/2025 | ✔️ Concluída    | [ver relatório](https://github.com/DenariusData/API-3SEM/tree/Sprint-2)   |
| 03     | 25/05/2025 | ⏱️ Em Andamento | [ver relatório](https://github.com/DenariusData/API-3SEM/tree/Sprint-3)   |

### :clapper: Apresentação Final

Confira a seguir uma demonstração das funcionalidades para cada tipo de usuário do sistema:

<details>
   <summary>Administrador</summary>
   <div align="center">
      <img src="https://github.com/DenariusData/DenariusData-docs/blob/main/tela%20login%202.gif" alt="Demonstração Tela de Login" />
   </div>
</details>

→ [Voltar ao topo](#topo)

<span id="backlogs--user-stories">

## :clipboard: Requisitos do Sistema

<details>
<summary>Requisitos Funcionais e Não Funcionais</summary>

<br>

| Nº Requisito | Descrição                                  | Tipo                |
|--------------|--------------------------------------------|---------------------|
| RF1          | Desenvolver uma interface de cadastro de empresas e profissionais, incluindo foto | Funcional           |
| RF2          | Desenvolver filtragem por data, empresa e profissional | Funcional           |
| RF3          | Permitir extração de relatórios             | Funcional           |
| RF4          | Dashboard com gráficos e possibilidade de filtragem | Funcional           |
| RF5          | API para consumo dos dados (desejável)      | Funcional           |
| RNF1         | Front minimalista                           | Não Funcional       |
| RNF2         | Guia de instalação                          | Não Funcional       |
| RNF3         | Documentação API                            | Não Funcional       |
| RNF4         | Modelagem de Banco de Dados                 | Não Funcional       |

</details>

## :dart: Backlogs & User Stories

<details>
<summary>Backlog com User Stories e Estimativas</summary>

<br>

| User Story | Critério de Aceitação | Estimativa em horas | Sprint | Requisito Funcional Relacionado |
|------------|----------------------|---------------------|--------|---------------------------------|
| Eu, enquanto usuário do sistema, quero cadastrar as empresas e funcionários no sistema para que seja possível realizar o controle do projeto. | O sistema deve permitir o cadastro de empresas e funcionários com campos obrigatórios, garantindo a persistência das informações no banco de dados. | 10h | 1 | RF1 |
| Eu, enquanto Administrador do sistema, quero que tenha um banco de dados que será onde será armazenado todas as informações do sistema. | Deve haver um banco de dados estruturado, seguro e otimizado para armazenar todas as informações essenciais do sistema. | 12h | 1 | RNF4 |
| Eu, enquanto usuário do sistema, quero que seja possível extrair os relatórios de forma manual em formato PDF e CSV para trabalhar com os dados de outra maneira. | O sistema deve disponibilizar a extração de relatórios em PDF e CSV, permitindo a seleção de filtros antes da geração do arquivo. | 8h | 1 | RF3 |
| Eu, enquanto administrador do sistema, quero que tenha um guia de instalação e uso para o usuário para que o sistema possa ser utilizado por diversos usuários distintos. | Deve existir um manual de instalação e um guia de uso detalhado, contendo instruções passo a passo. | 6h | 1 | RNF2 |
| Eu, enquanto usuário do sistema, quero que ao entrar no sistema tenha uma interface de login para que seja possível realizar o cadastro ou logar em minha conta de acordo com meus privilégios. | O sistema deve permitir cadastro e login com validação. | 8h | 2 | RF1 |
| Eu, enquanto usuário do sistema, quero que o sistema armazene as entradas e saídas dos funcionários para que seja possível computá-las. | O sistema deve salvar horários registrados. | 6h | 2 | RF2 |
| Eu, enquanto usuário do sistema, quero visualizar dados através de gráficos e de um dashboard para que tenha uma maneira interativa de visualizar os dados. | O sistema deve apresentar dados através de gráficos interativos. | 12h | 2 | RF4 |
| Eu, enquanto usuário do sistema, quero que seja possível a correção de pontos para que seja possível realizar a correção caso possua algum ponto errado ou com algo a ser modificado. | Deve ser possível editar e listar registros de ponto com justificativa. | 7h | 3 | RF2 |
| Eu, enquanto usuário do sistema, quero que seja possível deletar informações já cadastradas de um funcionário para excluir os dados. | O sistema deve permitir que seja possível deletar os dados dos funcionários. | 2h | 3 | RF1 |
| Eu, enquanto usuário do sistema, quero que seja possível deletar informações já cadastradas de uma empresa para excluir os dados. | O sistema deve permitir que seja possível deletar os dados da empresa. | 2h | 3 | RF1 |
| Eu, enquanto usuário do sistema, quero que o campo de CPF utilize máscara de entrada para facilitar o preenchimento. | O campo de CPF deve aceitar apenas entradas válidas e formatadas. | 2h | 3 | RF1 |
| Eu, enquanto usuário do sistema, quero que o campo de CNPJ utilize máscara de entrada para facilitar o preenchimento. | O campo de CNPJ deve aceitar apenas entradas válidas e formatadas. | 2h | 3 | RF1 |
| Eu, enquanto usuário do sistema, quero que a foto fique maior no PDF gerado para melhor visualização. | O sistema deve ajustar o tamanho da imagem no relatório em PDF. | 3h | 3 | RF3 |
| Eu, enquanto desenvolvedor, quero implementar testes unitários no backend para garantir a integridade das funcionalidades. | O sistema deve conter testes automatizados com cobertura de funções principais. | 6h | 3 | - |
| Eu, enquanto desenvolvedor, quero utilizar o Supabase para autenticação e persistência de dados em nuvem. | O sistema deve estar integrado ao Supabase e usar suas funcionalidades. | 10h | 3 | - |
| Eu, enquanto usuário do sistema, quero que seja possível extrair o relatório através de uma API para que seja possível utilizar em outros projetos. | A API deve disponibilizar os relatórios em formatos estruturados. | 10h | 3 | RF5 |

</details>

→ [Voltar ao topo](#topo)

<span id="protótipo--documentação">

## :desktop_computer: Protótipo & Documentação

Como parte do planejamento do projeto foram criados wireframes para idealização do layout, que, ao ser validado pelo cliente, foram aplicados em um protótipo construído no Figma, possibilitando a interação do usuário com a interface (vide [entrega da terceira sprint](#)).

> 🔗 **Links gerais**  
> - **Documentação do software:** [clique aqui para acessar](https://github.com/DenariusData/DenariusData-docs/blob/main/Guia%20de%20Instalac%CC%A7a%CC%83o.pdf)  
> - **Manual do usuário:** [clique aqui para acessar](https://github.com/DenariusData/DenariusData-docs/blob/main/Manual%20do%20Usuario.pdf)  
> - **Links para os repositórios criados:**  
>    - **Frontend:** [acessar Denarius-Data-Frontend](https://github.com/DenariusData/DenariusData-Front/tree/main)  
>    - **Backend:**  
>       - **Código:** [acessar Denarius-Data-Backend](https://github.com/DenariusData/DenariusData-Back/tree/main)  
> - **Documentações das APIs:**  
>    - **Documentação Endpoint:** [acessar Swagger](#)  
>    - **Guia de Usuário:** [acessar Guia de usuário](https://github.com/DenariusData/DenariusData-docs/blob/main/Manual%20do%20Usuario.pdf)

→ [Voltar ao topo](#topo)

<span id="tecnologias">

## 🛠️ Tecnologias

As seguintes ferramentas, linguagens, bibliotecas e tecnologias foram usadas na construção do projeto:

<img src="https://img.shields.io/badge/Figma-CED4DA?style=for-the-badge&logo=figma&logoColor=DC143C" alt="Figma" /> 
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
<img src="https://img.shields.io/badge/Nuxt.js-00DC82?logo=nuxtdotjs&logoColor=fff" alt="NuxtJs" /> 
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="Mysql" /><br>
<img src="https://img.shields.io/badge/VS_Code-CED4DA?style=for-the-badge&logo=visual%20studio%20code&logoColor=0078D4" alt="VS Code" /> 
<img src="https://img.shields.io/badge/GitHub-CED4DA?style=for-the-badge&logo=github&logoColor=20232A" alt="GitHub" /> 
<img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=Jira&logoColor=white" alt="Jira" /> 
<img src="https://img.shields.io/badge/Google%20Docs-CED4DA?style=for-the-badge&logo=google-sheets&logoColor=0D96F6" alt="Google Docs" />

→ [Voltar ao topo](#topo)

<span id="equipe">

## :busts_in_silhouette: Equipe

|    Função     | Nome                  | LinkedIn & GitHub |
|---------------|-----------------------|-------------------|
| Product Owner | Beatriz Sthefanny | [![Linkedin](https://img.shields.io/badge/Linkedin-blue?logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/beatriz-santos-0b6773220/) [![GitHub](https://img.shields.io/badge/GitHub-111217?logo=github&logoColor=white)](https://github.com/BeatrizSantos00) |
| Scrum Master  | Gleialison Rezende | [![Linkedin](https://img.shields.io/badge/Linkedin-blue?logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/gleialison-rezende-835453b0/) [![GitHub](https://img.shields.io/badge/GitHub-111217?logo=github&logoColor=white)](https://github.com/Glei-Rezende) |
| Dev Team      | Caio Osorio         | [![Linkedin](https://img.shields.io/badge/Linkedin-blue?logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/caio-o-a67224200/) [![GitHub](https://img.shields.io/badge/GitHub-111217?logo=github&logoColor=white)](https://github.com/User-Business) |
| Dev Team      | Rafael Slivka       | [![Linkedin](https://img.shields.io/badge/Linkedin-blue?logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/rafael-lopes-slivka-07753326a/) [![GitHub](https://img.shields.io/badge/GitHub-111217?logo=github&logoColor=white)](https://github.com/rafaslivka) |
| Dev Team      | Tiago Bernardo      | [![Linkedin](https://img.shields.io/badge/Linkedin-blue?logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/tiagobernardosantos/) [![GitHub](https://img.shields.io/badge/GitHub-111217?logo=github&logoColor=white)](https://github.com/TiagoBernardoSantos) |
| Dev Team      | Victor Ryan         | [![Linkedin](https://img.shields.io/badge/Linkedin-blue?logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/victor-ryan-51738b261) [![GitHub](https://img.shields.io/badge/GitHub-111217?logo=github&logoColor=white)](https://github.com/yzvictorr) |

→ [Voltar ao topo](#topo)
