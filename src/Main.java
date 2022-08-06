
public class Main {

	public static void main(String[] args) {
		Cliente kaio = new Cliente();
		kaio.setNome("Kaio");
		
		Conta cc =new ContaCorrente(kaio);
		Conta poupanca = new ContaPoupanca(kaio);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
	
	
}
