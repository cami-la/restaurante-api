
<h1>Restaurante API</h1>
<p>API para expor um CRUD de um dominínio de Restaurante</p>

<h3>Status do Projeto</h3>
<p align="center"> 
	🚧  Restaurante API 💻 Em construção...  🚧
</p>

<h3>Features</h3>

✅ Cadastro de Restaurante no Banco de Dados
✅ Visualizar todos os Restaurantes do Banco de Dados
✅ Visualizar um Restaurante em específico
✅ Atualizar um Restaurante já salvo na Base de Dados
✅ Deletar um Restaurante da Base de Dados

🚧 Cadastro de um Produto no Banco de Dados
🚧 Visualizar todos os produtos do Banco de Dados
🚧 Visualizar um Produto em específico
🚧 Atualizar um Produto já salvo na Base de Dados
🚧 Deletar um Produto da Base de Dados

<h3>Demostração da Aplicação</h3>
<p>Antes de começar, você precisará ter instalado em sua máquina as seguintes ferramentas:</p>
<p><em>Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e rodar o projeto nele·</p>

<table>
<tr>
	<th>Ferramenta</th>
	<th>Versão</th>
</tr>
<tr>
	<td>JDK</td>
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

<ol>
	<li>Faça um clone do projeto na sua máquina: <code> </code>https://github.com/cami-la/restaurante-api.git</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd restaurante-api</code></li> 
	<li>Rode o comando: <code>./gradlew bootrun</code></li>
	<li>Com a aplicação de pé, clique aqui: <a href="http://localhost:8081/swagger-ui/">http://localhost:8081/swagger-ui/</a></li>
</ol>

<h3>Tecnologias Utilizadas</h3>

<table>
<tr>
	<th>Ferramenta</th>
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

<table>
  <tr>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/><br /><sub><b>Camila Cavalcante</b></sub></a><br /><a href="https://web.dio.me/home" title="Dio ">👨‍🚀</a></td>
  </tr>
</table>


<h3>Para você fazer:</h3>
<ol>
	<li>Criar o SQL para a persistência de alguns produtos no banco de dados em memória H2</li>
	<li>Criar a interface ProdutoService para criar o CRUD de Produtos<li>
	<li>Criar a classe RestauranteServiceImpl para implementar a interface criada no tópico anterior</li>
	<li>Criar a classe DTO ProdutoDto</li>
	<li>Criar a classe ProdutoResource</li>
	<li>Criar a interface ProdutoRepository</li>
	<li>Implementar os métodos da classe de servico ProdutoServiceImpl</li>
	<li>Testar no Swagger UI</li>
</ol>

