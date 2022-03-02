# registro-contatos-clean-arch
Exemplo simples para estudo de arquitetura limpa

### Estrutura

```
/com.br.registrocontatoscleanarch
   /core
    /exceptions
    /entities
    /ports
    /usercases
  /infrastructure
    /configuration
    /gateway
      /http
        /request
        /response
      /kafka
      /mail
    /repository
      /jpaentities
      /jparepositories
```

### Endpoint disponíveis

`POST http://localhost:8080/contato`<br>
Body:<br>
```
{
  "nome": "nome",
  "telefone": "telefone",
  "celular": "celular",
  "email": "email"
}
```
Retorna 200 OK

`GET http://localhost:8080/contato`<br>
Retorna lista de contatos<br>

### Ambiente necessário

Java 17<br>
Maven

### Como rodar

Banco de dados H2 em memória, sem necessidade de banco na máquina<br>
Clonar projeto<br>
Rodar através de IDE<br>
OU através de terminal dentro da pasta<br>
```
$ mvn clean compile
$ mvn spring-boot:run
```

### Acesso ao banco

Durante a aplicação rodando, o banco pode ser acessado com:<br>
`http://localhost:8080/h2-console`<br>
Credenciais e path presentes no arquivo `application.yml`<br>
