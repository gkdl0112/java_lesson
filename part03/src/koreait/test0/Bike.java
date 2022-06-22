package koreait.test0;
//작성자 김형수
public class Bike extends Product{
	//e	
	private int speed;
	
	//f
	public Bike() {
	}
	public Bike(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//d
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %d %% 인하", obj);
	}
	
	//e
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//g
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" +price + ", prdName=" + prdName + "]";
	}
	//인스턴스 메소드
	public String ride () {
		return "당신은 이것을 시속 " + this.speed + "km 로 탈수있습니다 ";
	}
}










