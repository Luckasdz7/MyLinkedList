# Projeto: MyLinkedList - Implementação de Lista Dinâmica Encadeada

Este projeto consiste na implementação completa de uma lista ligada (Linked List) em Java, utilizando a interface genérica `MyList<T>`. O foco principal é o gerenciamento eficiente de referências (ponteiros) de memória e a análise da complexidade algorítmica.

## 🚀 Estrutura do Projeto

- **`MyList<T>`**: Interface que define o contrato da lista.
- **`MyLinkedList<T>`**: Classe concreta com a lógica de manipulação de nós.
- **`Node<T>`**: Classe interna privada que representa cada elemento da lista e sua referência para o próximo nó.
- **`MyLinkedListTests`**: Classe de testes unitários para validação de cenários críticos.

## 🛠️ Métodos Implementados

1.  **`add(T data)`**: Insere um novo elemento ao final da lista.
2.  **`remove(T data)`**: Remove a primeira ocorrência do elemento, ajustando os ponteiros.
3.  **`search(T data)`**: Retorna o índice do elemento ou -1 caso não encontrado.
4.  **`isEmpty()`**: Verifica se a lista possui elementos.
5.  **`size()`**: Retorna a quantidade total de nós.
6.  **`clear()`**: Reinicializa a lista para o estado vazio.

## 📊 Análise de Complexidade Assintótica

Abaixo, a análise de complexidade para as operações principais utilizando a notação **Big O**:

| Operação | Complexidade | Descrição |
| :--- | :--- | :--- |
| **Inserção (Fim)** | $O(n)$ | É necessário percorrer a lista do `head` até o último nó para realizar o encadeamento. |
| **Remoção** | $O(n)$ | No pior caso, o elemento está no fim ou não existe, exigindo percurso completo para ajuste de ponteiros. |
| **Busca (Índice)** | $O(n)$ | A lista encadeada não permite acesso direto; a busca é linear (nó a nó). |
| **Verificação Vazia** | $O(1)$ | Apenas checa se o `head` é nulo. |

> **Nota:** Uma melhoria futura para tornar a inserção $O(1)$ seria a implementação de uma referência `tail` (cauda).

## 🧪 Testes Realizados

A classe `MyLinkedListTests` valida os seguintes cenários:
- [x] Inserção em listas vazias.
- [x] Remoção de elementos inexistentes (garantindo que a lista não quebre).
- [x] Busca por elementos em diferentes posições.
- [x] Integridade dos ponteiros após múltiplas remoções.
- [x] Verificação da manutenção da ordem cronológica de inserção.

## 📹 Defesa Técnica (Vídeo)

Assista à explicação técnica da implementação, onde detalho o gerenciamento de memória e a execução dos testes:

👉 **[LINK PARA O VÍDEO NO YOUTUBE AQUI]**

## 💻 Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git](https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git)
