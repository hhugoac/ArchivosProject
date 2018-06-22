package com.archivos.application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppArchivos3 {

	public static void main(String[] args) {
		//Constantes
		final int NUMERO_REPETICIONES=20;
		
		//Declaramos objetos e inicializamos variables
		File archivo=null;
		FileWriter writer=null;
		PrintWriter buffer=null;
		String sTitulo="";
		String sTituloPag="";
		String sName="";
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el titulo de la pestaña de tu pagina: ");
		sTitulo=entrada.nextLine();
		System.out.println("Introduce el titulo de tu pagina web");
		sTituloPag=entrada.nextLine();
		System.out.println("Introduce tu nombre");
		sName=entrada.nextLine();
		
		try
		{
			archivo = new File("d:\\b\\testo.html");
			writer = new FileWriter(archivo);
			buffer=new PrintWriter(writer);
			
			buffer.println("<HTML>");
			buffer.println("<HEAD>");
			buffer.println("\t<TITLE>"+sTitulo+"</TITLE>");
			buffer.println("</HEAD>");
			buffer.println("<BODY>");
			buffer.println("<H1>"+sTituloPag+"</H1>");
			for(int i=0;i<=NUMERO_REPETICIONES;i++)
			{
				buffer.println("\t"+sName+"<BR/>\n");
			}
			buffer.println("</BODY>");
			buffer.println("</HTML>");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if(writer!=null)
			{
				try 
				{
					writer.close();
				}
				catch(IOException e2)
				{
					e2.printStackTrace();
				}
			}
		}

	}

}
