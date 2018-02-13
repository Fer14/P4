package es.ucm.fdi.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Controller {
	
	private MapaCarreteras mapa;
	private SimuladorTrafico simulador;
	
	public Controller(int limite, File input, File output)
	{
		try (BufferedReader reader = 
                new BufferedReader(new FileReader(input)))
        {
			//Lee eventos
        }
		
		catch(Exception e){System.out.println("RIP");}
		try (BufferedWriter writer = 
                new BufferedWriter(new FileWriter(input)))
        {
			//Escribe
        } //Seguramente vaya en otro lado
		catch(Exception e){System.out.println("RIP");}
	}
}
