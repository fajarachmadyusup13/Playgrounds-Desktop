/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link;

/**
 *
 * @author ghost
 */
public class Link {
    
    public String bookName;
    public int millionsSold;
    
    public Link next;

    public Link(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }   
    
    public void display(){
        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }

    @Override
    public String toString() {
        return bookName;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkList theLinkList = new LinkList();
        
        theLinkList.insertFirstLink("Don Quixote", 500);
        theLinkList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkList.insertFirstLink("The Lord of The Rings", 150);
        theLinkList.insertFirstLink("Harry Potter and Sorcerer's Stone", 107);
        
//        theLinkList.removeFirst();
        
//        System.out.println(theLinkList.find("The Lord of The Rings"));
        
        theLinkList.removeLink("Don Quixote");
        theLinkList.display();
    }
    
}

class LinkList{
    
    public Link firstLink;

    public LinkList() {
        this.firstLink= null;
    }
    
    public boolean isEmpty(){
        return (firstLink == null);
    }
    
    public void insertFirstLink(String bookName, int millionsSold){
        
        Link newLink = new Link(bookName, millionsSold);
        
        newLink.next = firstLink;
        firstLink = newLink;
        
    }
    
    
    public Link removeFirst(){
        
        Link linkReference = firstLink;
        if (!isEmpty()) {
            firstLink = firstLink.next;
        }else{
            System.out.println("Empty Linkedlist");
        }
        return linkReference;
    }
    
    public void display(){
        
        Link theLink = firstLink;
        
        while (theLink != null) {
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
            System.out.println("");
        }       
    }
    
    public Link find(String bookName){
        
        Link theLink = firstLink;
        
        if (!isEmpty()) {
            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                }else{
                    theLink = theLink.next;
                }
            }
        }else{
            System.out.println("Empty Linkedlist");
        }
        return theLink;
    }
    
    public Link removeLink(String bookName){
        
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        
        while (currentLink.bookName != bookName) {
            if (currentLink.next == null) {
                return null;
            }else{
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        
        if (currentLink == firstLink) {
            firstLink = firstLink.next;
        }else{
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }
}