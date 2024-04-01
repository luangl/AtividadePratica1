public class FolhaPagamento {
    public String nomeFuncionario;
    public int horasTrabalhadas;
    public double valorHora;

    public FolhaPagamento(String nomeFuncionario, int horasTrabalhadas, double valorHora) {
        this.nomeFuncionario = nomeFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double calcularSalarioBruto() {
        return horasTrabalhadas * valorHora;
    }

    public double mostrarIR(double salarioBruto) {
        double ir;
        if (salarioBruto <= 1372.81) {
            ir = 0;
        } else if (salarioBruto <= 2743.25) {
            ir = salarioBruto * 0.15 - 205.92;
        } else {
            ir = salarioBruto * 0.275 - 548.82;
        }
        return ir;
    }

    public double mostrarINSS(double salarioBruto) {
        if (salarioBruto <= 868.29) {
            return salarioBruto * 0.08;
        } else if (salarioBruto <= 1447.14) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 2894.27) {
            return salarioBruto * 0.11;
        } else {
            return 318.37;
        }
    }

    public double mostrarFGTS(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    public double mostrarSalarioLiquido(double salarioBruto, double ir, double inss) {
        return salarioBruto - ir - inss;
    }
}

