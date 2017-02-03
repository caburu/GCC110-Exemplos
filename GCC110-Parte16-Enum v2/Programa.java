import java.util.*;

public class Programa
{
	public static void main(String[] args)
	{		
		Direcao.NORTE.getCodigo();
	
	
		for(Direcao d : Direcao.values())
		{
			System.out.println(d.getTexto());
		}
		
		/*
		
		Scanner entrada = new Scanner(System.in);
		
		boolean deuCerto = false;
		do
		{
			try
			{
				System.out.print("Digite o numerador: ");
				int numerador = entrada.nextInt();
				System.out.print("Digite o denominador: ");
				int denominador = entrada.nextInt();
				float resultado = dividir(numerador, denominador);
				System.out.print(resultado);
				deuCerto = true;
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("Presta atencao!!!!");
			}
		} while (!deuCerto);
		*/
	}
	
	private static float dividir(int num, int den)
	{
		if (den == 0)
		{
			throw new RuntimeException("Denominador nao pode ser zero!!!");		
		}
		else
		{
			return (float)num/(float)den;
		}
	}
	
	
}