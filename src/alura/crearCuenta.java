package alura;

public class crearCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta primeraCuenta=new Cuenta();
		primeraCuenta.depositar(200);
		Cuenta segundaCuenta=new Cuenta();
		segundaCuenta.depositar(1000);
		segundaCuenta.tranferir(500, primeraCuenta);
		System.out.println(primeraCuenta.saldo);
		System.out.println(segundaCuenta.saldo);
	}

}
