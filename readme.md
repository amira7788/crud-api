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