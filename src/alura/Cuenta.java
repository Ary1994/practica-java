package alura;

public class Cuenta {
  private double saldo;
  private int agencia;
  private int numero;
 Cliente titular=new Cliente();
 private static int total=0;
 
 public Cuenta(int agencia, int numero) {
	this.agencia = agencia;
	this.numero = numero;
	System.out.println("Estoy creando una cuenta");
	total++;
}

public int getAgencia() {
	return agencia;
}

public void setAgencia(int agencia) {
	if(agencia>0) {
		this.agencia = agencia;
		}
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public double getSaldo() {
	return saldo;
}
public void setTitular(Cliente titular) {
	this.titular = titular;
}

	//metodos
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