public class faturaTeste {
    public static void main(String[] args) {
        fatura f = new fatura("01", "mouse", 1, 23.50);

        System.out.printf("numero: %s descrição: %s quantidade: %d preço: %.2f \n", f.getNumero(), f.getDescricao(), f.getQuantidade(), f.getPreco());
        System.out.printf("valor total: %.2f \n", f.getTotalFatura());

        f.setQuantidade(3);
        f.setPreco(24.99);
        
        System.out.printf("numero: %s descricao: %s quantidade: %d  preço: %.2f \n", f.getNumero(), f.getDescricao(), f.getQuantidade(), f.getPreco());
        System.out.printf("valor total: %.2f \n", f.getTotalFatura());

    }
}
