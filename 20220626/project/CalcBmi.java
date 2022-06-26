package project;

public class CalcBmi {
	private double height,weight,bmi;

	public CalcBmi(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public double getBmi() {
		return bmi;
	}

	private void calcBmi() {
		bmi = weight / (height*height);		
	}
	
	public String resultBmi() {
		calcBmi();
		
		String result = "정상";
		if(bmi < 18.5)
			result = "저체중";
		else if(bmi < 25)
			result = "정상";
		else if(bmi < 30)
			result = "과체중";
		else
			result = "고도비만";
		return result;
	}
	
	
}
