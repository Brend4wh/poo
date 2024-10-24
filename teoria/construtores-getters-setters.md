# Entendendo e Aplicando Getters, Setters e Construtor em Java

## **Modificadores de acesso**

- **private**: métodos ou atributos com esse modificador de acesso podem ser acessados apenas pela classe que pertencem.
- **public**: métodos ou atributos com esse modificador de acesso podem ser acessados por qualquer classe.

## **Construtor**

Um construtor é um método especial de uma classe em Java que é executado automaticamente quando um objeto dessa classe é criado. Ele é usado para inicializar os atributos de uma instância da classe, garantindo que o objeto comece em um estado válido.

### **Características do construtor:**

- O **nome do construtor deve ser o mesmo da classe**.
- Ele **não tem um tipo de retorno** (nem mesmo void).
- **Pode receber parâmetros** para inicializar os atributos da classe.
- Se nenhum construtor for definido, o Java cria um construtor padrão (sem parâmetros).

```java
private String nome;

// Construtor
public Pessoa(String nome) throws IllegalArgumentException {
    setNome(nome); // Validação feita pelo setter
}
```

## **Getters**

- Ao criarmos atributos **privados**, temos os **getters**, métodos que criam o acesso para outras classes.
- Getters normalmente tem uma estrutura simples de retorno como:

```java
public String getNome() {
    return nome;
}
```

## **Setters**

- Ao criarmos atributos privados, também temos os setters, métodos responsáveis por permitir que outras classes modifiquem esses atributos de forma controlada.
- Setters normalmente têm a estrutura de atribuição de valores com a possibilidade de validação dos dados, e sua assinatura inclui o tipo de dado que será passado como parâmetro.

```java
public void setNome(String nome) throws IllegalArgumentException {
    if (nome == null || nome.trim().isEmpty()) {
        throw new IllegalArgumentException("Nome não pode ser vazio ou nulo.");
    }
    this.nome = nome;
}
```

- O método `setNome()` ele recebe uma string que não deve ser nula e nem uma string vazia (" ")
- Se a validação retornar true, lance uma exceção
- Se a validação retornar false, coloque o valor no atributo nome da classe

Abaixo um exemplo com uma classe que implementa getters, setters e construtor

```java
public class Usuario {
    private String nome;
    private String email;
    private String cpf;

    // Construtor que utiliza os setters para validar as informações do aluno
    public Usuario(String nome, String email, String cpf) throws IllegalArgumentException {
        setNome(nome);
        setEmail(email);
        setCpf(cpf);
    }

    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws IllegalArgumentException {
        if (!cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }
        this.cpf = cpf;
    }
}
```

## Exemplo visual com OUTRA CLASSE sobre modificadores de acesso
![image](https://github.com/user-attachments/assets/b284b2e2-df1f-4e66-a27f-5f617cb9978e)

