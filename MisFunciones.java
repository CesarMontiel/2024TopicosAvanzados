public class MisFunciones {

    public void cambiarValoresVariales(int a, int b) {
        System.out.println("Antes de cambiar los valores de las variables");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Valores de las variables después de cambiarlas");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

    }

    public boolean isPalindromo(String palabra) {
        char[] palabraArray = palabra.toCharArray();
        int i = 0;
        int j = palabraArray.length - 1;

        while (i < j) {
            if (palabraArray[i] != palabraArray[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
