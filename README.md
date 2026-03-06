# Sistema de Personajes de Videojuego (POO Avanzada)

## Descripción del proyecto

Este proyecto consiste en el desarrollo de un sistema de personajes para un videojuego de rol utilizando Programación Orientada a Objetos en Java. El objetivo principal es aplicar correctamente conceptos de POO avanzada como herencia, polimorfismo, abstracción, interfaces, colecciones y sobrescritura de métodos mediante @Override.

Todos los personajes del juego comparten ciertas características básicas como un identificador único, nombre, nivel y salud. Sin embargo, cada tipo de personaje tiene su propio comportamiento a la hora de atacar o usar habilidades especiales. Para representar esto se ha creado una jerarquía de clases donde los personajes comparten una base común pero se especializan en diferentes tipos.

La clase base del sistema es **Personaje**, que es una clase abstracta. Esta clase representa la idea general de cualquier personaje del juego y contiene los atributos y métodos comunes. Además, define el método abstracto **atacar()**, que debe ser implementado por cada tipo de personaje concreto.

A partir de esta clase se crean dos clases abstractas intermedias: **PersonajeFisico** y **PersonajeMagico**. Estas clases agrupan comportamientos comunes según el tipo de personaje. PersonajeFisico representa personajes que utilizan ataques físicos, mientras que PersonajeMagico representa personajes que utilizan magia o habilidades especiales.

Las clases concretas del sistema heredan de estas clases intermedias. Algunos ejemplos de personajes implementados en el proyecto son Guerrero, Arquero y Asesino para el grupo de personajes físicos, y Mago y Clerigo para el grupo de personajes mágicos. Cada uno de estos personajes tiene atributos propios y su propia implementación del método atacar(), lo que permite demostrar el uso del polimorfismo.

Además del uso de herencia, el sistema también utiliza **interfaces** para representar capacidades especiales que pueden tener algunos personajes. Estas interfaces definen comportamientos adicionales como curar, defenderse, moverse o usar habilidades mágicas. De esta forma, un personaje puede tener varias capacidades diferentes implementando múltiples interfaces.

Para gestionar los personajes del juego se ha creado una clase llamada **GestorJuego**. Esta clase mantiene una colección de personajes utilizando un **ArrayList<Personaje>**. Gracias a esto se pueden recorrer todos los personajes y ejecutar acciones comunes como ataques utilizando polimorfismo, ya que cada objeto ejecutará su propia versión del método atacar().

También se utiliza **instanceof** en algunos casos para comprobar si un personaje tiene una determinada capacidad definida por una interfaz, por ejemplo para saber si puede curar a otro personaje.

## Jerarquía de clases

Personaje (abstract)  
├── PersonajeFisico (abstract)  
│   ├── Guerrero  
│   ├── Arquero  
│   └── Asesino  
│  
└── PersonajeMagico (abstract)  
  ├── Mago  
  └── Clerigo

## Ejecución del programa

Para ejecutar el programa se debe abrir el proyecto en un entorno de desarrollo compatible con Java como IntelliJ, Eclipse o Visual Studio Code. Una vez abierto el proyecto, simplemente se debe ejecutar la clase **Main** que se encuentra en el paquete **app**.

En el método main se crean instancias de todos los personajes, se añaden al gestor del juego y se muestran por pantalla utilizando el método toString(). Después se ejecutan distintas acciones como ataques y algunas habilidades especiales definidas en las interfaces para demostrar el funcionamiento del sistema.

## Reparto de tareas

Backend = Yeray y Gabriel
Frontend = Yassine y Daniel


