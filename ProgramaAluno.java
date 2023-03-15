import java.time.temporal.ValueRange;

public class ProgramaAluno {
    public static void main(String[] args) {
        System.out.println("ola");

        DDadFacul universitario = new DDadFacul();

        universitario.dadfacul.nome = "mateus";
        universitario.dadfacul.corpele = "pardo";
        universitario.dadfacul.idade = 20;

        universitario.cpf = "93846529346";
        universitario.AnoNascimento = 2003;
        universitario.cidade = "vera";
        universitario.estado = "mt";

        System.out.println(universitario.dadfacul.nome);
        System.out.println(universitario.dadfacul.corpele);
        System.out.println(universitario.dadfacul.idade);

        System.out.println(universitario.AnoNascimento);
        System.out.println(universitario.cpf);
        System.out.println(universitario.cidade);
        System.out.println(universitario.estado);
        
    }

}
