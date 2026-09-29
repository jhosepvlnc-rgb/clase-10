public class cajeroInteligente {
    public static void main(String[] args) {

        // 1 Arreglo con 3 compras nuevas (8 en total)
        int[] compras = { 12000, 25000, 8000, 35000, 15000, 18000, 40000, 5000 };

        int totalVentas = 0;
        int cantidadCompras = 0;
        int comprasGrandes = 0;

        // 2 Ciclo for
        for (int i = 0; i < compras.length; i++) {
            totalVentas = totalVentas + compras[i];
            cantidadCompras++;

            // 3. Condicional
            if (compras[i] > 30000) {
                comprasGrandes++;
            }
        }

        // 4 Promedio
        double promedio = (double) totalVentas / cantidadCompras;

        // 5 Resultados
        System.out.println("RESUMEN DE VENTAS");
        System.out.println("Cantidad de compras: " + cantidadCompras);
        System.out.println("Dinero recaudado: $" + totalVentas);
        System.out.println("Promedio por compra: $" + promedio);
        System.out.println("Compras superiores a $30.000: " + comprasGrandes);

        // 6. Mensaje con las nuevas reglas
        if (promedio > 25000) {
            System.out.println("Mensaje: Día excelente");
        } else {
            System.out.println("Mensaje: Día normal");
        }
    }
}