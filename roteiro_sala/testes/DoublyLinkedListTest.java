import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tad_down.DoublyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

//VARIOS CASOS TESTES AUTOMATIZADOS, PARA VERIFICAR SE ORDENA EM ORDEM CRESCENTE CORRETAMENTE
public class DoublyLinkedListTest {
    private DoublyLinkedList list;

    @BeforeEach
    public void initializeList() {
        list = new DoublyLinkedList();
    }

    @Test
    public void test_insertOrdered() {
        list.insertOrdered(10);
        assertEquals("10", list.head.toString());
        list.insertOrdered(20);
        assertEquals("10", list.head.toString());
        assertEquals("20", list.head.getNext().toString());
        list.insertOrdered(30);
        assertEquals("10", list.head.toString());
        assertEquals("20", list.head.getNext().toString());
        assertEquals("30", list.head.getNext().getNext().toString());
    }

    @Test
    public void test_printForward_when() {
        list.insertOrdered(10);
        list.insertOrdered(20);
        list.insertOrdered(30);
        list.insertOrdered(40);
        
        assertEquals("Lista (frente): 10 20 30 40 \n", list.printForward());
    }
    
    @Test
    public void test_insertUnorderedValues() {
        list.insertOrdered(50);
        list.insertOrdered(10);
        list.insertOrdered(40);
        list.insertOrdered(30);
        list.insertOrdered(20);
        assertEquals("Lista (frente): 10 20 30 40 50 \n", list.printForward());
    }

    @Test
    public void test_insertRepeatedValues() {
        list.insertOrdered(20);
        list.insertOrdered(20);
        list.insertOrdered(20);
        assertEquals("Lista (frente): 20 20 20 \n", list.printForward());
    }

    @Test
    public void test_removeVariousPositions() {
        list.insertOrdered(10);
        list.insertOrdered(20);
        list.insertOrdered(30);
        list.remove(10);  //remove primeiro
        list.remove(30);  //remove último
        list.remove(20);  //remove único restante
        assertEquals("Lista (frente): \n", list.printForward());
    }

    @Test
    public void test_printEmptyList() {
        assertEquals("Lista (frente): \n", list.printForward());
        assertEquals("Lista (trás): \n", list.printBackward());
    }

    @Test
    public void test_printBackward_when() {
        list.insertOrdered(10);
        list.insertOrdered(20);
        list.insertOrdered(30);
        list.insertOrdered(40);
        assertEquals("Lista (trás): 40 30 20 10 \n", list.printBackward());
    }
}