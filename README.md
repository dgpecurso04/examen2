# examen2
factorial de un numero y que devuelva la cantidad de numeros en ese factorial

correr de manera local 
docker run -d -p 8081:8080 -e PBA=SERVER1 dgpecurso04/examen2:v0.1

correr con el balanceador
docker run -d -p 8080:8080 rancher/server

pestaña ADMIN configurar usuario y contraseña
pestaña INFRASTRUCTURE guardamos IP de la màquina host como la determinada para usar la API de rancher
copiamos la URL que se meustra al dar save, para asignar un HOST
para agregar un servicio vamos a la pestaña DEFAULT y despuès "define a service"
se asigna uno nombre y descripcion del servicio 
seleccionamos la imagen "dgpecurso04/examen2:v0.1"
ahora en "Console" la opcion "None" y "Security/host" en Log Driver seleccionamos json-file
y damos clic en "Create"

creacion de balanceador
Add Service > Add Load Balancer
Se define un nombre para el balanceador, en Request Host el puerto serà 10001 y para Target 8080, ahi en Target seleccionamos el servicio creado
Damos clic en CREATE
al dar clic en el balanceador podemos añadir una escala que seria 3 "Scale ## |+|-|"


http://localhost:8081/api/factorial?fac=9

