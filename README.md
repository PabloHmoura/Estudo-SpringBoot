# Estudo-SpringBoot

Esse projeto foi com o intuito de aprender a usar o framework Spring.

Esse projeto consta com o uso do JPA, Lombok para geração de códigos, Flyway para desenvolvimento com migration, Driver do MySql para banco de dados e Spring boot.

Nesse projeto é possível utilizar os métodos de requisições POST, GET, PUT e DELETE.

O método POST pode receber os seguintes dados a partir da URL http://localhost:8080/pacientes || medicos

POST médicos para adicionar um médico no banco de dados:
      
              {
        "nome": "Felipe Smith",
        "email": "felipe.smith@voll.med",
        "crm": "324789",
        "telefone" : "11958572459",
        "especialidade": "CARDIOLOGIA",
        "endereco": {
            "logradouro": "rua 1",
            "bairro": "bairro",
            "cep": "12345678",
            "cidade": "Brasilia",
            "uf": "DF",
            "numero": "",
            "complemento": ""
            }
        }
        
campos não obrigatórios: "numero" e "complemento"


Para alterar ou deletar algum paciente || médico, é necessário a informação do id junto com os dados que serão alterados.

      Exemplo: {
          "id" : 2,
          "telefone" : "941463170"
        }
        
Todos os dados são tratados no formato Json.

API REST utilizando Spring Boot e desenvolvimento de CRUD
    
