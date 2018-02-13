package es.ucm.fdi.controller;

public class Road {
	private String id;
	private int maxVel;
	private int longitud;
	//coleccion de vehiculos
	
	public Road(int maxVel,int longitud,String id){
		this.id=id;
		this.maxVel=maxVel;
		this.longitud=longitud;
	}
	
	public void entraVehiculo(){
		
	}
	
	public void saleVehiculo(){
		
	}
	
	public void avanza(){
		
		int velocidadBase = (int) Math.min(maxVel,(maxVel/(int)(Math.max(coche.longitud, 1))+ 1));
		for(int i=0;i<coche.longitud;i++){
			//mirar si hay obstaculo
			//si no hay averiados delante
			coche.avanza(velocidadBase);
			//else 
			coche.avanza(velocidadBase/2);
		}
	}
	public String generaInforme(int time){
		String ret = "[road_report]\n";
		ret += "id = " + id + '\n';
		ret += "time = " + time + '\n';
		ret += "state = ";
		for(int i=0;i<coche.longitud;i++){
			if (i != 0) ret += ',';
			ret +='(' + coche.getId() + ',' + coche.getLocalizacion()+ ')';
		}
	}
		
	
	
}
