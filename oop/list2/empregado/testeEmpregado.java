public class testeEmpregado {
    public static void main(String[] args) {
        empregado e1 = new empregado("Joao", "Silva", 1890.00);
        empregado e2 = new empregado("Miguel", "Costa", 3200.00);

        System.out.printf("Empregado %s %s salario anual: %f\n", e1.getName(), e1.getSobrenome(), e1.getSalarioMensal() * 12);

        System.out.printf("Empregado %s %s salario anual: %f\n", e2.getName(), e2.getSobrenome(), e2.getSalarioMensal() * 12);

        e1.setSalarioMensal(e1.getSalarioMensal() * 1.1);
        e2.setSalarioMensal(e2.getSalarioMensal() * 1.1);

        System.out.println("Aumento de 10% em ambos os empregados");

        System.out.printf("Empregado %s %s salario anual: %f\n", e1.getName(), e1.getSobrenome(), e1.getSalarioMensal() * 12);

        System.out.printf("Empregado %s %s salario anual: %f\n", e2.getName(), e2.getSobrenome(), e2.getSalarioMensal() * 12);
    }
}
