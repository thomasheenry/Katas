public class Kata {

    public static String solution(String str) {
        char[] caracteres = str.toCharArray();
        int tamanho = caracteres.length;
        StringBuilder palavraInvertida = new StringBuilder();

        for (int i = tamanho - 1; i >= 0; i--) {
            palavraInvertida.append(caracteres[i]);
        }
        return palavraInvertida.toString();
    }

    public static void main(String[] args) {
        String palavra = "world";
        String palavraInvertida = solution(palavra);
        System.out.println(" A palavra world invertida fica: " + palavraInvertida);
    }
}












