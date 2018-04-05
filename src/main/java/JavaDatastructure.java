import datastructure.immutable.list.LinkedList;
import datastructure.immutable.tree.BinarySearchTree;
import datastructure.mutable.tree.BinaryTree;

public class JavaDatastructure {

    public static void main(String[] args){

        // Initialize linkedList
        LinkedList<Integer> linkedList = LinkedList.of(5, 12, 14, 3);

        // traverse the linkedList and print element to console
        linkedList.traverse(x -> System.out.print(x + " "));
        System.out.println();

        // get element at index
        System.out.println(linkedList.get(1).orElse(-1));
        System.out.println(linkedList.getRecursive(2).orElse(-1));

        // reverse linkedList
        LinkedList<Integer> reversedList = linkedList.reverse();

        //traverse the reversed linkedList
        reversedList.traverse(x -> System.out.print(x + " "));
        System.out.println();

        //drop 2 elements
        reversedList.drop(2).traverse(x -> System.out.print(x + " "));
        System.out.println();

        //drop while condition evaluates to true
        linkedList.dropWhile(x -> x > 4).traverse(x -> System.out.print(x + " "));
        System.out.println();

        //prepend the reverse of the list to the list
        LinkedList<Integer> prependedList = linkedList.prependAll(reversedList);
        prependedList.traverse(x -> System.out.print(x + " "));
        System.out.println();

        //append an element to list
        prependedList.append(100).traverse(x -> System.out.print(x +" "));
        System.out.println();

        //append list to list
        prependedList.appendAll(LinkedList.of(200, 300, 400)).traverse(x -> System.out.print(x +" "));
        System.out.println();

        //delete element at index
        prependedList.delete(2).traverse(x -> System.out.print(x + " "));
        System.out.println();

        BinaryTree bTree = BinaryTree.of(1, 2, 4, 5, 6, 7);
        System.out.println(bTree.depth());

        BinaryTree bTree2 = BinaryTree.of(1, 2, 4, 5, 6, 7);

        System.out.println(bTree.compare(bTree2));

        BinaryTree fliped = BinaryTree.of(4, 12, 15);

        System.out.println(fliped);
        fliped.flip();
        System.out.println(fliped);

        BinaryTree bTree3 = BinaryTree.of(4, 12, 15, 1, 6, 13);
        BinaryTree bTree4 = BinaryTree.of(4, 12, 15, 1, 6, 13);
        bTree4.flip();

        System.out.println(bTree3.flipEqual(bTree4));

        datastructure.immutable.tree.BinaryTree imTree = datastructure.immutable.tree.BinaryTree.of(1, 2 , 3);
        System.out.println(imTree);

        datastructure.immutable.tree.BinaryTree flipedImTree = imTree.flip();
        System.out.println(flipedImTree);


        BinarySearchTree<Integer> bst = BinarySearchTree.of(3, 1, 2, 6, 4, 8);
        System.out.println(bst);

        BinarySearchTree mappedTree = bst.map(elem -> elem * 2);
        System.out.println(mappedTree);

        BinarySearchTree bst1 = BinarySearchTree.of();
        BinarySearchTree bst2 = bst1.insert(10).insert(5).insert(15).insert(7).insert(12);

        System.out.println(bst2.find(20).orElse("Not found"));
        bst2.postOrderTraversal(x -> System.out.print(x +" "));
        System.out.println();
    }
}
