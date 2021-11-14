TE-Java-101-Exceptions
====================================

#### Por: Isac Marín Sirias, 2021135407 

## Throw Exception

Throw funciona como una excepción la cual se utiliza 
cuando se usa una cadena de métodos, dado que si la lógica
está mal dentro de un método este se va arrastrar en los otros.
En el ejemplo propuesto es exactamente lo que se codifica, dado que 
esta clase presenta tres métodos, en donde solo en uno se está haciendo un 
cálculo, el cual es un cálculo erróneo, por lo qué, un método llama a otro
y ese llama al siguiente hasta que se realiza el proceso, pero como 
uno de los métodos que se llama tiene una operación errónea, en este caso 
una división entre cero, está excepción se encargará de notificar el error 
dentro de una cadena de métodos, lo cual es sumamente importante a la hora 
de realizar un código que arrastre una cadena de métodos.

## Try Exception

Try se utiliza cuando se desean prever excepciones en el transcurso de la ejecución 
de un programa. Es necesario ya que ahí se colocan las instrucciones que se desean
realizar pese a la excepción, posteriormente se usa un catch donde se especifica la
excepción que se sabe puede ocurrir. En donde en el ejemplo presentado se codifica un 
conversor de números en formato string a int, entonces bien, si se escriben números en 
formato string, a pesar de que esto pueda generar una excepción el proceso sigue pero 
si lo que se escribe son palabras, se ejecutará un catch, el cual indicará la excepción
ocurrente.

## Finally Exception

La cláusula finally crea un bloque de código que se ejecutará después de que se haya
completado el un bloque try / catch y antes de que se ejecute el código que sigue a 
este bloque. El bloque finally se ejecutará tanto si se tira la excepción como sino.
Entonces bien, en sí lo que hace es que para el código independientemente de lo que se realice, 
así que en el código de ejemplo se hace algo sencillo, en donde se pide un numero entero, 
todo esto encerrado en un try/catch, entonces bien, una vez se salga del try o del catch
se ejecutará el finally, en donde para modo de ejemplo, lo que se realiza es la finalización
del código mediante una notificación al usuario.

## Exception Propia

A la hora de crear una excepción, se tiene que tener en claro lo que se va a realizar, por ejemplo
en mi código demostrativo, pide la edad del usuario, pero sería poco ilógico de parte del usuario 
que ingresara una edad mayor a 100 años, por lo tanto se decide que cuando el usuario ingrese una 
edad mayor, salte una excepción, esto a través de un throw el cual notifica al usuario.
 
