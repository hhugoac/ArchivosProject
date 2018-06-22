package com.archivos.application;

import java.io.*;

public class AppArchivos2 {

	public static void main(String[] args) {
			File archivo=null;
			FileWriter writer=null; 
			PrintWriter buffer=null;
			
			try
			{
				//Abrir el archivo en que se va a escribir
				archivo=new File("d:/b/testo.txt");
				//El segundo parametro es el parametro append, si lo colocamos a tru añadimos al archivo. Si lo colocamaos a false lo sobre escribimos
				writer=new FileWriter(archivo,true);
				buffer=new PrintWriter(writer);
				
				System.out.println("Escribo en el archivo");
				buffer.println("Hola");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(writer!=null)
					{
						buffer.close();
					}
				}
				
			}
	}

}
