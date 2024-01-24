import java.util.jar.JarOutputStream;
public class Main {
    public static void main(String[] args) {
        System.out.println(eseguiOperazione("11", "^", "56"));

    }
    public static double eseguiOperazione(String numero1, String operatore, String numero2) {
        double operand1 = Double.valueOf(numero1);
        double operand2 = Double.valueOf(numero2);

        if (Double.isNaN(operand1) || Double.isNaN(operand2)) {
            System.out.println("Errore: Input non valido. Assicurati di inserire numeri validi.");
            return Double.NaN;
        }

        switch (operatore) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    System.out.println("Errore: divisione per zero.");
                    return Double.NaN;
                }
            case "^":
                return Math.pow(operand1, operand2);
            default:
                System.out.println("Operatore non supportato.");
                System.out.println("Inserisci un operatore valido: ");
                System.out.println(" + per addizione");
                System.out.println(" - per sottrazione");
                System.out.println(" * per moltiplicazione");
                System.out.println(" / per divisione");
                System.out.println(" ^ per potenza");
                return Double.NaN;
        }
    }
}


