package conversorDeMonedas;
import javax.swing.*;

public class ConversoMonedas {
	public static void main(String[] args) {
	function f = new function();
	
	while(true) {
		String opciones = (JOptionPane.showInputDialog(null, "Selecciones una opcion de conversión","Menu",JOptionPane.INFORMATION_MESSAGE, null, 
				new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},"Conversor de Moneda")).toString();
		
		if(opciones== "Conversor de Moneda") {
			String input= JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir");
			
			if(f.validarInput(input) == true) { 
				double numero = Double.parseDouble(input);
				
				String tipoMoneda = JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir tu dinero","Moneda",JOptionPane.INFORMATION_MESSAGE, null, 
						new Object[] {"De pesos a Dólar", "De pesos a Euro", "De pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libra Pesos"},"De pesos a Dólar").toString();
						f.convertirMoneda(numero, tipoMoneda); 
								   				
		     }else {
					JOptionPane.showMessageDialog(null,"Valor inválido"); 	
				}
					
			}else if(opciones== "Conversor de Temperatura") {
				
				String input= JOptionPane.showInputDialog("Ingrese la temperatura a convertir");
				
				if(f.validarInput(input) == true) { 
					double numero = Double.parseDouble(input);
					
					String tipoTemperatura = JOptionPane.showInputDialog(null, "Elija la temperatura que a la cual quiera convertir","Temperatura",JOptionPane.INFORMATION_MESSAGE, null, 
							new Object[] {"De Celsius(C) a Kelvin(K)", "De Celsius(C) a Fahrenheit (F)", "De Celsius(C) a Reaumur (R)"},"De Celsius(C) a Fahrenheit (F)").toString();
							f.convertirTemperatura(numero, tipoTemperatura); 
									
			     }else {
						JOptionPane.showMessageDialog(null,"Valor inválido"); 	
					}
			}
		

			// (0 – Aceptar o Sí ; 1- No; 2 – Cancelar).
			int rta = JOptionPane.showConfirmDialog(null, "Quiere seguir con el programa?");
			if(rta == 1 || rta == 2) {
			    JOptionPane.showMessageDialog(null, "Desea terminar el programa");
				break;
				
		 	}	
         } 
		}
	 } 


		
		
	
	    

