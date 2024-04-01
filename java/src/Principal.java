public class Principal {
    public static void main(String[] args) {
        int opcao;
        do {
            opcao = Console.mostrarMenu();
            switch (opcao) {
                case 1:
                    FolhaPagamento folha = Console.lerDadosFuncionario();
                    double salarioBruto = folha.calcularSalarioBruto();
                    String nomeFuncionario = folha.getNomeFuncionario();
                    double ir = folha.mostrarIR(salarioBruto);
                    double inss = folha.mostrarINSS(salarioBruto);
                    double fgts = folha.mostrarFGTS(salarioBruto);
                    double salarioLiquido = folha.mostrarSalarioLiquido(salarioBruto, ir, inss);
                    Console.exibirResultados( nomeFuncionario, salarioBruto, ir, inss, fgts, salarioLiquido);
                    break;
                case 2:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Essa opção não existe");
                    
            }
        } while (opcao != 2);
    }
}