# LlanquihueTourApp

## Descripción

Este proyecto corresponde al desarrollo de la aplicación **LlanquihueTourApp**, creada para apoyar la digitalización de la agencia de turismo **Llanquihue Tour**.

### Objetivo de esta semana

Implementar una **jerarquía de clases utilizando herencia simple** para representar los distintos servicios turísticos que ofrece la agencia. Se aplicaron los conceptos de:

- Herencia.
- Uso de `super()` en los constructores.
- Sobrescritura del método `toString()`.
- Organización del proyecto mediante paquetes.

---

## Clases creadas

### Paquete `model`

- **ServicioTuristico**
  - Clase base.
  - Atributos:
    - nombre
    - duracionHoras

- **RutaGastronomica**
  - Hereda de `ServicioTuristico`.
  - Atributo:
    - numeroDeParadas

- **PaseoLacustre**
  - Hereda de `ServicioTuristico`.
  - Atributo:
    - tipoEmbarcacion

- **ExcursionCultural**
  - Hereda de `ServicioTuristico`.
  - Atributo:
    - lugarHistorico

### Paquete `data`

- **GestorServicios**
  - Crea dos objetos de cada tipo de servicio turístico y muestra su información.

### Paquete `ui`

- **Main**
  - Punto de entrada del programa.
  - Ejecuta la aplicación llamando al método `crearServicios()`.

---

## Estructura del proyecto

```
src
│
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java
```

---

## Instrucciones para ejecutar

1. Abrir el proyecto **LlanquihueTourApp** en NetBeans.
2. Verificar que todas las clases se encuentren en sus respectivos paquetes.
3. Ejecutar la clase:

```
ui.Main
```

4. El programa mostrará por consola la información de los seis servicios turísticos creados para prueba.

---
## Autor
Nicolas Orozco Robles

Proyecto desarrollado como actividad formativa para la asignatura de Programación Orientada a Objetos.
