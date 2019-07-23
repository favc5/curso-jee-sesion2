# Pokemon Battle Activity
En este documento se llevara a cabo y desarrollo del problema planteado, con el fin de poder entregar una solución de acuerdo a los requisitos establecidos.

Luego de analizar la problematica como grupo, llegamos a la conclusión de que el siguiente diagrama resuelve el ejercicio, desde nuestro punto de vista.

## Problema
Un pokémon (pkmn) tiene un nombre, energía, un tipo y hasta 4 habilidades.

Un tipo de pkmn puede ser de tipo hoja, agua o fuego. Donde agua es débil contra hoja, hoja es débil contra fuego y fuego es débil contra agua. Cada tipo de pkmn tiene un factor de daño que varia según el pkmn.

Las habilidades tienen un nombre y una cantidad de daño que varia en efectividad según el tipo del pkmn rival.

Un pkmn comienza con el 100% de energía y puede disminuir según el daño recibido, si el pokmn tiene debilidad sobre el oponente, el daño se multiplica por el factor de daño indicado según su tipo.

Un pkmn puede atacar, donde el ataque varia su daño según el tipo del pkmn enemigo y la habilidad utilizada, ejemplo si la habilidad es "Placaje", el daño para tipo hoja puede ser 5, para agua puede ser 5 y para fuego puede ser 10.

Para crear un pkmn existirá una fabrica de pokémon donde puede crear un caterpy, un squartle y un charmander.

## Diagrama de clases
![Diagrama de clases](https://github.com/favc5/curso-jee-sesion2/blob/master/Pokemon2%20(1)%20(2)%20(1)%20(1)%20(1).png)

## Solución
Principalmente este proyecto se enfocara en pokemons, los cuales estan definidos según su nombre, energia, tipo y hasta 4 habilidades.
Los tipos de pokemons son tipo hoja, tipo fuego y tipo agua, donde estos tipos entre si tienen debilidades contra otro tipo el cual tiene efectividad de ataque. 
>Estas son las debilidades: **agua** es debil contra **hoja**, **hoja** es debil contra **fuego** y **fuego** es debil contra **agua**.

Dentro de las 4 habilidades que pueden tener los pokemons, estas tienen un nombre, cantidad de daño y efectividad que tiene dependiendo segun el tipo de pokemon rival.

Para la batalla los pokemons comienzan con 100% de vida (la vida es un numero aleatorio entre 80-150 HP), luego esta vida va disminuyendo segun el ataque que le realicen y de acuerdo al factor de daño dependiendo del tipo de pokemon atacante.

Finalmente, para crear estos pokemons definidos se implementa una clase Fabrica la cual contiene los metodos **crearcaterpie()**, **crearsquirtle()**, **crearcharmander()**.

experiencias del día 23/07

Hoy aprendimos a utilizar GIT, aunque nos costó al principio, luego de algunos intentos logramos dominarlo y poder usarlo para desarrollar. Empezamos el proyecto reflejando el diagrama anteriormente hecho, y aunque intentamos ser lo más fiel posible al diagrama debimos realizar algunos cambios al momento de programar para poder adaptar las ideas e implementarlas.

