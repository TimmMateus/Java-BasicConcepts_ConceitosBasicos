package DataStructure;


/**
 * Create nodes that store datas in String format, only visible to other classes that will create and run list.
 * @version 1
 * @author TimmMateus
 * @see github projects on {@link https://github.com/TimmMateus}
 */
class Node {
    private String data;
    private Node nextNode;
    private Node previousNode;

    Node(String data){
        this.data=data;
    }

    void setNextNode(Node node){
        nextNode = node;
    }

    void setPreviousNode(Node node){
        previousNode = node;
    }

    Node getNextNode(){
        return nextNode;
    }

    Node getPreviousNode(){
        return previousNode;
    }

    void printNodes(){
        System.out.println("> " + data + " <");
        if(nextNode!=null) nextNode.printNodes();
    }

    void printSingleNode(){
        System.out.println(data);
    }

    public String getData() {
        return data;
    }
}
