# Herança e Polimorfismo

Em Java, a herança é uma forma de reutilização de código, onde uma classe pode herdar atributos e métodos de outra classe. A herança é representada pela palavra reservada `extends`.

Além dissos, a herança permite a criação de classes mais genéricas, que podem ser especializadas por meio de subclasses. A classe mais genérica é chamada de superclasse, enquanto a classe mais específica é chamada de subclasse.

```java
public class Superclasse {
    // Atributos e métodos
}

public class Subclasse extends Superclasse {
    // Atributos e métodos
}
```

O polimorfismo é a capacidade de um objeto ser referenciado de várias formas. Em Java, o polimorfismo é implementado por meio de classes e interfaces. O polimorfismo permite que um objeto de uma subclasse seja tratado como um objeto de uma superclasse.

### Exemplo de Herança e Polimorfismo

Nessa pasta, iremos ver um exemplo utilizando classes/classes abstratas:
- Aluno
- Professor
- Admin
- User

Para criarmos um sistema escolar, onde temos alunos, professores e administradores. Todos eles são usuários do sistema, então podemos criar uma classe `User` que contém os atributos e métodos comuns a todos os usuários.
