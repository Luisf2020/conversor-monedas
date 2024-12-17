# Conversor de Monedas

Este es un programa de consola en Java que permite realizar conversiones de moneda en tiempo real utilizando datos de la API **ExchangeRate-API**. El programa puede convertir entre diversas monedas como MXN (Peso Mexicano), EUR (Euro), ARS (Peso Argentino), BRL (Real Brasileño), COP (Peso Colombiano) y USD (Dólar Estadounidense).

## Características
- Obtiene las tasas de cambio actualizadas mediante la API ExchangeRate-API.
- Realiza conversiones entre las siguientes monedas:
  - MXN a USD
  - MXN a EUR
  - ARS a USD
  - BRL a USD
  - COP a USD
- Permite una interfaz sencilla con opciones para el usuario.

---

## Requisitos
- **Java JDK 8** o superior.
- Conexión a Internet para obtener las tasas de cambio.

---

## Instalación y Ejecución

1. **Clona o descarga el repositorio**:
   ```bash
   git clone https://github.com/usuario/conversor-monedas.git
   cd conversor-monedas
   ```

2. **Compila el archivo Java**:
   ```bash
   javac ConversorMonedas.java
   ```

3. **Ejecuta el programa**:
   ```bash
   java ConversorMonedas
   ```

---

## Funcionamiento

El programa presenta un menú con las siguientes opciones:

1. **Convertir de MXN a USD**
2. **Convertir de MXN a EUR**
3. **Convertir de ARS a USD**
4. **Convertir de BRL a USD**
5. **Convertir de COP a USD**
6. **Salir**

**Ejemplo de salida:**
```
*** Conversor de Monedas ***
1. Convertir de MXN a USD
2. Convertir de MXN a EUR
3. Convertir de ARS a USD
4. Convertir de BRL a USD
5. Convertir de COP a USD
6. Salir
Elige una opción: 1

Ingresa la cantidad en MXN: 100
100.00 MXN equivalen a 5.00 USD
```

---

## Estructura del Código

- **`main`**: Controla la lógica principal y el menú de opciones.
- **`getExchangeRates`**: Realiza una petición GET a la API y extrae las tasas de cambio necesarias.

---

## API Utilizada
- **ExchangeRate-API**: [https://api.exchangerate-api.com](https://api.exchangerate-api.com)

Asegúrate de que el servidor de la API esté disponible y tu conexión a Internet funcione correctamente.

---

## Mejoras Futuras
- Agregar más opciones de conversión de monedas.
- Mejorar la visualización con una interfaz gráfica.
- Manejo de errores más robusto para respuestas de la API.

---

## Autor
- **[Tu Nombre]** - Desarrollador del proyecto.

---

## Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo **LICENSE** para más detalles.
