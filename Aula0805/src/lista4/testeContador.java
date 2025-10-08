package lista4;

public class testeContador {

	public static void main(String[] args) {

        System.out.println("Criando instâncias do Contador...");
        Contador c1 = new Contador();
        System.out.println("Contagem atual: " + Contador.getContagem());

        Contador c2 = new Contador();
        System.out.println("Contagem atual: " + Contador.getContagem());

        new Contador();
        System.out.println("Contagem atual: " + Contador.getContagem());

        System.out.println("\nIncrementando o contador manualmente...");
        Contador.incrementar();
        System.out.println("Contagem após incrementar: " + Contador.getContagem());

        Contador.incrementar();
        System.out.println("Contagem após incrementar novamente: " + Contador.getContagem());

        System.out.println("\nZerando o contador...");
        Contador.zerar();
        System.out.println("Contagem após zerar: " + Contador.getContagem());

        System.out.println("\nCriando novas instâncias após zerar...");
        Contador c3 = new Contador();
        System.out.println("Contagem atual: " + Contador.getContagem());

        Contador c4 = new Contador();
        System.out.println("Contagem atual: " + Contador.getContagem());
    }

}