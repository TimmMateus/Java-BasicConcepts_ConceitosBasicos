package DataStructure;

/**
 * Create list of data in Strings.
 * @version 1
 * @author TimmMateus
 * @see github projects on {@link https://github.com/TimmMateus}
 */
public class LinkedList{
    private Node firstNode;
    private Node lastNode;
    private int length;
    
    /**
     * Create a new empty list
     */
    public LinkedList(){
        length=0;
    }

    /**
     * Create a new list storing it's first item
     * @param data to be stored
     */
    public LinkedList(String data){
        Node node = new Node(data);
        lastNode = node;
        firstNode = node;
        length = 1;
    }

    /** 
     * Add a new item to the end of the list
     * @param data to be stored 
     */
    public void addItem(String data){
        Node node = new Node(data);
        if(length==0) firstNode=node;
        else lastNode.setNextNode(node);
        node.setPreviousNode(lastNode);
        lastNode=node;
        length++;
    }

    /**
     * Insert a new item in first position
     * @param data to be stored
     */
    public void addItemFirst(String data){
        Node node = new Node(data);
        if (length==0) lastNode=node;
        else{
            firstNode.setPreviousNode(node);
            node.setNextNode(firstNode);
        }
        length++;
        firstNode=node;
    }

    /**
     * Removes the last stored data
     */
    public void removeLast(){
        if(firstNode==null) System.out.println("Nothing happend, list is empty");
        else{
            lastNode = lastNode.getPreviousNode();
            if(lastNode==null) firstNode=lastNode;
            else{ 
                lastNode.setNextNode(null);
                length--;
            }
        }
    }

    /**
     * Removes the first item of the list
     */
    public void removeFirst(){
        if(firstNode==null) System.out.println("Nothing happend, list is empty");
        else{
            if(firstNode.getNextNode()==null){
                firstNode=null;
                lastNode=null;
            } else {
                firstNode = firstNode.getNextNode();
                firstNode.setPreviousNode(null);
            }
            length--;
        }
    }

    /**
     * Print all data stored in list
     */
    public void printList(){
        if(firstNode==null) System.out.println("This list is empty");
        else firstNode.printNodes();
    }

    /**
     * @return length of list 
     */
    public int length(){
        return length;
    }

    /**
     * @return first stored data
     */
    public String getFirst(){
        return firstNode.getData();
    }

    /**
     * @return last stored data
     */
    public String getLast(){
        return lastNode.getData();
    }
    
}