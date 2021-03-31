package CS112Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Random;

public class DummyPredictor extends Predictor {

	@Override
	ArrayList<DataPoint> readData(String filename) {
		ArrayList<DataPoint> ar = new ArrayList<DataPoint>();
		boolean boo = false;
		try {
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			String boo1 = sc.next(); 
			String buu = sc.next();
			if(buu == "true") {
				boolean boo2 =  true;
				boo = boo2;
			}
			else if(buu == "false") {
				boolean boo2 = false;
				boo = boo2;
			}
			double total = (num1 - num2)/2;
			System.out.println("The Average Difference is: " + total + " for the arguments:");
			ar.add(new DataPoint(num1, num2, boo1, boo));
			System.out.println(num1+" " + num2 + " "+ boo1+ " "+ boo);
		} catch (FileNotFoundException e) {
			System.out.println("Missing File");
			e.printStackTrace();
		}
		return ar;
	}

	@Override
	String test(DataPoint data) {
		System.out.println("This Program will see which random value is closer to the sum of  both arguments.");
		ArrayList<DataPoint> ar = new ArrayList<DataPoint>();
		Scanner myinput  = new Scanner(System.in);
		System.out.println("Please enter a random number from 1-100:");
		int x = myinput.nextInt();
		System.out.println("getAccuracy random value:");
		Double ran = getAccuracy(ar);
		System.out.println("getPercision random value: ");
		Double rando = getPercision(ar);
		Double ran1 = x - ran;
		Double ran2 = x - rando;

		System.out.println(" ");
		if (ran1 < ran2) {
			return "getAccuracy is closer to your guess!" + " " +x;
		}
		else {
			return  "getPercision is closer to your guess!" + " " +x;
		} 
		
	}

	@Override
	Double getAccuracy(ArrayList<DataPoint> data) {
		Random rd = new  Random();
		int rando = rd.nextInt(100);
		Double ran = rd.nextDouble();
		Double random = rando+ran;
		System.out.println(random);
		return random;
	}

	@Override
	Double getPercision(ArrayList<DataPoint> data) {
		Random rd = new  Random();
		int rando = rd.nextInt(100);
		Double ran = rd.nextDouble();
		Double random = rando+ran;
		System.out.println(random);
		return random;
	}

}
