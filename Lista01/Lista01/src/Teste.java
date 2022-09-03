public class Teste {
    public static void main(String[] args) {
        char[] nome = new char[30];

        for (int i = 0; i < nome.length; i++) {
            nome[i] = (char) (97 + i);
        }
        System.out.println(nome);

    }
}
