public class testeData {
    
    public static void main(String[] args) {
        data d = new data(15, 5, 2005);

        d.displayData();

        System.out.println("auterando data...");
        d.setDia(2);
        d.setMes(9);
        d.setAno(2020);

        d.displayData();
    }
}
