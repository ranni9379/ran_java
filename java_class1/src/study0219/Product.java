package study0219;

public class Product {
String productName;// 상품명
String brand; //브랜드
int among; //수량 

Product(){}
Product(String productName, int among){
this.productName= productName;
this.among=among;
}
Product(String prodcuctName, String brand, int among){
	this.productName=productName;
	this.brand=brand;
	this.among=among;
	
}

}