# Proyecto prueba POO — DAW  

Este proyecto contiene la estructura base para trabajar Programación Orientada a Objetos en Java.  
Cada grupo recibirá una copia privada de este repositorio al aceptar la tarea en GitHub Classroom.

---

## 📦 Estructura del proyecto

```
src/
├── Temperatura.java
├── Contador.java
├── Mensaje.java
├── Cronometro.java
└── PanelDePruebas.java
```

Todas las clases están vacías o parcialmente implementadas.  
El objetivo es que completes los métodos siguiendo las indicaciones del profesor.

---

# 🧩 Objetivos del proyecto

- Practicar **encapsulación**, **atributos**, **métodos** y **constructores**.  
- Entender la diferencia entre **estado** y **comportamiento**.  
- Implementar clases simples con lógica interna.  
- Probar cada clase desde `PanelDePruebas`.  
- Usar GitHub y ramas para trabajar de forma profesional.  
- Organizar el trabajo con Trello siguiendo un flujo claro.

---

# 📝 Clases a implementar

### 📘 Temperatura
- Convierte entre Celsius y Fahrenheit.  
- Muestra el valor y la unidad.  

### 🔢 Contador
- Incrementa, decrementa y resetea un valor entero.  

### 💬 Mensaje
- Convierte texto a mayúsculas/minúsculas.  
- Cuenta palabras.  

### ⏱️ Cronometro (sin librerías de tiempo)
- Usa un contador interno de segundos.  
- Solo avanza cuando se llama a `tic()` y está en marcha.  

### 🧪 PanelDePruebas
- Clase integradora para probar todas las anteriores.  
- No añade lógica nueva.

---

# 🧪 Cómo probar tu código

Implementa métodos de prueba dentro de `PanelDePruebas`, por ejemplo:

```java
public static void probarContador() {
    Contador c = new Contador();
    c.incrementar();
    c.incrementar();
    System.out.println(c.mostrar());
}
```

Ejecuta el proyecto desde:

```
PanelDePruebas → main()
```

---

# 🌿 Uso de ramas en Git (obligatorio)

Cada tarjeta del tablero de Trello debe trabajarse en **una rama independiente**.

### 📌 Convención de nombres

```
feature/nombre-de-la-clase
```

Ejemplos:

- `feature/temperatura`
- `feature/contador`
- `feature/mensaje`
- `feature/cronometro`
- `feature/tests`

### 🧭 Flujo de trabajo con ramas

1. Selecciona una tarjeta del **Backlog**
2. Muévela a **Sprint Backlog**
3. Crea una rama nueva:

```
git checkout -b feature/nombre
```

4. Implementa la clase
5. Prueba la clase desde `PanelDePruebas`
6. Haz commits frecuentes:

```
git add .
git commit -m "Implementada clase X"
```

7. Sube la rama:

```
git push -u origin feature/nombre
```

8. Mueve la tarjeta a **Sprint Complete**

### ✔ Reglas importantes

- No trabajes en `main`
- Una tarjeta = una rama
- No mezcles tareas distintas
- Commits pequeños y descriptivos

Perfecto, Francisco. Ajustamos el README para que use **exactamente tus listas de Trello**:

- **Product Backlog**
- **Sprint Backlog**
- **In Progress**
- **Blocked**
- **Ready for Review**
- **Done**

Y lo integramos con el flujo de ramas y el proyecto POO.  
Aquí tienes la **sección completa**, lista para pegar en tu README.md sin tocar nada más.

---

## 🗂️ Uso del tablero de Trello

El proyecto se organiza con un tablero Trello que representa el flujo de trabajo del equipo.  
Cada tarjeta corresponde a una tarea (normalmente una clase o subtarea del proyecto).

### 📌 Listas del tablero

- **Product Backlog**  
  Todas las tareas del proyecto. No se trabaja directamente aquí.

- **Sprint Backlog**  
  Tareas seleccionadas para trabajar durante la sesión o sprint.  
  Cada alumno o equipo mueve aquí las tarjetas que va a realizar.

- **In Progress**  
  Tareas en las que estás trabajando activamente.  
  Solo debe haber **una tarjeta por persona** en esta lista.

- **Blocked**  
  Tareas que no pueden avanzar por algún motivo (error, duda, dependencia…).  
  Debes explicar el motivo en un comentario.

- **Ready for Review**  
  Tareas terminadas en su rama correspondiente y listas para revisión del profesor o del equipo.  
  Aquí deben estar **probadas** desde `PanelDePruebas`.

- **Done**  
  Tareas revisadas y aceptadas.  
  Solo se mueven aquí cuando cumplen la Definition of Done.

---

## 🔄 Flujo Trello → Git

| Trello             | Git                                           |
|--------------------|-----------------------------------------------|
| Product Backlog    | No hay rama                                   |
| Sprint Backlog     | Crear rama `feature/...`                      |
| In Progress        | Commits frecuentes en esa rama                |
| Blocked            | La rama existe pero no avanza                 |
| Ready for Review   | Rama subida a GitHub y clase probada          |
| Done               | Rama aceptada y tarea completada              |

---

## 🌿 Uso de ramas (obligatorio)

Cada tarjeta del Sprint Backlog debe trabajarse en **una rama independiente**.

### 📌 Convención de nombres

```
feature/nombre-de-la-clase
```

Ejemplos:

- `feature/temperatura`
- `feature/contador`
- `feature/mensaje`
- `feature/cronometro`
- `feature/tests`

### 🧭 Flujo de trabajo con ramas

1. Mueve una tarjeta de **Product Backlog → Sprint Backlog**  
2. Crea una rama:

```
git checkout -b feature/nombre
```

3. Mueve la tarjeta a **In Progress**  
4. Implementa la clase y haz commits pequeños:

```
git add .
git commit -m "Implementada clase X"
```

5. Cuando termines, prueba la clase desde `PanelDePruebas`  
6. Sube la rama:

```
git push -u origin feature/nombre
```

7. Mueve la tarjeta a **Ready for Review**  
8. Cuando el profesor o el equipo la valide, se realiza el merge de la rama a `main` y la tarjeta pasa a **Done**.

   Esto implica:

    - La rama `feature/...` ha sido revisada (código, commits, pruebas).
    - La clase funciona correctamente desde `PanelDePruebas`.
    - No rompe el proyecto ni introduce errores.
    - El revisor (profesor o miembro del equipo) aprueba la tarea.
    - Se hace el merge a `main`.
    - La rama se puede borrar tras el merge.
    - La tarjeta se mueve a **Done** en Trello.

---



