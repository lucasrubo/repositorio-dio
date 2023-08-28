// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        
        //Exemplo 1
        // if (nota >= 7)
        //     System.out.println("Aprovado");
        // else if (nota >= 5 && nota < 7)
        //     System.out.println("Recuperação");
        // else
        //     System.out.println("Reprovado");
            
        // ternária 1        
		// String resultado = nota >=7 ? "Aprovado" : "Reprovado";

        // ternária 2        
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";


		System.out.println(resultado);
    }
}