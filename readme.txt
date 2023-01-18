
Abrir la terminal de comandos y acceder a la carpeta donde esta nuestro archivo java.
Una vez dentro utilizaremos siguientes comandos para ejecutar el archivo:

java   <nombre_del_archivo_a_ejecutar>   <ruta_con_la_ubicacion_de_la_carpeta>

  
EXERCICI 1

Ejecutamos los comandos mencionados anteriormente, para listar el contenido de un directorio.
El resultado es el siguiente:

promusics-MacBook-Pro:tasca5n1exercici1 promusic$ java Tasca5n1exercici1.java /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/
.DS_Store
boa.png
escritura.txt
green.png
photo.jpg
someFolder
vass.png


EXERCICI 2

Ejecutamos el comando para listar un árbol de archivos, con el siguiente resultado:

promusics-MacBook-Pro:tasca5n1exercici2 promusic$ java Tasca5n1exercici2.java /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/
D: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io Sun Dec 11 11:47:57 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/.DS_Store Sun Dec 11 11:47:57 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/boa.png Sun Dec 11 11:47:57 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/escritura.txt Sun Dec 11 11:47:57 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/green.png Sun Dec 11 11:47:57 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/photo.jpg Sun Dec 11 11:47:57 CET 2022
D: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/someFolder Fri Dec 09 22:19:45 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/someFolder/.DS_Store Fri Dec 09 22:19:45 CET 2022
D: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/someFolder/anotherFolder Fri Dec 09 22:33:52 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/someFolder/anotherFolder/foto.jpg Fri Dec 09 22:33:52 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/someFolder/anotherFolder/fun.jpg Fri Dec 09 22:33:52 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/someFolder/finalScore.txt Fri Dec 09 22:19:45 CET 2022
F: /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/vass.png Sun Dec 11 11:47:57 CET 2022


EXERCICI 3

Ejecutamos el comando, pero esta vez el resultado anterior lo guardamos en un archivo de texto.


EXERCICI 4

Ejecutamos el comando para leer cualquier documento de texto que se encuentra en un listado del árbol.
El resultado es el siguiente:

promusics-MacBook-Pro:tasca5n1exercici4 promusic$ java Tasca5n1exercici4.java /Users/promusic/eclipse-workspace/Sprint1/src/tasca5n1exercici1/java_io/
esto es una prueba de escrituraaaa
 player name = milos
total points= 7
player name = milos
total points= 8
player name = milos
total points of 10= 7
player name = milos
total points of 10= 5

EXERCICI 5

Ejecutamos el comando, esta vez sin pasar ningún argumento. El programa serializará un objeto con la ubicación en la carpeta del archivo, y acto seguido
lo deserializará, imprimiendo el resultado por pantalla:

promusics-MacBook-Pro:tasca5n1exercici5 promusic$ java Tasca5n1exercici5.java
SpareParts [name=engine, price=2000]
