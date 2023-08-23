package rubo.primeirasemana;
public class MinhaClasse {
    
    public static void main (String [] args){
        // final String BR = "Brasil"; //final impede a alteração da variavel
        // boolean verdadeira = true;

        String primeiroNome ="Lucas";        
        String segundoNome ="Rubo";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println("Ola "+nomeCompleto+", seja bem-vindo");
    }
    public static String nomeCompleto (String primeiroNome,String segundoNome){
        return primeiroNome.concat(" ".concat(segundoNome));
    }

}
