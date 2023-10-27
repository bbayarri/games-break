# Games Break

# Repositorio de GamesBreak - Sistema de Compra de Videojuegos

¡Bienvenido al repositorio de GamesBreak! Aquí encontrarás información relevante para el desarrollo del sistema de compra de videojuegos para la empresa "GamesBreak". 

## Descripción del Proyecto

GamesBreak busca implementar un sistema de compra de videojuegos que opera con tres intermediarios, cada uno con sus propias reglas de negocio. El sistema permitirá a los usuarios comprar videojuegos, calcular correctamente los montos a pagar aplicando comisiones según corresponda, otorgar cashback cuando aplique, e implementar un sistema de login mediante un nickname y password. Los usuarios también podrán ver el listado de videojuegos disponibles y su historial de compras.

## Intermediarios y Comisiones

A continuación se presenta una tabla con información detallada sobre los intermediarios y sus comisiones:

| INTERMEDIARIO   | COMISION                    | EJEMPLO                                       |
|------------------|-----------------------------|-----------------------------------------------|
| Steam            | Aplica una comisión del 2%  | * Si compro un juego por $100, el monto total a pagar es de $102 |
| Epic Games       | Si la compra se realiza entre las 20:00 hs y las 23:59 hs, aplica una comisión del 1%, sino aplica una comisión del 3% | * Si compro un juego por $100 entre las 20:00 hs y las 23:59 hs, el monto total a pagar es de $101. * Si compro un juego por $100 en un horario por fuera de las 20:00 hs y las 23:59 hs, el monto total a pagar es de $103 |
| Nakama           | Si la compra se realiza un sábado o domingo, se aplica una comisión del 3%, sino aplica una comisión del 0.75% | * Si compro un juego por $100 un sábado o domingo, el monto total a pagar es de $103. * Si compro un juego por $100 en un día de semana, el monto total a pagar es de $100.75 |

## Sistema de Cashback

Como estatregia para atraer usuarios, GamesBreak ofrece los siguientes beneficios:
| BENEFICIO                                                                  | EJEMPLO                                                                                                                                                     |
|---------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Si el usuario tiene 3 meses o menos de registro se le da un cashback del 5% en el total de la compra | Si el usuario compró un juego por $100 a través de Steam, el monto total a pagar es de $102. Por el beneficio mencionado, GamesBreak le dará un cashback de $5,10 |
| Si el usuario tiene más de 3 meses, pero 12 meses o menos de registro se le da un cashback del 3% en el total de la compra | Si el usuario compró un juego por $100 a través de Steam, el monto total a pagar es de $102. Por el beneficio mencionado, GamesBreak le dará un cashback de $3,06 |
| Si el usuario tiene más de 12 meses de registro no se le dará cashback | No aplica                                                                                                                                                   |


## Objetivos del Desarrollo

Los objetivos del desarrollo de esta aplicación son los siguientes:

1. Permitir al usuario comprar videojuegos a través de los intermediarios especificados.
2. Calcular correctamente el monto a pagar, aplicando las comisiones correspondientes según el intermediario.
3. Otorgar cashback cuando aplique, siguiendo las reglas de negocio establecidas.
4. Implementar un sistema de login que requiere un nickname y password para acceder a la plataforma.
5. Proporcionar a los usuarios la capacidad de ver el listado de videojuegos disponibles en el catálogo.
6. Ofrecer a los usuarios la posibilidad de acceder a su historial de compras para un seguimiento detallado.
