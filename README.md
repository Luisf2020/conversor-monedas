# Conversor de monedas en tiempo real

![stack: Java](https://img.shields.io/badge/stack--Java-0d9488?style=flat-square) ![stack: REST API](https://img.shields.io/badge/stack--REST%20API-0d9488?style=flat-square) ![stack: JSON](https://img.shields.io/badge/stack--JSON-0d9488?style=flat-square) ![IA: asistido](https://img.shields.io/badge/IA--asistido-6366f1?style=flat-square)

Conversor de divisas que obtiene tasas de cambio actualizadas desde una API REST.

**Tipo:** Aplicacion de consola (Java) · **Complejidad:** Principiante

## Problema que resuelve

Convertir importes entre divisas sin consultar manualmente el tipo de cambio, que cambia a diario.

## Solucion implementada

Aplicacion Java que consulta las tasas por HTTP, las parsea y ofrece un menu para elegir divisas y convertir el importe.

### Funcionalidades principales

- Consulta de tasas por HTTP (HttpURLConnection)
- Conversion entre MXN, EUR, ARS, BRL, COP y USD
- Menu interactivo por consola
- Manejo de errores de conexion y de entrada

## Stack

- Java
- REST API
- JSON

## Estructura

```
ConversorMonedas/
  src/ConversorMonedas.java   # consulta, parseo y menu
  ConversorMonedas.iml
```

## Puesta en marcha

```bash
# Requiere JDK 17+
javac ConversorMonedas/src/ConversorMonedas.java -d out
java -cp out ConversorMonedas
```

## Complejidad del proyecto

**Nivel: Principiante** — Programa de consola con una integracion HTTP y parseo de respuesta.

El nivel describe la complejidad tecnica del proyecto, no el grado de dominio de quien lo escribio.

## Despliegue

Aplicacion de consola; no genera una pagina web.  
El codigo fuente esta disponible en este repositorio.

## Transparencia sobre IA

Este proyecto se desarrollo con asistencia de inteligencia artificial (generacion de codigo,
revision y documentacion). El codigo fue leido, ejecutado y probado manualmente. No se declaran
clientes, metricas ni resultados que no puedan verificarse.

## Autor

**Luis Felipe Zuniga Leon** — Desarrollador de software asistido por IA

- GitHub: <https://github.com/Luisf2020>

---

_Proyecto de portafolio. El desarrollo se apoyo en herramientas de IA bajo revision tecnica humana._
