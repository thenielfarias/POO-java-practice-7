package projetofaculdade;
public class Main {
    public static void main(String args[]) {
    
    Visitante v1 = new Visitante();
    v1.setNome("Pedro");
    v1.setIdade(22);
    v1.setSexo("M");
    System.out.println(v1.toString());
    
    Aluno a1 = new Aluno();
    a1.setNome("Joao");
    a1.setMatricula(1234);
    a1.setCurso("Ciencia da Computacao");
    a1.setIdade(22);
    a1.setSexo("M");
    a1.pagarMensalidade();
    System.out.println(a1.toString());
    
    Bolsista b1 = new Bolsista();
    b1.setNome("Eduarda");
    b1.setBolsa(12.5f);
    b1.setSexo("F");
    b1.pagarMensalidade();
    System.out.println(b1.toString());
    
    }        
}
