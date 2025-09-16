<h1 align="center"> 
 Springboot Funcionalidades
</h1>

<p align="center">
	<b><i>
Projeto Spring Boot para gerenciamento de funcionalidades e suas autorizações, incluindo filtros por data e palavras-chave no nome da autorização.
  </i></b>
</p>

<p align="center">
	<img alt="Tamanho do código no GitHub em bytes" src="https://img.shields.io/github/languages/code-size/juliagonzalezmoreira/springtopicos20252?color=6272a4" />
	<img alt="Linguagem principal" src="https://img.shields.io/github/languages/top/juliagonzalezmoreira/springtopicos20252?color=6272a4"/>
</p>

## 💡 Sobre o projeto
Este projeto é uma API Spring Boot que permite:
- Criar funcionalidades vinculadas a autorizações.
- Validar campos obrigatórios, limites de acesso e formato do nome.
- Buscar funcionalidades com data de ativação anterior a uma data específica.
- Filtrar funcionalidades com base em palavras contidas no nome da autorização.

⚠️ | É necessário ter o banco de dados configurado corretamente com usuários e autorizações para testes da API.

## 📁 Estrutura
- `entity/` → Entidades do projeto: Funcionalidade, Autorizacao, Usuario, etc.
- `repository/` → Repositórios JPA para persistência.
- `service/` → Lógica de negócio, validações e regras da aplicação.
- `controller/` → Endpoints REST para interagir com as funcionalidades.
- `README.md` → Informações do projeto.

## 📍 Instruções

### Pré-Requisitos
Para executar a API localmente, você precisa ter instalado:
- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/)
- Banco de dados PostgreSQL configurado (ou outro compatível com JPA).

## 🔧 Tecnologias

 ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## ✅ Feedback
Caso tenha algum feedback, entre em contato!

<a href="mailto:juliagonzalezmoreira@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"></a>
<a href="https://www.linkedin.com/in/julia-gonzalez-moreira/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

<p align="center"> Desenvolvido com 💜 por Julia Gonzalez Moreira </p>
