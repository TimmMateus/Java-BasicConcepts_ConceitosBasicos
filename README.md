###### *[Clique aqui para acessar o projeto em português](https://github.com/TimmMateus/Java-BasicConcepts_ConceitosBasicos/tree/Portugues)*

# Welcome

This is a project with basic but core structures in Java. At the moment it's a *work in progress*, as I'll be adding more features as I complete them.
<br>
The idea behind the project is to have a repository with structures that can be used in other projects, without the need to code this features again.
<br>
As the focus of this project is the structures, and not a complete app, the class containing the Main method isn't included as it isn't necessary.
<br>
Feel free to contact me for any suggestions, corrections or doubts.

## About me
Graduated in Computer Engineering, and studying System Analyses and Development, I'm looking for start a career in Software Development, focused in BackEnd with Java and C#, but not excluding other technologies.
<br>
[TimmMateus](mailto:maretimm@gmail.com)

## Structures

|[Package](#packages-and-classes)|Class|
|---|---|
|[DataStructure](#datastructure)|[Node](#node)|
|↳|[LinkedList](#linkedlist)|

### DataStructure

This package contains classes and methods focused on working with Data storing and manipulation.

#### Node

This is the main class in the package, where data is stored. It's only accessible to the package, as it needs other classes to structure to access and manipulate the data.

##### Attributes

|Name|Type|Description|
|---|---|---|
|data|String|Stored information in the node|
|nextNode|Node|Next node in the sequence|
|previousNode|Node|Previous node in the sequence|

##### Methods

|Name|Parameter (Type)|Description|
|---|---|---|
|Node|data (String)|Constructor with only data|
|Node|data (String) <br> PreviousNode (Node)|Constructor when adding nodes <br> Stores the previous node creating a link
|setNextNode|node (Node)|Set which node comes after|
|setPreviousNode|node (Node)|Set which node comes before|
|getNextNode||Return the node that comes after|
|getPreviousNode||Return the node that comes before|
|findNode|node (Node) <br> position (int)|search in the linked nodes returning the note in a given position|
|printNodes||Print the values of a node with its position <br> Calls the method to print the next node|
|printNodes|position (int)|Print the values of a node with its position <br> Calls the method to print the next node|
|printNode||Print the value of the node|
|getData||Returns the data stored in the node|

#### LinkedList

This class uses the class Node to create a list with stored information, and is able to add and remove items in the start, middle or end of the list. It keeps the length of the list, the first node and the last one as reference of the list's information

##### Attributes

|Name|Type|Description|
|---|---|---|
|firstNode|Node|The reference of the first node of the list|
|lastNode|Node|The reference of the last node of the list|
|length|int|The quantity of nodes in the list|

##### Methods

|Name|Parameter (Type)|Description|
|---|---|---|
|Linked List||Creates an empty list|
|Linked List|data (String)|Creates an list with it's firsts item|
|addItem|data (String)|Adds a new item at the end of the list|
|addItem|data (String) <br> position (int)|Adds a new item in the list at the given position|
|addItemFirst|data (String)|Adds a new item at the beginning of the list|
|remove|position (int)|Removes the item from the list at the given position|
|removeLast||Removes the last item of the list|
|removeFirst||Remove the first item of the list|
|clear||Clears the entire list|
|printList||Print all data stored in the list|
|length||Returns the length of the list|
|getFirst||Returns the data stored in the first item|
|getLast||Returns the data stored in the last item|

## License
[This project is licensed under the MIT License - see the LICENSE.md file for details.](LICENSE.md)