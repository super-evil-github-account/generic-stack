# generic-stack
Practice Stack data structure using Java generics

In this exercise you are going to implement a generic Linked Stack data structure.
A Stack is a data structure that follows the FIFO idea -> First in First out, meaning that the last element added is going to be the first one removed from the Stack.
By implementing a data structure using generics, your Stack will be more flexible, having the abillity to control the type of the Stack beforehand.
Your Stack is also a linked one, so you’re also going to have pointers inside the nodes to the next one.

You are going to use generic classes, methods and data members.

Step 1:
-------

Create Node<T> class:
  
	private T data; 
    private Node next;

Implement a constructor:
  
   public Node(T data);
   => Set data to be the input given in the constructor
   => Set next to be null

Implement getters, setters and toString

Step 2:
-------
  
Create LinkedStack class:
  
   private Node head;
   private Node last;
   private int size;

Implement a constructor:
  
   public LinkedStack();
   => Instantiate head as a new Node
   => Set last = head

Implement the following methods:
  
    public boolean isEmpty();
    => Check if your Stack if empty and return true if so, false if not

    public <T>void push(T data);
    => Insert the given data to the head of your stack. Give a solution for 2 situations: if your Stack is empty, and if your Stack is not
    => Note that you have to increment the size

    public <T>T poll();
    => Return the last element added to the Stack and remove it. Again, consider a situation where your Stack is empty
    => Note that you have to decrement the size

    public <T>T peek();
    => Return the last element added to the Stack without removing it

    public void delete();
    => Attempt to delete all the elements in your Stack

Step 3:
-------
  
    Create a Runner class with main method and test pushing, popping, peeking and deleting.

🦏 Good luck! 🦏
