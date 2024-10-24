package POO;

public class Aluno extends User {
    private String ra;

    // Nosso aluno precisa de um RA
    public Aluno(String fullName, int age, String email, String password, String role, String ra) throws IllegalArgumentException, Exception {
        super(fullName, age, email, password, "aluno");
        this.ra = ra;
    }

    @Override
    public void showMenu(String role) {
        System.out.println("Menu do " + role);
        System.out.println("----------------");
        System.out.println("Nome: " + getFullName());
        System.out.println("RA: " + ra);
        System.out.println("===================================");
        System.out.println("Seu email: " + getEmail());
    }

    @Override
    public void alugarSala(String role, String nome, String data, String horario) {
        
    }

    @Override
    public void editarNota(String role, String nome, double nota) {
        
    }

    @Override
    public void exibirBoletim(String role, String nome) {
        
    }
}
