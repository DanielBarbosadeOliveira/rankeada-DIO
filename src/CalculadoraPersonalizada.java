import java.util.Scanner;

public class CalculadoraPersonalizada {
    
    public static int retornoSaldo(int vitoria, int derrota){
        int saldo = vitoria - derrota;
        return saldo;
    }
    
    public static String nivelPersonagem (int vitoria) {
        String ranking;
        if (vitoria <= 10){
            ranking = "Ferro";
        } else if (vitoria > 10 && vitoria <= 20){
            ranking = "Bronze";
        } else if (vitoria > 20 && vitoria <= 50){
            ranking = "Prata";
        } else if (vitoria > 50 && vitoria <= 80){
            ranking = "Ouro";
        } else if (vitoria > 80 && vitoria <= 90){
            ranking = "Diamante";
        } else if (vitoria > 90 && vitoria <= 100){
            ranking = "Lendário";
        } else {
            ranking = "Imortal";
        }
        return ranking;
    }

    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       System.out.print("Digite o número de vitórias que o seu personagem teve: ");
       int vitoria = teclado.nextInt();
       System.out.print("Agora digite o número de derrotas que o seu personagem teve: ");
       int derrota = teclado.nextInt();
        int saldo = retornoSaldo(vitoria, derrota);
        String ranking = nivelPersonagem(vitoria);
        System.out.print("O herói tem de saldo de vitória " + saldo + " e está no ranking " + ranking);
    }
}
