public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        try {
            teste1();
        } catch(Exception ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    public static void teste1() throws ExcecaoMinha{
        System.out.println("teste 1");
        teste2();
        System.out.println("Fim do teste 2");
    }

    public static void teste2() throws ExcecaoMinha{
        System.out.println("teste 2");
        throw new ExcecaoMinha("Deu errado");
//                Conta c = null;
//        System.out.println("Fim do teste 2");
    }
}