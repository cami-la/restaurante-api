<h1>Restaurante API</h1>
<p>API para expor um CRUD de um dominínio de Restaurante</p>
<p align="center">
<a href="https://docs.google.com/presentation/d/11rOmP1u7nwYv5mL4ovmquYMZWktPwIiJ/edit?usp=sharing&ouid=101340348592910912358&rtpof=true&sd=true">Slides dia 3</a> ♥ 
<a href="https://docs.google.com/presentation/d/162KrAjBivpN4GKzPVwv7y-JcIPUnN1_h/edit?usp=sharing&ouid=101340348592910912358&rtpof=true&sd=true">Slides dia 4</a>
</p>

<h3>Status do Projeto</h3>
<p align="center"> Restaurante API 💻 Em construção... </p>

<h3>Features</h3>

- [x] Cadastrar restaurantes no banco de dados<br>
- [x] Visualizar todos os restaurantes do banco de dados<br>
- [x] Visualizar um restaurante específico já salvo no banco de dados<br>
- [x] Atualizar um restaurante já salvo no banco de dados<br>
- [x] Deletar um restaurante já salvo no banco de dados<br>
- [ ] Cadastrar produtos no banco de dados<br>
- [ ] Visualizar todos os produtos do banco de dados<br>
- [ ] Visualizar um produto específico já salvo no banco de dados<br>
- [ ] Atualizar um produto já salvo no banco de dados<br>
- [ ] Deletar um produto já salvo no banco de dados<br>

<h3>Para você fazer:</h3>
<ol>
	<li>Incluir uma query SQL no arquivo <strong>data.sql</strong> para a persistência de alguns produtos no banco de dados em memória H2</li>
	<li>Criar a interface <code>ProdutoService</code> para o <strong>CRUD</strong> de Produtos</li>
	<li>Criar a classe <code>RestauranteServiceImpl</code> para implementar a interface criada no tópico anterior</li>
	<li>Criar a classe DTO <code>ProdutoDto</code></li>
	<li>Criar a classe <code>ProdutoResource</code> com as anotação do <strong>Swagger</strong></li>
	<li>Criar a interface <code>ProdutoRepository</code></li>
	<li>Implementar os métodos da classe de servico <code>ProdutoServiceImpl</code></li>
	<li>Testar no <strong>Swagger UI</strong></li>
</ol>

<h3>Demostração da Aplicação</h3>
<p>Antes de começar, você precisará ter instalado em sua máquina as seguintes ferramentas:</p>
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
<tr>
	<td>Postman</td>
	<td>9.**</td>
</tr>
</table>
<h6>** Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e rodar o projeto através da IDE **</h6>

No Terminal/Console:
<ol>
	<li>Faça um clone do projeto na sua máquina: <code>git clone https://github.com/cami-la/restaurante-api.git</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd restaurante-api</code></li> 
	<li>Rode o comando: <code>./gradlew bootrun</code></li>
	<li>Com a aplicação "de pé", clique aqui: <a href="http://localhost:8081/swagger-ui/">http://localhost:8081/swagger-ui/</a></li>
</ol>

<img src="https://i.imgur.com/pfubmkj.png" alt="Restaurante API Swagger UI">

<h3>Tecnologias Utilizadas</h3>

<table>
<tr>
	<th>Dependência</th>
	<th>Versão</th>
</tr>
<tr>
	<td>spring initialzr</td>
	<td><a href="https://start.spring.io/">https://start.spring.io/</a></td>
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

<h3>Author</h3>

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Camila Cavalcante</b></sub></a> <a href="https://blog.rocketseat.com.br/author/thiago//" title="DIO"></a>

Feito com ❤️ por Cami-la 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Camila-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/cami-la/)](https://www.linkedin.com/in/cami-la/)
[![Gmail Badge](https://img.shields.io/badge/-camiladsantoscavalcante@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:camiladsantoscavalcante@gmail.com)](mailto:camiladsantoscavalcante@gmail.com)
<hr>
<h3>Contribuindo</h3>

Este repositório foi criado para fins de estudo, então contribua com ele.<br>
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identifique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️  Star o projeto

🐛 Encontrar e relatar issues


