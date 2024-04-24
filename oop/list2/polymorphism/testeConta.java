public class testeConta {
    public static void main(String[] args) {
        conta c = new conta("Eduardo", "00000000000", "corrente", 1528);
        conta c2 = new conta("Miguel", "adad", "cu");
        
        c.mostrarSaldo();
        c.sacar(13);
        c.mostrarSaldo();
        c.depositar(15);
        c.mostrarSaldo();
        
        c2.mostrarSaldo();

        c.transferencia(500, c2);

        c.mostrarSaldo();

        c2.mostrarSaldo();

    }
}
