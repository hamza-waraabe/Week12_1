
public class CarDriver {
	public static void main(String [] args){
		Week12_1 Lincoln = new Week12_1("silver", 210, 2.0);

		System.out.println(Lincoln);

		Week12_1 car1 = new Week12_1();

		System.out.println(car1);

		

		Week12_1 Supra = new Week12_1("pearly", 300, 3.0);

		System.out.println(Supra);

		Week12_1 car2 = new Week12_1();

		System.out.println(car2);

		

		Week12_1 toyota = new Week12_1("gold", 260, 2.5);

		System.out.println(toyota);

		Week12_1 car3 = new Week12_1();

		System.out.println(car3);
		
		toyota.setColor("red");
		System.out.println(toyota.getColor());
	 
		toyota.setHorsePower(320);
		System.out.println(toyota.getHorsePower());
		 
		toyota.setEngineSize(3.0);
		System.out.println(toyota.getEngineSize());

}
}
