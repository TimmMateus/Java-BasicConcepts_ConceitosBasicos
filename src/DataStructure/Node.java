package DataStructure;


/**
 * Create nodes that store data in String format, only visible to other classes that will create and run list.
 * @version 1
 * @author TimmMateus
 * @see github projects on {@link https://github.com/TimmMateus}
 */
class Node {
    private String data;
    private Node nextNode;
    private Node previousNode;

    //Constructor for first nodes
    Node(String data){
        this.data=data;
    }

    //Constructor for adding nodes
    Node(String data, Node previousNode){
        this.data=data;
        this.previousNode=previousNode;
    }

    //Set the node that comes after
    void setNextNode(Node node){
        nextNode = node;
    }

    //Set the node that comes before
    void setPreviousNode(Node node){
        previousNode = node;
    }

    //Return the node that comes after
    Node getNextNode(){
        return nextNode;
    }

    //Return the node that comes before
    Node getPreviousNode(){
        return previousNode;
    }

    //Return node in asked position
    Node findNode(Node node, int position){
        if(position==0)return node;
        position--;
        if(node.nextNode==null)return null;
        return findNode(node.nextNode, position);
    }

    //Print the values with the position in storage
    void printNodes(){
        int position=0;
        System.out.println(position + " -> " + data);
        if(nextNode!=null) nextNode.printNodes(position);
    }

    //Print the values with the position in storage
    void printNodes(int position){
        position++;
        System.out.println(position + " -> " + data);
        if(nextNode!=null) nextNode.printNodes(position);
    }

    //Print the value of a single node
    void printNode(){
        System.out.println(data);
    }

    //Return the value of a node
    public String getData() {
        return data;
    }
}
