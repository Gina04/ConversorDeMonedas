package conversorDeMonedas;

import javax.swing.JOptionPane;


public class function {
	
	
		
public void convertirMoneda(double valor, String moneda) {
			double resultado=0;
			double dolar = 122;
			double euro = 127; 
			double libra= 148;
			double yen= 0.910922;
			double wonCoreano= 0.0946392;
			
			switch(moneda){
			case "De pesos a Dólar":
				 resultado = valor/ dolar;
				 JOptionPane.showMessageDialog(null, "Tiene " + resultado + " Dólar" ); 
				 break;
			case "De pesos a Euro": 
				 resultado = valor / euro;
				 JOptionPane.showMessageDialog(null, "Tiene " + resultado + " Euro" ); 
				 break;
			case "De pesos a Libras":
				 resultado = valor / libra;
				 JOptionPane.showMessageDialog(null, "Tiene " + resultado + " Libras" ); 
				 break;
			case "De Pesos a Yen": 
				 resultado= valor / yen;
				 JOptionPane.showMessageDialog(null, "Tiene " + resultado + " Yen" ); 
				 break;
			case "De Pesos a Won Coreano":
				 resultado= valor / wonCoreano;
				 JOptionPane.showMessageDialog(null, "Tiene " + resultado + " Coreano" ); 
				 break;
			case "De Dólar a Pesos": 
				 resultado = dolar * valor;
				 break;
			case "De Euro a Pesos": 
				 resultado = euro * valor;
				 JOptionPane.showMessageDialog(null, "Tiene " + resultado + " Pesos" ); 
				 break;
			case "De Libra Pesos":
				 resultado = libra * valor;
				 JOptionPane.showMessageDialog(null, "Tiene " + resultado + " Pesos" ); 
				 break;
			}
						
}
	

public boolean validarInput (String input) {	
	try {
		if(input.isEmpty()) {
				Double.parseDouble(input);
		}
			
	} catch (Exception exp) {
		return false;
	}
		
	return true;
}
	
public void convertirTemperatura(double temperatura, String tipoTemperatura) {
	double resultado = 0;
	switch(tipoTemperatura){
	case "De Celsius(C) a Kelvin(K)":
		resultado = temperatura + 273.15;
		JOptionPane.showMessageDialog(null, "Tiene " + resultado + " K" ); 
		break;
	case "De Celsius(C) a Fahrenheit (F)": 
		resultado = (temperatura * 9/5) + 32 ;
		JOptionPane.showMessageDialog(null, "Tiene " + resultado + " F" ); 
		break;
	case "De Celsius(C) a Reaumur (R)":
		 resultado = (4 *temperatura) / 5;
		 JOptionPane.showMessageDialog(null, "Tiene " + resultado + "R" ); 
		break;
		
		}
	}
}
