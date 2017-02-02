public class Programa
{
	public static void main(String[] args)
	{
		Controle controle = null;//= new Controle();
		
		Circulo c = new Circulo();
		Triangulo t = new Triangulo();
		
		int posCirculo = controle.inserirForma(c);
		int posTriangulo = controle.inserirForma(t);
		
		controle.exibirFormas();
		
		controle.mudarDimensao(posCirculo, 
			new DimensaoSimples(50));
			
		controle.exibirFormas();
	}
}