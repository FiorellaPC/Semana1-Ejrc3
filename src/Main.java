import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        scan.next();
        System.out.print("Cargo de empleado : ");
        scan.next();
        System.out.print("Ingresos del empleado: ");
        int ingreso = scan.nextInt();
        System.out.print("Gastos del empleado: ");
        int gasto = scan.nextInt();

        int ahorroMensual = ingreso - gasto;
        int ahorroBimestral = ahorroMensual * 2;
        int ahorroSemestral = ahorroMensual * 6;
        int ahorroAnual = ahorroMensual * 12;

        System.out.println("Ahorro mensual: "+ahorroMensual);
        System.out.println("Ahorro bimestral: "+ahorroBimestral);
        System.out.println("Ahorro semestral: "+ahorroSemestral);
        System.out.println("Ahorro anual: "+ahorroAnual);

    }
}