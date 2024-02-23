# GestorPalabras
Tarea de hacer test con JUnit a un gestor de palabras en java.

Este trabajo ha sido realizado por: Daniel Antmann, Alex Gonzaga, Marcos Gilson y Jaime Riesgo.

## Diseño de pruebas para una aplicación Java
Para este trabajo hemos obtenido este archivo [GestorPalabras.java](https://ies-europa-rivas.es/moodle/pluginfile.php/108715/mod_assign/introattachment/0/GestorPalabras.java?forcedownload=1)

![GestorPalabras.javaFuente](img/GestorPalabras.javaFuente.png)

EL cual en un principio despues de montar unos cuantos test simples se veia que no funcionaba del todo bien. Se ha usado las issues de github para organizarse y ir desarrollando lost tests y decidir especificaciones.

![issues](img/issues_gestorPalabras.png)


También usamos las [issues](https://github.com/Jaim8RR/GestorPalabras/issues?q=is%3Aissue+is%3Aclosed) para asignar los trabajos a los miembros del equipo y etiquetar que tipo de tarea era.

 ![Asignaciones_etiquetas](img/Asignaciones_etiquetas.png)


 ## Desarroyo del trabajo
 
 Cada metodo tenia sus fallos, nos dimos cuenta al hacer unos pequeños **test** y viendo que los resultados no eran los esperados:

 ### [Palindromo](https://github.com/Jaim8RR/GestorPalabras/issues/5)


 
 ![testPalindromo](https://private-user-images.githubusercontent.com/153544634/304858574-1af40c4b-03c3-46e3-8552-01cf6943dd84.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDg3MTk1NzYsIm5iZiI6MTcwODcxOTI3NiwicGF0aCI6Ii8xNTM1NDQ2MzQvMzA0ODU4NTc0LTFhZjQwYzRiLTAzYzMtNDZlMy04NTUyLTAxY2Y2OTQzZGQ4NC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDIyM1QyMDE0MzZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kYjM0ZWFlZjM3MzdkYjE1OTVhMzVmMTcwMWIwOWE3OTAyYjViNjQ2ZjhmZWRmOTYyMGRmODUxNzM5NmY1ZGYwJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.6aB2dw5oOlkbWzFu99D05LGF0ynK-FKdXlMkrwzGrWY)  

  El test de palindromo pasaba todos lost test menos los que tenian puntuación modificamos el metodo para que esto no fuera un problema, además también decidimos que los numeros no deberian de ser palindromos ya que mas bien son capicuas. Por lo cual creamos una nueva excepción en la cual si introdujeramos un numero se lanzara.  
  El resultado final fue el siguiente:

  ![EsPalindromoFinal](img/EsPalindromoFinal.png)


 ### [Contar Vocales](https://github.com/Jaim8RR/GestorPalabras/issues/5)

 ![alt text](https://private-user-images.githubusercontent.com/153544688/305231509-f72806bf-b439-4632-953b-b37979da8b8d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDg3MjA5ODEsIm5iZiI6MTcwODcyMDY4MSwicGF0aCI6Ii8xNTM1NDQ2ODgvMzA1MjMxNTA5LWY3MjgwNmJmLWI0MzktNDYzMi05NTNiLWIzNzk3OWRhOGI4ZC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDIyM1QyMDM4MDFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yNGQzY2VjMzg1NWE4OTU1MThjNTM3ZjU4MzFmNmI1YTIwODYzOTdmYWI1MzVmOWQ3MGI0YTk1Zjg4YmE2NDhlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.rThoCYgdsLIkOrERg9sLvpJ-NIgQADJ6yBUThSpxd-8)

 El test de contar vocales estaba también mal, para empezar hacia lo contrario, contaba todo menos las vocales, tampoco tenia en cuenta que podian tener tildes.  
 EL resultado final fue el siguiente:

 ![contarVocalesFinal](img/contarVocalesFinal.png)


 ### [InvertirPalabra](https://github.com/Jaim8RR/GestorPalabras/issues/4)
 
 El fallo de invertir palabra fue el más facil de solucionar, tenia en su codigo un -2 el cual hacia que no se llegase a recorrer toda la String

![alt text](/img/InvertirPalabraError.png)


 Y este fue el resultado final:  

 ![InvertirPalabraFinal](img/InvertirPalabraFinal.png)

 ## Conclusión
 Es importante hacer diferentes test para las cosas que esperas que funcionen y no funcionen las que no deberian funcionar, ya que si no haces varios, puede ocurrir que no des con partes donde tu programa no hace lo esperado, en el caso del palindromo podria parecer que funciona bien al principio si no llegas a usar signos de puntuacion etc, o no metes numeros y te planteas si deberia de funcionar o no, otros como el invertirPalabra darse cuenta de que no funcionaba es rapido podriamos no ver necesario hacer el test pero como un despiste se puede tener siempre es mejor hacerlo para que no nos ocurra como este ejemplo. Mientras que el de contar vocales puedes ver que tiene un error muy rapidamente, algunos si no se han fijado o creado sufientes test y casos de prueba pueden haber ignorado el que metodo no cuenta las vocales con tildes o dieresis.

 








