package JjunitCajaNegra;

public enum Debug {
	A("Activado",true),D("Desactivado",false);
	public String interruptor;
	public boolean activo;
	Debug(String interruptor, boolean activo){
		this.interruptor = interruptor;
		this.activo = activo;
	}
}
