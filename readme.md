# Trabajo Práctico: Compiladores - Análisis Sintáctico y Léxico

## Descripción General

Este trabajo práctico se centra en la implementación de un analizador léxico y sintáctico utilizando ANTLR (Another Tool for Language Recognition). El objetivo principal es desarrollar un conjunto de reglas gramaticales que definan la estructura sintáctica de un lenguaje de programación simple. Esta gramática se utiliza para generar un analizador que pueda reconocer y procesar programas escritos en este lenguaje.

## Descripción de las Funciones

### Tokens y Fragments
- **Tokens**: Definimos los tokens básicos del lenguaje, que incluyen delimitadores como paréntesis `(`, `)`, corchetes `[`, `]`, llaves `{`, `}`, operadores matemáticos `+`, `-`, `*`, `%`, operadores de incremento `++` y decremento `--`, símbolos de comparación `>`, `<`, `>=`, `<=`, `==`, `!=`, y operadores lógicos `&&`, `||`, `!`.
- **Fragments**: Utilizamos fragments para definir patrones básicos como letras `[A-Za-z]` y dígitos `[0-9]` que se usan en otros tokens.

### Palabras Reservadas
- **Palabras Clave**: Definimos palabras clave del lenguaje como `while`, `for`, `if`, `else`, `return`, `printf` y los tipos de datos (`int`, `double`, `char`, `string`, `bool`, `void`, `float`, `long`).

### Instrucciones
- **Programa**: El punto de entrada que consiste en una lista de instrucciones seguida del final del archivo (`EOF`).
- **Instrucción**: Una instrucción puede ser una declaración, asignación, bucle `while`, condicional `if`, bucle `for`, declaración de función, instancia de función, comentario o una instrucción de retorno.

### Expresiones y Condiciones
- **Expresiones**: Definidas de manera recursiva para soportar operaciones matemáticas y anidación.
- **Condiciones**: Permiten la evaluación de expresiones booleanas mediante operadores relacionales y lógicos.

### Bloques y Bucles
- **Bloques**: Un bloque de código está contenido entre llaves `{}` y puede contener múltiples instrucciones.
- **Bucles `while` y `for`**: Estructuras de control que permiten la ejecución repetida de bloques de código basados en condiciones.

### Funciones
- **Declaración de Función**: Define una función con un tipo de retorno, nombre y parámetros.
- **Instancia de Función**: Permite la invocación de una función con argumentos específicos.

### Comentarios y Entrada/Salida
- **Comentarios**: Soporte para comentarios de una sola línea.
- **Escritura en Consola**: Uso de `printf` para imprimir mensajes en la consola.

## Problema Abordado

El problema abordado en este trabajo práctico es la creación de un analizador sintáctico que pueda procesar un lenguaje de programación sencillo. Este lenguaje incluye estructuras comunes como declaraciones de variables, operaciones aritméticas, estructuras de control de flujo (`if`, `while`, `for`), definiciones de funciones y comentarios.

## Desarrollo de la Solución

1. **Definición de la Gramática**: Se creó una gramática completa utilizando ANTLR, que define tanto las reglas léxicas como sintácticas del lenguaje.
2. **Implementación del Analizador**: Utilizando ANTLR, se generaron los analizadores léxicos y sintácticos basados en la gramática definida.
3. **Pruebas**: Se probaron diversos fragmentos de código para asegurarse de que el analizador reconoce correctamente las estructuras sintácticas y maneja errores.

## Conclusión

Este trabajo práctico demostró la eficacia de ANTLR para el desarrollo de analizadores léxicos y sintácticos. La gramática definida permite reconocer un amplio conjunto de estructuras de un lenguaje de programación, facilitando la creación de compiladores y herramientas de análisis de código. La implementación y las pruebas realizadas garantizan que el analizador pueda manejar correctamente las instrucciones y estructuras definidas en la gramática, proporcionando una base sólida para futuros desarrollos y extensiones del lenguaje.