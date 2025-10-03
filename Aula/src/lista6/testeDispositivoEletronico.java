package lista6;

public class testeDispositivoEletronico {

	public static void main(String[] args) {
		
		System.out.println("Testando Televisao");
        Televisao minhaTv = new Televisao("Smart TV Samsung");
        minhaTv.exibirStatus();
        minhaTv.ligar();
        minhaTv.exibirStatus();
        minhaTv.aumentarVolume();
        minhaTv.mudarCanal(5);
        minhaTv.aumentarVolume();
        minhaTv.diminuirVolume();
        minhaTv.exibirStatus();
        minhaTv.resetar();
        minhaTv.exibirStatus();
        minhaTv.desligar();
        minhaTv.exibirStatus();
        minhaTv.resetar();

        System.out.println("Testando Radio");
        Radio meuRadio = new Radio("Rádio Philco");
        meuRadio.exibirStatus();
        meuRadio.ligar();
        meuRadio.exibirStatus();
        meuRadio.sintonizar(103.5, "FM");
        meuRadio.sintonizar(760, "AM");
        meuRadio.exibirStatus();
        meuRadio.resetar();
        meuRadio.exibirStatus();
        meuRadio.desligar();
        meuRadio.exibirStatus();

        System.out.println("Testando Notebook");
        Notebook meuNotebook = new Notebook("Dell XPS 15");
        meuNotebook.exibirStatus();
        meuNotebook.ligar();
        meuNotebook.exibirStatus();
        meuNotebook.carregarBateria(10);
        meuNotebook.exibirStatus();
        meuNotebook.resetar();
        meuNotebook.exibirStatus();
        meuNotebook.exibirStatus();	

	}

}
