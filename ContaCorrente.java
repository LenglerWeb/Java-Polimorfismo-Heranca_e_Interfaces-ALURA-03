

//new ContaCorrente()
public class ContaCorrente implements Tributavela {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }
	
}
