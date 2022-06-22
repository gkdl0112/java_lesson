package koreait.test0;
//작성자 김형수
public class ProductTest {

	public static void main(String[] args) {
		
		Product[] cart = new Product[5];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "삼천리", 15);
		cart[1] = new Electronics(35000,"USB");
		cart[5] = new Electronics(117000,"ipad");
		cart[7] = new Electronics(2250000,"lg 냉장고");
		
		//14 : cart[7] 은 Product 타입. power() 메소드 실행은 Electronics
		Electronics et = (Electronics)cart[7]; 
		et.setKwh(0.9);
		System.out.println(et.power());
	
		for(Product temp : cart)
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
	
		for(Product temp : cart) {
			if(temp instanceof Bike) {
				System.out.println(((Bike) temp).ride());
			}	
		}
	
	}
}
		
class Electronics extends Product {
			double kwh;
			
			public Electronics() {
				// TODO Auto-generated constructor stub
			}
			
			public Electronics(int price,String prdName ) {
				this.price = price;
				this.prdName=prdName;
			}

			public double getKwh() {
				return kwh;
			}

			public void setKwh(double kwh) {
				this.kwh = kwh;
			}
//			실행예시 :          Electronics tv = new Electronics(); 
//  						System.out.println(tv.sell("aaa"));
//			실행결과:	묶음상품 - aaa (1set)

			
			@Override
			public String sell(Object obj) {
				
				return String.format("묶음상품 - %s (1set)",obj );
			}

			@Override
			public String toString() {
				return "Electronics [kwh=" + kwh + ", prdName=" + prdName + ", getPrice()=" + price + "]";
			}
			
			//인스턴스 메소드
			public double power() {
				return this.kwh*24;
				
			}
		}
	




