
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego=new Funcionario();
		diego.setDocumento("58852369");
		diego.setNombre("diego lopez");
		diego.setSalario(20000);
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
