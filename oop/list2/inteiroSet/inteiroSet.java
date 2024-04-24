public class inteiroSet {
    private boolean [] set = new boolean [101];

    public inteiroSet () {
        for (int i = 0; i <= 100; i++) {
            set[i] = false;
        }
    }

    public inteiroSet union (inteiroSet seccondSet) {
        inteiroSet thirdSet = new inteiroSet();

        for (int i = 0; i <= 100; i++) {
            thirdSet.set[i] = set[i] || seccondSet.set[i];
        }

        return thirdSet;
    }

    public inteiroSet interseccao (inteiroSet seccondSet) {
        inteiroSet thirdSet = new inteiroSet();

        for (int i = 0; i <= 100; i++) {
            thirdSet.set[i] = set[i] && seccondSet.set[i];
        }

        return thirdSet;
    }

    public void insereElemento (int numero) {
        set[numero] = true;
    }

    public void deleteElemento (int numero) {
        set[numero] = false;
    }

    public String toSetString () {
        String setString = "| ";

        for (int i = 0; i <= 100; i++) {
            if (set[i]) {
                setString += i + "| ";
            }
        }

        if (setString == "| ") {
             return "-";
        }

        return setString;
    }

    public boolean ehIgualTo (inteiroSet seccondSet) {
        for (int i = 0; i <= 100; i++) {
            if (set[i] != seccondSet.set[i]) {
                return false;
            }
        }

        return true;
    }
}
