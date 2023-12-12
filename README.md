![Imagen](https://github.com/elarreglador/Cliente-servidor/blob/main/SCREENSHOTS/Social%20preview.png)


************************************
ACERCA DEL AUTOR
************************************

David M.

elarreglador@protonmail.cocm

https://github.com/elarreglador


************************************
ACERCA DE LA APLICACION
************************************
Las clases cliente y servidor se conectan entre si por medio de sockets de este modo:

- el cliente recibe como paremetro la ip del servidor (localhost si es la misma maquina), el servidor no recibe parametros
- El cliente se conecta al servidor, le envia mensajes de texto y muestra los que recibe
- El servidor acepta la conexion del cliente y muestra por pantalla los mensajes recibidos
- Se establece un dialogo.


![Imagen](https://github.com/elarreglador/Cliente-servidor/blob/main/SCREENSHOTS/Captura%20de%20pantalla%20de%202023-12-12%2014-20-21.png)


************************************
LANZAR LA APP 
************************************

Esta aplicacion esta basada en dos aplicaciones diferenciadas de Java: MainServer.java y MainCliente.java

Se requiere una compilacion de ambas aplicaciones:

<pre>
javac Servidor.java
javac Cliente.java
</pre>

Y despues por separado ejecutaremos en diferentes terminales el servidor y el cliente

<pre>
java Servidor
</pre>

<pre>
java Cliente
</pre>

De este modo obtendremos algo similar a esto:

![Imagen](https://github.com/elarreglador/Cliente-servidor/blob/main/SCREENSHOTS/Captura%20de%20pantalla%20de%202023-12-12%2014-21-57.png)



                                                                                            David M.
                                                                             11 de diciembre de 2023


