
public class Week12_1 {
 //Instance variable
	private String  color;
	private double HorsePower, EngineSize ;
	public Week12_1() {
		this.color = "black";
		this.HorsePower =0;
		this.EngineSize =0;
	}
	public Week12_1(String color ,double HorsePower ,double EngineSize){
		this.color = color;
		this.HorsePower = HorsePower;
		this.EngineSize = EngineSize;
	}

public String getColor(){
	return color;
	
}


public void setColor(String color) {
	this.color = color;
}

public double getHorsePower() {
	return HorsePower;
}

public void setHorsePower(double horsePower) {
	HorsePower = horsePower;
}

public double getEngineSize() {
	return EngineSize;
}

public void setEngineSize(double engineSize) {
	EngineSize = engineSize;
}
public String toString(){
	return "[ color:" + this.color + "HorsePower:" + this.HorsePower + "EngineSize:" + this.EngineSize+ "]";
}
}
