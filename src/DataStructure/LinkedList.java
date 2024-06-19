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
        Node node = new Node(data,lastNode);
        if(length==0) firstNode=node;
        else lastNode.setNextNode(node);
        lastNode=node;
        length++;
    }

    /**
     * Insert a new item in the asked position
     * @param data
     * @param position
     */
    public void addItem(String data, int position){
        if(position==0) addItemFirst(data);
        else if(position>=length)addItem(data);
        else{
            Node node = new Node(data);
            node.setPreviousNode(node.findNode(firstNode, (position-1)));
            node.setNextNode(node.findNode(firstNode, position));
            node.getPreviousNode().setNextNode(node);
            node.getNextNode().setPreviousNode(node);
        }
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
     * Removes the item in the asked position
     * @param position
     */
    public void remove(int position){
        if(position==0)removeFirst();
        else if(position>=length-1)removeLast();
        else{
            Node helperNode = new Node(null);
            helperNode = firstNode.findNode(firstNode, position);
            helperNode.getPreviousNode().setNextNode(helperNode.getNextNode());
            helperNode.getNextNode().setPreviousNode(helperNode.getPreviousNode());
        }
    }

    /**
     * Removes the last stored data
     */
    public void removeLast(){
        if(firstNode==null) System.out.println("Nothing happened, list is empty");
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
        if(firstNode==null) System.out.println("Nothing happened, list is empty");
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
     * Clear the entire list;
     */
    public void clear(){
        firstNode = null;
        lastNode = null;
        length = 0;
        System.out.println("List successfully emptied!");
    }

    /**
     * Print all data stored in the list
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