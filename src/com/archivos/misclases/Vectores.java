package com.archivos.misclases;

import java.util.Random;

public class Vectores {
	//Ejercicio 23
	public int[] llenaUnos(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=1;
		}
		return vector;
	}
	
	//Ejercicio 24
	public int[] llenadoSerie(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=i+1;
		}
		return vector;
	}
	//Ejercicio 25
	public int[] llenadoSeriedos(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=2*(i+1);
		}
		return vector;
	}
	
	//Ejercicio 26 
	public int[] llenadoSerieReves(int[] vector)
	{
		for(int i=vector.length-1 ;i>=0;i--)
		{
			vector[vector.length-1-i]=i;
		}
		return vector;
	}
	
	//Ejercicio 27
	public int[] llenadoaleatorio(int[] vector)
	{
		Random rnd=new Random(System.nanoTime());
		//int BOUND=100;
		
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=rnd.nextInt(100);  //Agrega numero aleatorios del 1-100 
			//vector[i]=(int)(Math.random()*BOUND)+1; 
		}
		return vector;
	}
	
	//Ejercicio 28 
	
	public int[] llenadoParesImpar(int[] vector)
	{
		int[] paresImpares=new int[2];
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				paresImpares[0]+=1;
			}
			else
			{
				paresImpares[1]+=1;
			}
		}
		return paresImpares;
	}
	//Contados de elementos pares en un vedctor
	public int contadorPares(int[] vector)
	{
		int pares=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				pares+=1;
			}
		}
		return pares;
	}
	//Contador de elementos impraes en un vector
	public int contadorImpares(int[] vector)
	{
		int impares=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2!=0)
			{
				impares+=1;
			}
		}
		return impares;
	}
	
	//Metodo que reotrna un vector con elementos pares de un vector
	
		public int[] vecPares(int[] vector,int nPares)
		{		
			int[] Pares=new int [nPares];
			
			
			for(int i=0;i<vector.length;i++)
			{
				if(vector[i]%2==0)
				{
					Pares[i]=vector[i];
				}
			}
			return Pares; 
		}
	
	//Metodo que reotrna un vector con elementos impares de un vector
	
	public int[] vecImpares(int[] vector,int nImpares)
	{		
		int[] impares=new int [nImpares];
		
		
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				impares[i]=vector[i];
			}
		}
		return impares; 
	}
	//Metodo que retorna un vector booleano donde dice si son primos los elementos de un vector de entrada
	public boolean[] isPrimovec(int[] vector)
	{	
		boolean[] boolPrimos=new boolean[vector.length];
		
		//Inicializacion del vector
		for(int i=0;i<vector.length;i++)
		{
			boolPrimos[i]=true;
		}
		
		for(int i=0;i<vector.length;i++)
		{
			for(int j=2;j<vector[i];j++)
			{
				if(vector[i]%j==0)
				{
					boolPrimos[i]=false;
				}
			}
		}
		
		return boolPrimos;
	}
	
	//Metodo que retorna un vector booleano con las posiciones de los numeros primos
	public int iNumPrimos(boolean[] vector)
	{
		int iNumprimos=0;
		for(int i=0; i<vector.length;i++)
		{
			if(vector[i]==true)
			{
				iNumprimos+=1;
			}
		}
		return iNumprimos;
	}
	
	//Metodo que retorna un vector de numeros primos de otro vector 
	public int[] iPrimo(boolean[] vectorbol,int[] vector,int iNumprimos)
	{
		int[] iPrimos=new int [iNumprimos];
		for(int i=0;i<vector.length;i++)
		{
			if(vectorbol[i]==true)
			{
				iPrimos[i]=vector[i];
			}
				
		}
		return iPrimos;
	}
	
	//Metodo que retorna la suma de los elementos de un vector
	public int iSumaVec(int[] vector)
	{
		int iSuma=0;
		for(int i=0;i<vector.length;i++)
		{
			iSuma+=vector[i];
		}
		return iSuma;
	}
	
	//Metodo que retorna un vector con las posiciones inevertidas de sus elementos 
	public int[] llenadoInversion(int[] vector)
	{
		int[] vecInvertido=new int[vector.length];
		int vecAux;
		
		for(int i=0;i<vector.length;i++)
		{
			vecInvertido[i]=vector[vector.length-i-1];
		}
		return vecInvertido;
	}
	
	//Metodo que retorna un vector ordenado de manera ascendente
	public int[] ordenAscendente(int[] vector)
	{
		int iaux;
		
		for(int i=2;i<=vector.length;i++)
		{
			for(int j=0;j<=vector.length-i;j++)
			{
				if(vector[j]>vector[j+1])
				{
					iaux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=iaux;
				}
			}
		}
		return vector;
	}
	
	//Metodo que retorna un vector ordenado de manera descendente
	public int[] ordenDescendente(int[] vector)
	{
		int iaux;
		
		for(int i=2;i<vector.length;i++)
		{
			for(int j=0;j<=vector.length-i;j++)
			{
				if(vector[j]<vector[j+1])
				{
					iaux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=iaux;
				}
			}
		}
		return vector;
	}

	public int buscarNumero(int[] vector,int Num)
	{
		boolean isTrue=true;
		int i=0;
		int iNum=-1;
		
		while(isTrue||i<vector.length)
		{
			if(vector[i]==Num)
			{
				isTrue=false;
				iNum=i;
			}
			i++;
		}
		return iNum;
	}
	
}
