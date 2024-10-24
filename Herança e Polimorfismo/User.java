package POO;

public abstract class User {
    private String fullName;
    private int age;
    private String email;
    private String password;
    private String role;

    /**
     * Construtor da classe User
     * @param fullName mínimo 3 caracteres e máximo 100 caracteres
     * @param age mínimo 15 anos
     * @param email mínimo 5 caracteres e máximo 100 caracteres
     * @param password mínimo 6 caracteres e máximo 20 caracteres
     * @param role pode ser, professor, aluno ou administrador
     */
    public User(String fullName, int age, String email, String password, String role) throws IllegalArgumentException, Exception {
        this.setFullName(fullName);
        this.setAge(age);
        this.setEmail(email);
        this.setPassword(password);
        this.setRole(role);
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 15) {
            throw new IllegalArgumentException("A idade mínima é 15 anos");
        }

        this.age = age;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email.length() < 5 || email.length() > 100) {
            throw new IllegalArgumentException("O email deve ter entre 5 e 100 caracteres");
        }

        this.email = email;
    }

    public void setFullName(String fullName) {
        if (fullName.length() < 3 || fullName.length() > 100) {
            throw new IllegalArgumentException("O nome completo deve ter entre 3 e 100 caracteres");
        }

        this.fullName = fullName;
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if (password.length() < 6 || password.length() > 20) {
            throw new IllegalArgumentException("A senha deve ter entre 6 e 20 caracteres");
        }

        this.password = password;
    }

    public void setRole(String role) throws Exception {
        // Verifica se o role é um dos valores permitidos
        if (role.equals("professor") || role.equals("aluno") || role.equals("administrador")) {
            this.role = role;
            return;
        }

        throw new Exception("Cargo inválido");
    }

    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getFullName() {
        return fullName;
    }
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }
    // Métodos abstratos

    /**
     * Método abstrato que exibe o menu de acordo com o cargo do usuário
     * @param role pode ser, professor, aluno ou administrador
     * @return void realiza um print na tela com o menu com base no cargo do usuário
     */
    public abstract void showMenu(String role);

    public abstract void editarNota(String role, String nome, double nota);

    public abstract void exibirBoletim(String role, String nome);

    public abstract void alugarSala(String role, String nome, String data, String horario);
}
