public class linked{
	public static main(String[] args){
		System.out.println("hello world");
	}
}


public class node{
	private int value;
	private node nextNode;
	public node(int value){
		this.value = value;
	}
	public void setNext(node nextNode){
		this.nextNode = nextNode;
	}
	public node next(){
		return nextNode;
	}
}

public class LinkedList{
	private node[] nodes = {}
	private node head;
	public LinkedList(Node[] nodes){
		this.nodes = nodes;
		this.head = nodes[0];
	}
	

}

