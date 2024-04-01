import java.util.Scanner;

public class Console {
    public static Scanner scanner = new Scanner(System.in);

    public static FolhaPagamento lerDadosFuncionario() {
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o número de horas trabalhadas:");
        int horas = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o valor da hora trabalhada:");
        double valorHora = Double.parseDouble(scanner.nextLine());
        return new FolhaPagamento(nome, horas, valorHora);
    }

    public static int mostrarMenu() {
        System.out.println("\nCONSULTOR DE FOLHA DE PAGAMENTO!");
        System.out.println("Menu:");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular folha de pagamento");
        System.out.println("2. Sair");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void exibirResultados(String nomeFuncionario, double salarioBruto, double ir, double inss, double fgts, double salarioLiquido) {
        System.out.println("\nResultados:");
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("IR: R$ " + String.format("%.2f", ir));
        System.out.println("INSS: R$ " + String.format("%.2f", inss));
        System.out.println("FGTS: R$ " + String.format("%.2f", fgts));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
    }
}

