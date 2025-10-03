package resolutiontest;
import java.util.Scanner;

public class testecliente {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		Cliente cliente1 = new Cliente(0, null, null, null, null, 0, 0);
		cliente1.setAge(scanner.nextInt());
		
		System.out.println("Digite seu cpf");
		cliente1.setCpf(scanner.next());
		
		System.out.println("Digite seu nome");
		cliente1.setName(scanner.next());
		
		System.out.println("Digite seu salário");
		cliente1.setIncome(scanner.nextDouble());
		
		System.out.println("Digite sua localização");
		cliente1.setLocation(scanner.next());
		
		System.out.println("Digite o valor pretendido");
		cliente1.setEmprestimopretendido(scanner.nextDouble());

	
	if (cliente1.getIncome() <= 3000) {
		System.out.println("Olá " + cliente1.getName() + ", Os emprestimos que você tem acesso são: EMPRESTIMO PESSOAL, com valor total de: R$ " + cliente1.EmprestimoPessoal());
	}
	if (cliente1.getIncome() >= 3000 && cliente1.getIncome() <= 5000 && cliente1.getAge() < 30 && cliente1.getLocation().equals("sp")) {
		System.out.println("Olá " + cliente1.getName() + ", Os emprestimos que você tem acesso são: EMPRESTIMO PESSOAL, com valor total de: R$ " + cliente1.EmprestimoPessoal());
		
	}
	if (cliente1.getIncome() >= 5000) {
		System.out.println("Olá " + cliente1.getName() + ", Os emprestimos que você tem acesso são: EMPRESTIMO CONSIGNADO, com valor total de: R$ " + cliente1.EmprestimoConsignado());
	}
	if (cliente1.getIncome() > 3000 && cliente1.getIncome() < 5000 && cliente1.getAge() < 30 && cliente1.getLocation().equals("sp")) {
		System.out.println("Olá " + cliente1.getName() + ", Os emprestimos que você tem acesso são: EMPRESTIMO COM GARANTIA, com valor total de: R$ " + cliente1.EmprestimoComGarantia());
	
	}
	if (cliente1.getIncome() <= 3000) {
		System.out.println("Olá " + cliente1.getName() + ", Os emprestimos que você tem acesso são: EMPRESTIMO COM GARANTIA, com valor total de: R$ " + cliente1.EmprestimoComGarantia());
		}
	}
}
