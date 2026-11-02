import java.util.Scanner;
public class AnalisisSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double planillaTotal = 0;
        double mayorSueldo = Double.MIN_VALUE;
        double menorSueldo = Double.MAX_VALUE;
        int trabajadoresMayores2500 = 0; 
        for (int i = 1; i <= 25; i++) {
            System.out.print("Ingrese el sueldo del trabajador " + i + " (S/): ");
            double sueldo = scanner.nextDouble();
            planillaTotal += sueldo;          
            if (sueldo > mayorSueldo) {
                mayorSueldo = sueldo;
            }
            if (sueldo < menorSueldo) {
                menorSueldo = sueldo;
            }
            if (sueldo > 2500) {
                trabajadoresMayores2500++;
            }
        }       
        double promedioSueldo = planillaTotal / 25;       
        System.out.printf("Planilla total: S/ %.0f\n", planillaTotal);
        System.out.printf("Promedio: S/ %.2f\n", promedioSueldo);
        System.out.printf("Mayor sueldo: S/ %.0f\n", mayorSueldo);
        System.out.printf("Menor sueldo: S/ %.0f\n", menorSueldo);
        System.out.println("Trabajadores con sueldo > S/2500: " + trabajadoresMayores2500);
        scanner.close();
    }
}