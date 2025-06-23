# Somador de Números com Condição de Parada

Este é um programa Java que solicita ao usuário que digite valores inteiros repetidamente e calcula a soma desses valores. A entrada de números continua até que o usuário digite o valor 0, que serve como condição de parada para o loop. O valor 0 não é incluído na soma final. Ele utiliza a biblioteca Swing para exibir janelas de diálogo para interação com o usuário.

## Descrição

O programa inicia pedindo ao usuário para digitar um valor inteiro. Em seguida, ele entra em um loop. Dentro do loop, cada número inteiro digitado pelo usuário é adicionado a uma variável de soma. O loop continua até que o usuário digite o número 0. Quando o usuário insere 0, o loop é encerrado e o programa exibe uma janela de diálogo mostrando a soma de todos os números digitados anteriormente (excluindo o 0 final).

## Como Executar

Para executar este código, você precisará ter o Java Development Kit (JDK) instalado em seu sistema. Siga os passos abaixo:

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. Certifique-se de que a estrutura de pastas seja `principal/Main.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até a pasta onde você salvou o arquivo `principal` e execute o seguinte comando para compilar o código:

    ```bash
    javac principal/Main.java
    ```

    Isso criará um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o seguinte comando:

    ```bash
    java principal.Main
    ```

    Uma janela de diálogo aparecerá solicitando a entrada do primeiro valor.

## Como Usar

1.  Ao executar o programa, uma janela de diálogo será exibida com a mensagem "Digite o primeiro valor:".
2.  Digite um número inteiro qualquer e clique em "OK".
3.  Uma nova janela de diálogo aparecerá com a mesma mensagem. Digite outro número inteiro e clique em "OK". Continue fazendo isso para todos os números que você deseja somar.
4.  Quando você terminar de inserir os números que deseja somar, digite o número 0 e clique em "OK".
5.  Uma última janela de diálogo será exibida, mostrando a soma de todos os números que você digitou antes de inserir o 0.
6.  O programa será encerrado após exibir a soma.

## Explicação do Código

* `package principal;`: Declara o pacote ao qual a classe `Main` pertence.
* `import javax.swing.*;`: Importa a biblioteca Swing, que fornece classes para criar interfaces gráficas, como janelas de diálogo.
* `public class Main { ... }`: Define a classe principal do programa.
* `public static void main(String[] args) { ... }`: O método principal onde a execução do programa começa.
* `int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));`: Exibe uma janela de diálogo para obter a primeira entrada do usuário e converte a entrada para um número inteiro, armazenando-o na variável `x`.
* `int soma = 0;`: Declara e inicializa uma variável chamada `soma` com o valor 0. Esta variável será usada para acumular a soma dos números digitados.
* `while (x != 0) { ... }`: Inicia um loop `while` que continuará a executar o código dentro de suas chaves enquanto a condição `x != 0` for verdadeira (ou seja, enquanto o valor de `x` for diferente de 0).
    * `soma += x;`: Dentro do loop, o valor atual de `x` é adicionado ao valor atual de `soma`. Isso é equivalente a `soma = soma + x;`.
    * `x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));`: Após adicionar o valor atual de `x` à soma, esta linha exibe novamente a janela de diálogo, permitindo que o usuário digite um novo valor. Esse novo valor sobrescreve o valor anterior da variável `x`. O loop continuará até que o usuário digite 0.
* `JOptionPane.showMessageDialog(null, "A soma das números até sair do loop é: " + soma);`: Após o loop `while` terminar (quando o usuário digita 0), esta linha exibe uma janela de diálogo mostrando a soma total dos números digitados.
