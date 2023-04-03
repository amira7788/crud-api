# spring boot 
To make devtools work On Intellij you have to allow the build project automatically on Compiler settings and to allow auto-make to start even id developed application is currently running in advanced Settings.

# jsp page
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
@Controller
@RequestMapping("say-hello-jsp")
HttpRequest : browser send request
Server handles the request spring boot appp
server return httpResponse

# logging
private Logger logger = LoggerFactory.getLogger(LoginController.class);
logger.debug("debug {}",name);
//        logger.info("info {}",name);
logging.level.org.springframework=info

# model2 architectecture
Model : generate the view
View: show information to user
Controller: control the flow

Front Controller

---

localhost:8080/login
1- Indentifies correct controller method
LoginController.goToLogin

2- excutes controller method
puts data into model
returns a view name of login

3- identifies correct view
use viewResolver
/WEB-INF/jsp/login.jsp

4- excutes view

---
if you add @SessionAttributes("name") you can use it on all controllers
---

Code Changes for Step19 - https://github.com/in28minutes/master-spring-and-spring-boot/blob/main/11-web-application/99-step-by-step-changes.md#step19
---
Snippets

<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>


/pom.xml
<dependency>
<groupId>org.webjars</groupId>
<artifactId>bootstrap</artifactId>
<version>5.1.3</version>
</dependency>

<dependency>
	<groupId>org.webjars</groupId>
	<artifactId>jquery</artifactId>
	<version>3.6.0</version>
</dependency>

Github link to Navigation content: https://github.com/in28minutes/master-spring-and-spring-boot/tree/main/11-web-application#navigation---html--bootstrap



<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
	<a class="navbar-brand m-1" href="https://courses.in28minutes.com">in28Minutes</a>
	<div class="collapse navbar-collapse">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/list-todos">Todos</a></li>
		</ul>
	</div>
	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
	</ul>	
</nav>

---
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
---

Github Link: https://github.com/in28minutes/master-spring-and-spring-boot/tree/main/11-web-application#docker



Launch MySQL using Docker
docker run --detach 
--env MYSQL_ROOT_PASSWORD=dummypassword 
--env MYSQL_USER=todos-user 
--env MYSQL_PASSWORD=dummytodos 
--env MYSQL_DATABASE=todos 
--name mysql 
--publish 3306:3306 
--mysql:8-oracle


application.properties
#spring.datasource.url=jdbc:h2:mem:testdb

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/todos
spring.datasource.username=todos-user
spring.datasource.password=dummytodos
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

#todos-user@localhost:3306


mysqlsh commands
mysqlsh
\connect todos-user@localhost:3306
\sql
use todos
select * from todo;
\quit

