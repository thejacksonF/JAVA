public class MAIN3 {
    public static void main(String[] args) {
        LinkedSimpleList list = new LinkedSimpleList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("List:");
        list.display();

        System.out.println("Is 20 in the list? " + list.search(20));

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();


        EjemploCola cola = new EjemploCola();
        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");
        System.out.println("Cliente al frente: " + cola.peek());
        














        
    }
}
