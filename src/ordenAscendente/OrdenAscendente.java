package ordenAscendente;

import java.util.Scanner;

public class OrdenAscendente
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[6];
		int aux;
		boolean ordenado = false;
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < numeros.length - 1 && !ordenado; i++)
		{
			ordenado = true;			
			for(int j = 0; j < numeros.length - i - 1; j++)
			{
				if(numeros[j] > numeros[j + 1])
				{
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;	
					ordenado = false;			
				}
			}
		}
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
	}
}
