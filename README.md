# bcoripleyrestapi
Para la ejecución exitosa del programa se debe tener una base de datos postgres con el schema postgres tan una tabla con la siguiente estructura:

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
