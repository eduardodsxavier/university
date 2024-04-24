public class conta {
    String nome;
    private String cpf;
    private int saldo;
    String tipoConta;

    // dois contructors que recebem todas as informações obrigatorias para criar uma conta
    // o primeiro constructor inicia o saldo para zero 
    public conta(String nome, String cpf, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        saldo = 0;
    }

    // o segundo constructor seta um valor inicial ao saldo
    public conta(String nome, String cpf, String tipoConta, int saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    // metodo que deposita quantidade x na conta, verificando se x não é um valor negativo
    // retorna 0 caso tudo ocorra corretamente, e 1 para caso o valor de x seja menor ou igual a zero 
    public int depositar(int valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            return 0;
        }

        return 1;
    }

    public int sacar(int valorSacar) {
        if (valorSacar > saldo || valorSacar <= 0) {
            return 1;
        }

        saldo -=  valorSacar;
        return 0;
    }

    public void mostrarSaldo() {
        System.out.println(saldo);
    }

    public int transferencia(int valorTransferencia ,conta contaRecebe) {
        if (valorTransferencia > saldo || valorTransferencia <= 0) {
            return 1;
        }
        saldo -= valorTransferencia;
        contaRecebe.saldo += valorTransferencia;
        return 0;
    }
}
