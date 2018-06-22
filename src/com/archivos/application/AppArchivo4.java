package com.archivos.application;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import com.archivos.misclases.Vectores;
import java.util.Random;

public class AppArchivo4 {

	public static void main(String[] args) 
	{
		//Constantes
		final int NUMERO_REPETICIONES=100;
		
		//INICIALIZACION DE VARIABLES
		File archivo=null;
		FileWriter writer=null;
		PrintWriter buffer=null;
		String sTitulo="RANDOM",sName="HUgo",sTituloPag="Numeros Pseudo-Aleatorios";
		Random rnd=new Random(System.nanoTime());
		Vectores vectors=new Vectores();
		
		//Vectores
		int[] vecEnteros1=new int[NUMERO_REPETICIONES];
		int[] vecEnteros2=new int[NUMERO_REPETICIONES];
		
		vecEnteros1=vectors.llenadoaleatorio(vecEnteros1);
		
		for(int i=0; i<vecEnteros2.length;i++)
		{
			vecEnteros2[i]=rnd.nextInt(99)+1;
		}
		
		
		try
		{
			archivo=new File("d://b//test02.html");
			writer=new FileWriter(archivo);
			buffer=new PrintWriter(writer);
			
			//ESCRITUR EN EL ARCHIVO HTML PARA LA SALIDA DE LA PAGINA WEB
			buffer.println("<HTML>");
			buffer.println("<HEAD>");
			buffer.println("\t<TITLE>"+sTitulo+"</TITLE>");
			buffer.println("</HEAD>");
			buffer.println("<BODY>");
			buffer.println("<H1>"+sTituloPag+"</H1>");
			buffer.println("\t"+sName+"<BR/>\n");
			buffer.println("\t<TABLE>");
			buffer.println("\t\t<THEAD>");
			buffer.println("\t\t\t<TR><TH>NOMBRE</TH><TH>INDICE</TH><TH>VALOR</TH></TR>");
			buffer.println("\t\t</THEAD>");
			buffer.println("\t\t<TBODY>");
			for(int i=0;i<vecEnteros2.length;i++)
			{
				buffer.println("\t\t\t<TR><Td>VECTOR</TD><TD>"+i+"</TD><TD>"+vecEnteros2[i]+"</TD>");
			}
			buffer.println("\t\t</TBODY>");
			buffer.println("\t</TABLE>");
			buffer.println("</BODY>");
			buffer.println("</HTML>");
		}
		catch(Exception e)
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
