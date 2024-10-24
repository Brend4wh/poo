package POO; // Nome do pacote(POO) é o mesmo nome da pasta

// Classe principal
public class Main {
    // Método principal onde o programa começa a ser executado
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        // Instanciando um objeto da classe Aluno
        Aluno aluno = null;
        try {
             aluno = new Aluno("Fulano de Tal", 20, "aaaaaaaaa@gmail.com", "123456", "aluno", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Chamando o método showMenu da classe Aluno
        aluno.showMenu("aluno");



        // Instanciando um objeto da classe Professor
        Professor professor = null;
        try {
            professor = new Professor("Ciclano de Tal", 30, "professor@email.com", "123456", "professor", "654321");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        // Chamando o método showMenu da classe Professor
        professor.showMenu("professor");

        // Não é possível instanciar um objeto de uma classe abstrata
        // User user = new User();
    }
}
