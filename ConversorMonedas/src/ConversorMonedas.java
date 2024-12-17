import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConversorMonedas {

    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        double tasaMXN = 0, tasaEUR = 0, tasaARS = 0, tasaBRL = 0, tasaCOP = 0;

        try {
            // Obtener tasas de cambio en tiempo real
            String[] rates = getExchangeRates();
            tasaMXN = Double.parseDouble(rates[0]);
            tasaEUR = Double.parseDouble(rates[1]);
            tasaARS = Double.parseDouble(rates[2]);
            tasaBRL = Double.parseDouble(rates[3]);
            tasaCOP = Double.parseDouble(rates[4]);
        } catch (Exception e) {
            System.out.println("Error al conectar con la API. Verifica tu conexión.");
            System.exit(1);
        }

        while (continuar) {
            System.out.println("\n*** Conversor de Monedas ***");
            System.out.println("1. Convertir de MXN a USD");
            System.out.println("2. Convertir de MXN a EUR");
            System.out.println("3. Convertir de ARS a USD");
            System.out.println("4. Convertir de BRL a USD");
            System.out.println("5. Convertir de COP a USD");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            double cantidad, resultado;

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad en MXN: ");
                    cantidad = scanner.nextDouble();
                    resultado = cantidad / tasaMXN;
                    System.out.printf("%.2f MXN equivalen a %.2f USD\n", cantidad, resultado);
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad en MXN: ");
                    cantidad = scanner.nextDouble();
                    resultado = cantidad * (tasaEUR / tasaMXN);
                    System.out.printf("%.2f MXN equivalen a %.2f EUR\n", cantidad, resultado);
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad en ARS: ");
                    cantidad = scanner.nextDouble();
                    resultado = cantidad / tasaARS;
                    System.out.printf("%.2f ARS equivalen a %.2f USD\n", cantidad, resultado);
                    break;
                case 4:
                    System.out.print("Ingresa la cantidad en BRL: ");
                    cantidad = scanner.nextDouble();
                    resultado = cantidad / tasaBRL;
                    System.out.printf("%.2f BRL equivalen a %.2f USD\n", cantidad, resultado);
                    break;
                case 5:
                    System.out.print("Ingresa la cantidad en COP: ");
                    cantidad = scanner.nextDouble();
                    resultado = cantidad / tasaCOP;
                    System.out.printf("%.2f COP equivalen a %.2f USD\n", cantidad, resultado);
                    break;
                case 6:
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }

    private static String[] getExchangeRates() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();

        // Obtener tasas de cambio
        String response = content.toString();
        String tasaMXN = response.split("\"MXN\":")[1].split(",")[0];
        String tasaEUR = response.split("\"EUR\":")[1].split(",")[0];
        String tasaARS = response.split("\"ARS\":")[1].split(",")[0];
        String tasaBRL = response.split("\"BRL\":")[1].split(",")[0];
        String tasaCOP = response.split("\"COP\":")[1].split(",")[0];

        return new String[]{tasaMXN, tasaEUR, tasaARS, tasaBRL, tasaCOP};
    }
}

