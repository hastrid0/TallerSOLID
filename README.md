# TallerSOLID
## Punto 1
La clase Postre se implemento por que helado e pastel tenian atributos y métodos en común. Con esto se reduce la cantidad de código repetido y gracias a polimorfismo no afecta el objetivo de las clases Helado y Pastel. 
## Punto 2
La clase OperacionesAderezo era innecesaria y se repetia código, al implementar la clase postre se puede usar Single Responsability Principle para crear métodos independientes para añadir o quitar aderezos respectivamente en cada postre, y como helado e pastel heredeban de la clase, estos podian usarlos responsablemente en solo añadir o quitar aderezos.
## Punto 3
Métodos calcularPrecioFinal() y  showPrecioFinal() están muy relacionados y no tienen que ver con el funcionamiento de una instancia Postre (responsabilidad única), mas bien la clase Postre y sus subclases guardan informacion sobre el producto, mientras que los metodos para calcular precio estan sujetos a otras variables como el precio de los impuestos o alguna politica de la empresa, tambien showPrecioFinal() no tiene nada que ver con relacion a los productos, usando el principio de cerrado/abierto se crea otra clase en cargo de las operaciones de precios y esta utiliza la clase abstracta Postre quedando abierta a ser utilizada por otros tipos de Postres pero cerrada a otros objetos.
