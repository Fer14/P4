package es.ucm.fdi.controller;

public class SimuladorTrafico {
	private int limite;
	private MapaCarreteras mapa;
	
	public SimuladorTrafico(int limite, MapaCarreteras mapa)
	{

		this.limite = limite;
		this.mapa = mapa;
	}
	
	public void run()
	{
		String report = "";
		for (int tActual = 0; tActual < limite; tActual++)
		{
			for (int i = 0; i < mapa.numVehiculos(); i++)
			{
				Vehicle vehiculo = mapa.getVehiculo(i);
				vehiculo.avanza(100000);
				report += vehiculo.generaInforme(tActual) + '\n';
			}
		}
		generaInforme(report);
	}
	
	private void generaInforme(String report)
	{
		System.out.println(report);
		//Escribirlo en el archivo
	}
}
