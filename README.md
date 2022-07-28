# Objective

This project is a prototype in order to materialize prevention concepts described in the following OWASP cheatsheet,
in *WebSocket* section:

https://www.owasp.org/index.php/HTML5_Security_Cheat_Sheet#WebSockets

All classes are fully documented.

The project is developed with Maven under IntelliJ IDEA Community Edition.

A web page propose a UI to test the differents protection and use cases.

![Demo](demo1.png)

![Demo](demo2.png)

![Demo](demo3.png)

![Demo](demo4.png)

# Build or Run

## Using Maven

Run the following command to create a WAR archive:

```
mvn clean package
```

Run the following command to run the prototype (it will exposed on **http://localhost:9090**):

```
mvn cargo:run
```

You can also launch the run configuration named **Run POC** directly from the project opened in IntelliJ IDEA.

## Other

If you want to run the website directly without Maven, make sure to set the environment variable `source.origins`
correctly.

```
-Dsource.origins=http://localhost:9090\;http://local.net:9090
```
