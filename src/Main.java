import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valorPrimitivo = 10;
        int valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.print("Valor wrapper após a conversão: " + valorWrapper);
    }
}