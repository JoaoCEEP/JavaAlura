public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

// código omitido

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
        int dia = 4;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }
        System.out.println("O dia " + dia + " é " + nomeDia);

        String ronaldo = "Gaúcho";
        String jogador;
        switch (ronaldo) {
            case "Gaúcho":
                jogador = "Ronaldinho";
                break;
            case "CR7":
                jogador = "Cristiano Ronaldo";
                break;
            case "Fenomeno":
                jogador = "Ronaldo Nazario";
                break;
            default:
                jogador = "Ronaldo desconhecido";
                break;
        }
        System.out.println("O ronaldo é " + jogador);
    }
}