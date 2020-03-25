# bcoripleyrestapi
Para la ejecución exitosa del programa se debe tener una base de datos postgres con el schema postgres tan una tabla con la siguiente estructura:

                   Table "public.credito_clientes"
    Column     |         Type          | Collation | Nullable | Default 
---------------+-----------------------+-----------+----------+---------
 folio         | numeric(20,0)         |           | not null | 
 rut           | character varying(12) |           |          | 
 fecha         | date                  |           |          | 
 monto_credito | numeric(20,0)         |           |          | 
 cuotas        | numeric(10,0)         |           |          | 
 tasa_interes  | real                  |           |          | 
 valor_cuota   | numeric(10,0)         |           |          | 
 
 
