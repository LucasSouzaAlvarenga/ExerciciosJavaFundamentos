package ExeNumDecrescente;

public class numeroDecrescente {
	private Integer num;
	public numeroDecrescente(Integer num) {
		this.num = num;
	}
	
	public void Decrescente() {
		for(int i = 0; i <= getNum(); i++) {
			System.out.println(getNum() - i);
		}
	}
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
}