package UseCase1;

public class LinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }}
       Node head,tail=null;
    public void adding(int data){
        Node newNode=new Node(data);
        if(head == null) {
           // Node newNode;
            head = newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            newNode.next=null;
            tail=newNode;
        }}
    public void printList() {
        Node currnode = head;
        while (currnode != null) {
            System.out.println(currnode.data + "");
            currnode = currnode.next;
        }}
        public static void main(String[] args){
            System.out.println("Welcome To Linked List Program");
            LinkedList list=new LinkedList();
            System.out.println();
            list.adding(56);
            list.adding(30);
            list.adding(70);
            list.printList();

    }

    }

