
public class TestGerente {
public static void main(String[] args) {
	Gerente gerente=new Gerente();
	gerente.setClave("calleFalsa123");
	gerente.setSalario(60000);
	System.out.println(gerente.IniciarSecion(gerente.getClave()));
	System.out.println(gerente.getBonificacion());
}


}
