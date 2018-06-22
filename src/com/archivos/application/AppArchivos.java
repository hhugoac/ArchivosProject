package com.archivos.application;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AppArchivos {

	public static void main(String[] args) {
		File archivo = null;
		FileReader reader=null;
		BufferedReader buffer=null;
		try
		{
			//Abrimos el archivo
			archivo=new File("d:/b/It.txt");
			
			//Asignamos un reader al objeto de tipo archivo
			reader=new FileReader(archivo);
			
			// Creamos un buffer para hacer una lectura comoda del archivo. Para dispones del método readLine().
			buffer=new BufferedReader(reader);
			
			//Leemos el archivo
			System.out.println("Contenido del archivo");
			System.out.println("----------------------------------");
			String linea="";
			while((linea=buffer.readLine())!=null)
			{
				System.out.println(linea);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(reader!=null)
				{
					reader.close();
				}
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
	}

}
