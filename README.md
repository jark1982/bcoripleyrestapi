# bcoripleyrestapi
Para la ejecución exitosa del programa se debe tener una base de datos postgres con el schema postgres y una tabla llamda credito_clientes con la siguiente estructura:

column          Type

 folio          numeric(20,0)
 
 rut            character varying(12)
 
 fecha          date
 
 monto_credito  numeric(20,0) 
 
 cuotas         numeric(10,0)
 
 tasa_interes   real
 
 valor_cuota    numeric(10,0)
 
 
El usuario y password configurados e el application.properties son los siguientes :

spring.datasource.username= postgres
spring.datasource.password=admin

Para poder levantar el proyecto se debe importar como exist maven proyect se debe realizar un maven clear maven install.
Luego se debe ejecutar run como java application seleccionar la clase main del proyecto y se levantará el servicio.


Para probar el servicio de crear con un programa tal como postman se debe llamar a la siguinete url  con método post
http://localhost:8080/bcoRipleyRestApi
con el siguinente bodyRequest
{
	"folio" : 12,
	"rut": "15217280K",
	"fecha": "1982-09-01",
	"montoCredito": 100,
	"cuotas" : 3,
	"tasaInteres":null,
	"valorCuota": null
}
Cada vez que se llame el folio sebe ir cambiando

Para listar los datos guardados se debe llamar a la siguinete url
http://localhost:8080/bcoRipleyRestApi/getAllCreditoCliente


