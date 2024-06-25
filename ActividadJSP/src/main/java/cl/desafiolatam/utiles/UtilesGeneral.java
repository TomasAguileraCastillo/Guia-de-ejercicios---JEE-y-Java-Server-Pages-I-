package cl.desafiolatam.utiles;

public class UtilesGeneral {
	
	
	/**
	 * Método que permite obtener el nombre de un mes a partir de su
	número
	 *
	 * @param int numMes, número del mes
	 * @return String Nombre Mes
	 * @author: Autor <autor@desafiolata.com>
	 * @version: 16/08/2022
	 */

	
	public String getNombreMes(int numMes) {
		 String[] nombresMeses = { "Enero", "Febrero", "Marzo", "Abril",
		"Mayo", "Junio", "Julio", "Agosto", "Septiembre",
		 "Octubre", "Noviembre", "Diciembre" };
		// Retorna nombre de Mes
		 return nombresMeses[numMes];
		 }
	
	
	
	/**
	 * Método que permite obtener las efemérides de un mes a partir de
	su numero
	 *
	 * @param int numMes, número del mes
	 * @return String Efemérides Mes
	 * @author: Autor <autor@desafiolata.com>
	 * @version: 16/08/2022
	 */
	
	public String getEfemeridesMes(int numMes) {
		 String[] efemeridesMes = { "Efeméride 1 Enero, " +	"Efeméride 2 Enero, " +"Efemeride 3 Enero",
				 					"Efeméride 1 Febrero, Efeméride 2 Febrero", 
				 					"Efeméride 1 Marzo, Efeméride 2 Marzo",
				 					"Abril - Sin Efemerides", 
				 					"Efemeride 1 Mayo",
				 					"Efemeride 1 Junio, Efemeride 2 Julio",
				 					"Efeméride 1 Julio, Efeméride 2 Julio", 
				 					"Agosto - Sin Efemerides",
				 					"Efeméride 1 Septiembre, Efeméride 2, Efeméride 3",
				 					"Octubre - Sin Efemerides",
				 					"Efemeride 1 Noviembre, Efemeride 2 Noviembre",
				 					"Efemeride 1 Diciembre" };
		 
		 // Retorna nombre de Mes
		 return efemeridesMes[numMes];
		 
		 }


	public String diasMes(int numMes) {
		
		String[] diasMes = {
							"31",
							"29",
							"31",
							"30",
							"31",
							"30",
							"31",
							"31",
							"30",
							"31",
							"30",
							"31"};
		
		return diasMes[numMes];
		
	}
	
	public String feriadosMes(int numMes) {
		
		 String [] cantidadFeriados = {	"1",
				 						"2",
				 						"0",
				 						"0",
				 						"2",
				 						"3",
				 						"1",
				 						"1",
				 						"3",
				 						"3",
				 						"2",
									  	"2"};
		
		 return cantidadFeriados[numMes];
			
	}
		 
		 
		 
		 
		 
		 

}
