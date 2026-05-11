public class MyLinkedListTests {
    public static void main(String[] args) {
        testInsertionInEmptyList();
        testRemoveNonExistentElement();
        testOrderMaintenance();
    }

    public static void testInsertionInEmptyList() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        assert list.search(10) == 0 : "Erro: Inserção em lista vazia falhou";
        System.out.println("Teste Inserção: OK");
    }

    public static void testRemoveNonExistentElement() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(5);
        boolean removed = list.remove(10);
        assert !removed : "Erro: Removeu elemento que não existe";
        System.out.println("Teste Remoção Inexistente: OK");
    }

    public static void testOrderMaintenance() {
        // Implementar lógica de sort e verificar se a ordem se mantém
    }
}