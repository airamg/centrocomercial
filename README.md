# Centro Comercial #

Plataforma web desarrollada con Spring, para la gestión de un centro comercial.

1) Configurando el proyecto
----------------------------------

Tomcat - Crear nuevo servidor

	New Apache Tomcat Server 1.6

Eclipse - Crear un nuevo proyecto

	New Spring Project - Spring MVC Project

	Añadir todas las librerias de maven al pom 

	
2) Configurando nuestro repositorio en git
-------------------------------------

Actualizar nuestros datos a nivel global:
	
	git config --global user.name "nombre"
	git config --global user.email "email@email"

Actualizar nuestros datos a nivel de proyecto:
	
	git config user.name "nombre"
	git config user.email "email@email"

Subir nuestro proyecto:

	git init 
	git remote add origin <urlgitrepositorio>
	git add . / git add --all
	git commit -m "descripción"
	git push origin <nombrerama>

	git status 
	git pull <urlgitrepositorio>
	git merge <nombrerama>
	

3) Ejecutar nuestra aplicación
-------------------------------------

Run as / Debug as: 
    
	localhost/<nombreproyecto>


CONTENIDO
---------------

Distribución de paquetes Java Resources:
  
  * **Controller** - Controladores de cada clase principal

  * **Exception** - Excepciones propias creadas

  * **Model** - Clases correspondientes al modelo de datos
  
  * **Pojo** - Clases principales del proyecto
  
  * **Service** - Clases correspondientes a la parte service de MVC

  * **WebService** - WebService de nuestros datos 

Distribución de paquetes WebApp:
  
  * **Resources** - BD

  * **WEB-INF** - Spring, views, estilos y archivo de configuración web.xml
