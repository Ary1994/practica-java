package alura;

public class Cuenta {
 double saldo;
 int agencia;
 int numero;
 String titular;
 	public void depositar( double valor) {
	 this.saldo=this.saldo+valor;
 	}
 	public boolean retirar( double valor) {
	 if (this.saldo>=valor) {
		 this.saldo=this.saldo-valor;
		 return true;
	 }else {
		 return false;
	 }
 	}
 	public boolean tranferir(double valor,Cuenta cuenta) {
 		if(this.saldo>=valor) {
 			this.retirar(valor);
 			cuenta.depositar(valor);
 			return true;
 		}
 		else {
 			return false;
 		}
 	}
}