public class Comentarios {
    
    public static void main (String [] args){    
    
    }
    /**
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade somar ou  multiplicar
    * dois números
    */
    public int somaMultiplica (int numeroUm, int numeroDois, String metodo){
        int result = 0; 
        if (metodo == "M"){ // M= multiplicação
             result = numeroUm * numeroDois;
        }else{
            // se não soma mesmo
            result = numeroUm + numeroDois;
        }
        return result;
    }
}
