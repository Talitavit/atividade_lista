package org.listaalgoritmos.template;



public class RespostaListaExercicio {
	

	/*
	 * Utilize apenas o método main 
	 * para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */

	public static void main(String[] args) {
		
	}
	
	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) 
	{
		 float resultado = peso / (altura *altura);

	        System.out.println("O imc é:" + resultado);
	        
		return resultado;
		
	}
	
	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) 
	{	
		float areaTrapezio = ((baseMaior + baseMenor) * altura )/2;
			
			System.out.println("área do trapezio é:" + areaTrapezio);
		
		return areaTrapezio;
	}
	
	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) 
	{
		int maiorValor;
		
		if (a > b) {
	        maiorValor = a; 
	    } else {
	        maiorValor = b; 
	    }
		
		return maiorValor;
	}
	
	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) 
	{
		return numero % 2 == 0;		
	}
	
	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. 
	 * O retorno deve ser o resultado do cálculo da média.
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {
	

	    float soma = 0; 
	    
	    for (float nota : notas) {
	        soma += nota; 
	    }
	   
	    float media = soma / notas.length; 
	    
	    return media;
		
	}
	 
		
				
	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * @param array
	 */
	public static void imprimirArrayInverso(int[] array)
	{
		
		for (int i = array.length - 1; i >= 0; i--) {
			
	        if (i != array.length - 1) {
	            System.out.print(","); 
	        }
	        System.out.print(array[i]); 
	    }
	}
	
	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPrimos(int[] array) 
	{
		 for (int num : array) {
		        
		        if (num > 1) {
		            boolean primo = true;
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    primo = false;
		                    break;
		                }
		            }
		           
		            if (primo) {
		                System.out.print(num + " ");
		            }
		        }
		    }
		
	}
	
	
	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) 
	{
		for (int i = 0; i < array.length; i++) {
		       
	        if (array[i] % 2 != 0) {
	            System.out.print(array[i] + " "); 
	        }
	    }
	}
	
	
	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) 
	{
		for (int i = 0; i < array.length; i++) {
	       
	        if (array[i] % 2 == 0) {
	            System.out.print(array[i] + " "); 
	        }
	    }
	}
	
	
	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) 
	{
		 if (array.length == 0) {
		        
		    }

		    int maior = array[0]; 
		    int menor = array[0]; 

		   
		    for (int num : array) {
		        if (num > maior) {
		            maior = num; 
		        }
		        if (num < menor) {
		            menor = num; 
		        }
		    }

		    System.out.print(maior + " " + menor + " ");
	}
	
	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros. 
	 * Como resultado, o valor da média deve ser retornado no método.
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) 
	{
		 if (array.length == 0) {

		   }

		    int soma = 0; 
		    
		    for (int num : array) {
		        soma += num;
		    }

		    float media = (float) soma / array.length;
		    
		    System.out.println("A média é:" + media);
		
		return media;
	}
	
}



