package es.ucm.fdi.controller;

/**
 * This class represents a vehicle and its actions.
 * @author
 */
public class Vehicle {
	private String id;
	private int velMaxima; //Pudiera ser int
	private int velActual;
	private int kilometrage;
	private Road carretera;
	private int localizacion;
	boolean haLlegado;
	//coleccion de cruces;
	
	private int tiempoAveria;
	
	public Vehicle(int velMaxima, String id/* itinerario*/)
	{
		haLlegado = false;
		this.id = id;
		//carretera = primera carretera
		kilometrage = 0;
		tiempoAveria = 0;
		this.velMaxima = velMaxima;
		localizacion = 0;
	}
	
	/**
	 * Performs a step
	 */
	public void avanza(int velocidad){
		if (tiempoAveria > 0)
		{
			velActual = 0;
			tiempoAveria--;
		}
		else
		{
			velActual = velocidad; //?
			localizacion += velActual;
			kilometrage += velActual;
			/*if (localizacion >= carretera.getLongitud())
			{
				kilometrage -= localizacion - carretera.getLongitud(); //Lo mismo es feo 
				localizacion = carretera.getLongitud());
				//Añadir a la cola de cruces
			}*/
		}	
	}
	/**
	 * Advances into the next road.
	 */
	//De momento privada
	private void moverASiguienteCarretera()
	{
		//sale de la carretera actual
		//entra en la siguiente carretera.
		localizacion = 0;
		//si es la ultima, haLlegado = true
	}
	
	private void setTiempoAveria(int n)
	{
		tiempoAveria += n;
	}
	
	private void setVelocidadActual(int velocidad)
	{
		if (velocidad > velMaxima)
			velActual = velMaxima;
		else velActual = velocidad;
	}
	
	public String generaInforme(int time)
	{
		String ret = "[vehicle_report]\n"; //cuidado con \n
		ret += "id = " + id + '\n';
		ret += "time = " + time + '\n';
		ret += "speed = " + velActual + '\n';
		ret += "kilometrage = " + kilometrage + '\n';
		ret += "faulty = " + tiempoAveria + '\n';
		ret += "location = (" + carretera.getId() + ',' + localizacion + ")\n";
		return ret;
	}
	
	public int getLocalizacion()
	{
		return localizacion;
	}
	
	public String getId()
	{
		return id;
	}
	
}
