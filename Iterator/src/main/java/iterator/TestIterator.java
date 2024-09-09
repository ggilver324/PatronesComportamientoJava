package iterator;

public class TestIterator {

    public static void main(String[] args){

        ListNode<String> listNode = new ListNode<>(new Node<>("Hola"));
        listNode.addEnd("que");
        listNode.addEnd("tal");
        while(listNode.hasNext())
            System.out.println(listNode.next());

    }
}
