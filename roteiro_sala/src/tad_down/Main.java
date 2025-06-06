package tad_down;

public class Main{
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertOrdered(30);
        list.insertOrdered(10);
        list.insertOrdered(20);
        list.insertOrdered(40);

        System.out.println("--- Inserção Ordenada ---");
        System.out.print(list.printForward());  // Esperado: 10 20 30 40
        System.out.print(list.printBackward()); // Esperado: 40 30 20 10

        System.out.println("--- Remoção do 20 ---");
        list.remove(20);
        System.out.print(list.printForward());  // Esperado: 10 30 40
        System.out.print(list.printBackward()); // Esperado: 40 30 10
    }
}