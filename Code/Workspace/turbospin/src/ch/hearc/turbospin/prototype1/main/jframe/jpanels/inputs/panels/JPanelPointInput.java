package ch.hearc.turbospin.prototype1.main.jframe.jpanels.inputs.panels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ch.hearc.turbospin.prototype1.exceptions.UserIsAnIdiotException;
import ch.hearc.turbospin.prototype1.mathtools.Point3D;

public class JPanelPointInput extends JPanel {
	public JPanelPointInput() {
		xField = new JTextField(5);
		yField = new JTextField(5);
		zField = new JTextField(5);

		this.add(new JLabel("x:"));
		this.add(xField);
		this.add(new JLabel("y:"));
		this.add(yField);
		this.add(new JLabel("z:"));
		this.add(zField);
	}

	public Point3D getPoint3D() throws UserIsAnIdiotException {
		double x;
		double y;
		double z;
		
		try {
			x = Double.parseDouble(xField.getText());
			y = Double.parseDouble(yField.getText());
			z = Double.parseDouble(zField.getText());
		} catch (NumberFormatException e) {
			throw new UserIsAnIdiotException("Missing values");
		}

		return new Point3D(x, y, z);
	}

	private JTextField xField;
	private JTextField yField;
	private JTextField zField;
}
