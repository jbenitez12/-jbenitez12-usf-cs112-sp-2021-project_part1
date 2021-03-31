package CS112Project;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class DataPointMain {

	public static void main(String[] args) {
		ArrayList<DataPoint> a = new ArrayList<DataPoint>();
		Predictor obj = new DummyPredictor();
		ArrayList<DataPoint> x = obj.readData("t1");
		ArrayList<DataPoint> b =obj.readData("t2");
		System.out.println(" ");
		System.out.println(obj.test(x.get(0)));
		System.out.println(" ");
		System.out.println("Pressing getAccuracy's button will display this random value: ");
		double value = obj.getAccuracy(x);
		String j = String.valueOf(value);
		System.out.println(" ");
		System.out.println("Pressing the getPercision's button will display this random value: ");
		double value1= obj.getPercision(x);
		String ben = String.valueOf(value1);
		
		JFrame myFrame = new JFrame("CS112 PROJECT PART 1");
		Container contentPane = myFrame.getContentPane();
		contentPane.setLayout(new GridLayout(2,0));
		JButton button = new JButton("getAccuracy");
		button.addActionListener(e -> System.out.println(j));
		contentPane.add(button);
		JButton button1 = new JButton("getPercision");
		button1.addActionListener(e -> System.out.println(ben));
		contentPane.add(button1);

		myFrame.setPreferredSize(new Dimension(600,600));
		myFrame.pack();
		myFrame.setVisible(true);
	}

}
