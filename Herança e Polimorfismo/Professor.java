package POO;

public class Professor extends User {
    private String rp;

    // Nosso professor precisa de um RP
    public Professor(String fullName, int age, String email, String password, String role, String rp) throws IllegalArgumentException, Exception {
        super(fullName, age, email, password, "professor");
        this.rp = rp;
    }

    // Sobrecarga do método showMenu
    // Temos o showMenu() e o showMenu(String role)
    // O primeiro não recebe parâmetros e o segundo recebe um parâmetro do tipo String
    public void showMenu() {
        // Desenhos bonitos no terminal (sem dados no print)
        System.out.println("Menu de desenvolvedor");
        System.out.println("+ ---------------- +");
        System.out.println("+ Nome: ");
        System.out.println("+ RP: ");
        System.out.println("+ =================================== +");
        System.out.println("+ Seu email: ");
    }

    @Override
    public void showMenu(String role) {
        System.out.println("Menu do " + role + ":");
        System.out.println("+ ---------------- +");
        System.out.println("+ Nome: " + getFullName());
        System.out.println("+ RA: " + rp);
        System.out.println("+ =================================== +");
        System.out.println("+ Seu email: " + getEmail());
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
