<h1>Restaurante API</h1>
<p>API para expor um CRUD de um dominínio de Restaurante</p>

<h2>Status do Projeto</h2>
<p align="center"> Restaurante API 💻 Em construção... </p>

<h2>Features</h2>

- [x] Cadastro de Restaurante no Banco de Dados<br>
- [x] Visualizar todos os Restaurantes do Banco de Dados<br>
- [x] Visualizar um Restaurante em específico<br>
- [x] Atualizar um Restaurante já salvo na Base de Dados<br>
- [x] Deletar um Restaurante da Base de Dados<br>
- [ ] Cadastro de um Produto no Banco de Dados<br>
- [ ] Visualizar todos os produtos do Banco de Dados<br>
- [ ] Visualizar um Produto em específico<br>
- [ ] Atualizar um Produto já salvo na Base de Dados<br>
- [ ] Deletar um Produto da Base de Dados<br>

<h2>Para você fazer:</h2>
<ol>
	<li>Inclir uma query SQL no arquivo data.sql para a persistência de alguns produtos no banco de dados em memória H2</li>
	<li>Criar a interface ProdutoService para o CRUD de Produtos</li>
	<li>Criar a classe RestauranteServiceImpl para implementar a interface criada no tópico anterior</li>
	<li>Criar a classe DTO ProdutoDto</li>
	<li>Criar a classe ProdutoResource com as anotação do Swagger</li>
	<li>Criar a interface ProdutoRepository</li>
	<li>Implementar os métodos da classe de servico ProdutoServiceImpl</li>
	<li>Testar no Swagger UI</li>
</ol>

<h3>Demostração da Aplicação</h3>
<p>Antes de começar, você precisará ter instalado em sua máquina as seguintes ferramentas:</p>
<h6>** Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e rodar o projeto através da IDE **</h6>

<table>
<tr>
	<th>Ferramenta</th>
	<th>Versão</th>
</tr>
<tr>
	<td>Java JDK</td>
	<td>17</td>
</tr>
<tr>
	<td>Git</td>
	<td>2.**</td>
</tr>
<tr>
	<td>Gradle</td>
	<td>7.**</td>
</tr>
</table>

<p>No Terminal/Console:</p>
<ol>
	<li>Faça um clone do projeto na sua máquina: <code>git clone https://github.com/cami-la/restaurante-api.git</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd restaurante-api</code></li> 
	<li>Rode o comando: <code>./gradlew bootrun</code></li>
	<li>Com a aplicação "de pé", clique aqui: <a href="http://localhost:8081/swagger-ui/">http://localhost:8081/swagger-ui/</a></li>
</ol>

<h2>Tecnologias Utilizadas</h2>

<table>
<tr>
	<th>Dependência</th>
	<th>Versão</th>
</tr>
<tr>
	<td>spring-boot-starter-web</td>
	<td>2.7.3</td>
</tr>
<tr>
	<td>spring-boot-starter-data-jpa</td>
	<td>2.7.3</td>
</tr>
<tr>
	<td>lombok</td>
	<td>1.18.24</td>
</tr>
<tr>
	<td>springfox-boot-starter</td>
	<td>3.0.0</td>
</tr>
<tr>
	<td>h2</td>
	<td>2.1.214</td>
</tr>
</table>

<h2>Author</h2>

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Camila Cavalcante</b></sub></a> <a href="https://blog.rocketseat.com.br/author/thiago//" title="DIO"></a>
<br>
Feito com ❤️ por Cami-la 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Camila-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/cami-la/)](https://www.linkedin.com/in/cami-la/)
[![Gmail Badge](https://img.shields.io/badge/-camiladsantoscavalcante@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:camiladsantoscavalcante@gmail.com)](mailto:camiladsantoscavalcante@gmail.com)
<hr>
<h3>Contribuindo</h3>

Este repositório foi criado para fins de estudo, então contribua com ele.<br>
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️  Star o projeto

🐛 Encontrar e relatar issues


