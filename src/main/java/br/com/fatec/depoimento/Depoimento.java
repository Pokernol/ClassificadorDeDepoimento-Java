package main.java.br.com.fatec.depoimento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Depoimento {
    private String[] palavrasDeOdio = {"porra", "caralho", "desgraçado","desgraçada", "puta", "vadia", "puto", "arrombado", "arrombada", "otário", "otária", "babaca", "vagabundo", "vagabunda", "ordinário", "ordinária", "foda-se", "cú", "cacete", "viado", "bixa", "viadinho", "bixinha", "cúzinho", "putinha", "matar", "morra", "fuder"};
    public void executarPrograma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do depoente :");
        String nome = scanner.nextLine();
        System.out.println("Digite o depoimento:");
        String depoimento = scanner.nextLine();
        String nivelDeCensura = classificacaoDeDepoimento(depoimento);
        LocalDate data = LocalDate.now();
        String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("O nível de censura de depoimento dado dia " + dataFormatada + " por " + nome + " é: " + nivelDeCensura);
    }
    public String classificacaoDeDepoimento(String depoimento){
        int contadorDePalavrasDeOdio = 0;
        for (String palavraDeOdio : palavrasDeOdio) {
            Pattern palavraAtual = Pattern.compile(palavraDeOdio);
            Matcher BuscaNoDepoimento = palavraAtual.matcher(depoimento);
            while (BuscaNoDepoimento.find()) {
                contadorDePalavrasDeOdio++;
            }
        }
        if (contadorDePalavrasDeOdio > 10) {
            return "inseguro";
        } else if (contadorDePalavrasDeOdio > 5) {
            return "aceitável";
        } else {
            return "livre";
        }
    }
}
