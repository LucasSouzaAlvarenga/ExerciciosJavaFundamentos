package ExercicioMaiorNumero;

public class entitiesMaiorNum {
	private Integer num1, num2;
	
	public entitiesMaiorNum(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public entitiesMaiorNum() {}
	
	public void maiorMenor(){
		if(getNum1() > getNum2()) {
			System.out.println("Maior numero é: " + getNum1());
		}else {
			System.out.println("Maior numero é: "+ getNum2());
		}
	}
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	public Integer getNum2() {
		return num2;
	}
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	
}
