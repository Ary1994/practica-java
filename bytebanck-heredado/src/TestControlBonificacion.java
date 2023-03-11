
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego= new Funcionario();
		diego.setSalario(2000);
		Gerente valeria=new Gerente();
		valeria.setSalario(10000);
		ControlBonificacion control=new ControlBonificacion();
		control.registrarSalario(diego);
		control.registrarSalario(valeria);
	}
}
