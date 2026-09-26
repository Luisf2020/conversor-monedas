# Real-Time Currency Converter

![Java](https://img.shields.io/badge/Java-Console_App-ED8B00?logo=openjdk&logoColor=white)
![REST API](https://img.shields.io/badge/REST_API-Exchange_Rates-0f172a)
![HTTP](https://img.shields.io/badge/HTTP-Integration-2563eb)

Aplicación de consola desarrollada en **Java** para realizar conversiones monetarias utilizando tasas de cambio obtenidas desde una API externa en tiempo real.

## Funcionalidades

- Consulta tasas de cambio mediante HTTP.
- Conversión entre MXN, EUR, ARS, BRL, COP y USD.
- Menú interactivo por consola.
- Manejo básico de errores de conexión.
- Separación entre obtención de datos y lógica de conversión.

## Tecnologías

- Java
- `HttpURLConnection`
- Entrada por consola con `Scanner`
- Consumo de API REST

## Flujo de la aplicación

```text
Usuario
  ↓
Menú de conversión
  ↓
Consulta de tasas vía HTTP
  ↓
Cálculo de conversión
  ↓
Resultado en consola
```

## Ejecución

```bash
git clone https://github.com/Luisf2020/conversor-monedas.git
cd conversor-monedas/ConversorMonedas/src
javac ConversorMonedas.java
java ConversorMonedas
```

## Aspectos técnicos demostrados

- Integración con servicios externos.
- Consumo de datos en tiempo real.
- Programación imperativa en Java.
- Manejo de entrada/salida.
- Diseño de flujo interactivo por consola.

## Posibles mejoras

- Migrar a `HttpClient` moderno.
- Parsear JSON con una biblioteca especializada.
- Añadir más pares de monedas.
- Incorporar pruebas unitarias.
- Crear una interfaz web o de escritorio.

## Autor

**Luis Felipe Zuniga León**  
Ingeniería de Sistemas · Desarrollo de Software · Full Stack

---

Proyecto de portafolio orientado a integración de APIs y fundamentos de Java.