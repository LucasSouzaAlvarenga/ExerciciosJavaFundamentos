package ExercicioContaBancaria;

public class entitiesConta {
	public Integer numeroConta;
	public String tipoConta;
	private String nomeTitular;
	private Double saldo;
	private Boolean status;
	public entitiesConta() {
		setStatus(false);
		setSaldo(0.0);
		
	}


	
	public void abrirConta(String tipoConta) {
		this.setTipoConta(tipoConta);
		this.setStatus(true);
		if(tipoConta.equals("CC")) {
			this.setSaldo(50.00);
			System.out.println("Conta Corrente aberta com sucesso");
			}else if(tipoConta.equals("CP")) {
				this.setSaldo(150.00);
				System.out.println("Conta Poupança aberta com sucesso");
			} 
	}
	
	public void fecharConta() {
			if(getSaldo() == 0) {
				setStatus(false);
			}else if(getSaldo() > 0) {
				System.out.println("Conta com dinheiro");
				setStatus(true);	
				}else {
					setStatus(true);
					System.out.println("Conta em debito");
				}
			}
	
	public void depositar(Double deposito) {
		if(getStatus() == true) {
			setSaldo(getSaldo() + deposito);
			System.out.println("Deposito realizado com sucesso, na conta de: " + getNomeTitular());
		}else {
			System.out.println("Impossivel depositar");
		}
		
	}
	public void sacar(Double sacar) {
		if(getStatus() == true) {
			if(getSaldo() >= sacar) {
				setSaldo(getSaldo() - sacar);
				System.out.println("Saque realizado na conta de "+ getNomeTitular());
				}else{
					System.out.println("valor acima do permitido");
			}
		}else {
			System.out.println("Conta fechada");
		}
		
	}
	public void pagarMensal() {
		if(getTipoConta() == "CC") {
			setSaldo(getSaldo() - 12.00);
		}else if(getTipoConta()== "CP") {
			setSaldo(getSaldo()- 20.00);
		}
	}
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumeroConta());
		System.out.println("Tipo: " + this.getTipoConta());
		System.out.println("Dono: " + this.getNomeTitular());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: "+ this.getStatus());
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}
