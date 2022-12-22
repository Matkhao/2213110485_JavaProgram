import java.util.*;
public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product pd = new Product();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] productList = new Product[4];
		for(Product PDS: productList) {
			System.out.print("Input product ID    : ");
			pd.setId(scan.next());
			System.out.print("Input product Unit  : ");
			int item = scan.nextInt();
			pd.setUnit(item);
			while(item<=0) {
				System.out.print("Input product Unit, again : ");
				item = scan.nextInt();
				pd.setUnit(item);
			}
			System.out.print("Input product Price : ");
			double money = scan.nextDouble();
			pd.setPrice(money);
			while(money<=0) {
				System.out.print("Input product Price, again : ");
				money = scan.nextDouble();
				pd.setPrice(money);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		System.out.println("Product ID : "+pd.getId());

	}

}
