package conversion;

import javax.swing.JOptionPane;

public class Conversion {

	public static void main(String[] args) {
		
		float kg;
		int menu;
		
		kg = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de kilogramos"));
		menu = Integer.parseInt(JOptionPane.showInputDialog("Lo quieres convertir a:\n"
				+ "1.- Hectogramos\n"
				+ "2.- Decagramos\n"
				+ "3.- Gramos\n"
				+ "4.- Decigramos\n"
				+ "5.- Centigramos\n"
				+ "6.- Miligramos"));
		
		switch(menu) {
		
		case 1: kg*=10; JOptionPane.showConfirmDialog(null, "La cantidad de Hectogramos es: "+kg);
			break;
		
		case 2: kg*=100; JOptionPane.showConfirmDialog(null, "La cantidad de Decagramos es: " +kg);
			break;
		
		case 3: kg*=1000; JOptionPane.showConfirmDialog(null, "La cantidad de Gramos es: " +kg);
			break;
			
		case 4: kg*=10000; JOptionPane.showConfirmDialog(null, "La cantidad de Decigramos es: "+kg);
			break;
			
		case 5: kg*=100000; JOptionPane.showConfirmDialog(null, "La cantidad de Centigramos es: "+ kg);
			break;
		
		case 6: kg*=1000000; JOptionPane.showConfirmDialog(null, "La cantidad de Miligramos es: "+ kg);
			
		default: JOptionPane.showConfirmDialog(null, "Digita una medida correcta");
		}
		
		
		
		

	}

}
