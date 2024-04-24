public class empregado {
    private String name;
    private String sobrenome;
    private double salarioMensal;

    public empregado(String name, String sobrenome, double salarioMensal) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    } 
}
