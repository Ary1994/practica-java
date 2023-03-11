
public class Gerente extends Funcionario{
private String clave;

public String getClave() {
	return clave;
}

public void setClave(String clave) {
	this.clave = clave;
}

//metodos
public boolean IniciarSecion(String clave) {
	return clave=="calleFalsa123";
}
public double getBonificacion() {
	return super.getSalario()+super.getBonificacion();
}
}
