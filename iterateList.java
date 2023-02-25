
public class iterateList {

    public static void main(String[] args) {

       Node list = new Node();

       list.addNewNode(1);
       list.addNewNode(2);
       list.addNewNode(3);
       list.addNewNode(4);
       list.addNewNode(5);
       list.addNewNode(6);
       list.addNewNode(7);
       list.addNewNode(8);




       System.out.println("List 1: ");
       list.displayList();
       System.out.println("List after inserting a new node with a value = 5 after the first node in list 1: ");
       list.insertNode(list.head, 5);
       System.out.println("New List 1: ");
       list.displayList();
    }
}
