public class App {
    
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
        int saldo = retornoSaldo(50, 20);
        String ranking = nivelPersonagem(50);
        System.out.println("O herói tem de saldo de vitória " + saldo + " e está no ranking " + ranking);
    }
}
