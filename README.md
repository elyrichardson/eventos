# eventos
Aplicação parcialmente concluída, foi utilizado Sping Boot com MySQL para gerar a persistência em banco de dados e Front-End com bootstrap.

## Como testar a aplicação
- Clone o repositório, edite o arquivo main/resources/application.properties com o usuário e senha da sua instância MySql;
- Crie um banco de dados chamado eventos

**Ao executar a primeira vez, o Spring Boot vai baixar todas as dependências do projeto e criar as tabelas Eventos e Usuários**

Execute as classes de teste EventoRepositoryTests e UsuarioRepositoryTests

Execute novamente a aplicação e acesse htp://localhost:8080
