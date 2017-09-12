import java.util.*;

public class Store implements ObjectStore  {

  // property of class Store that gives it an array list as Store will hold the
  // todo list being constructed
  public ArrayList<Todo> list;

  // contructor to build the todo list as an arraylist
  public Store(ArrayList<Todo> todoList) {
    this.list = todoList;
  }

  // // method that defines the logic for implementing objectstore interface method
  // to add todo items to the current todo list
  public void add(Todo newTodo){
    this.list.add(newTodo);
    System.out.println(newTodo.text + "- has been added to your Todo list.");
  }

  // method that defines the logic for implementing objectstore interface method
  // to delete todo items from the current todo list
  public void remove(Todo deleteTodo){
    if (this.list.contains(deleteTodo)) {
      int indexToBeRemoved = this.list.indexOf(deleteTodo);
      this.list.remove(indexToBeRemoved);
      System.out.println(deleteTodo.text + "- was removed from the list.");
    } else {
      System.out.println(deleteTodo.text + "- cannot be removed as it is not currently on the list.");
    }
  }
  // method that defines the logic for implementing objectstore interface method
  // method takes in index, an int, prints out the item at that index and returns
  // the Todo at that index
  public Todo objectAtIndex(int index) {
    Todo itemAt = this.list.get(index);
    System.out.println("The item at spot number " + index + " on your list is, " + itemAt.text);
    return itemAt;
  }
  // method that defines the logic for implementing objectstore interface method
  //
  public int numberOfObjects() {
    int listLength = this.list.size();
    System.out.println("There are " + listLength + " items in the Todo list.");
    return listLength;
  }
  // method that defines the logic for implementing objectstore interface method
  //
  public Todo[] allTodos() {
    Todo[] listAsAnArray = new Todo[this.list.size()];
    String listAsString = "";
    for (int i = 0; i < this.list.size() ; i++ ) {
        listAsAnArray[i] = this.list.get(i);
        String todoItem = (listAsAnArray[i]).text;
        listAsString = listAsString + todoItem;
    }
    // alternate way to print out list that will print in on one line.
    //System.out.println("The current Todo list as it stands is :" + listAsString);
    for (int i = 0; i < this.list.size() ; i++ ) {
      String iToString = Integer.toString(i + 1);
      System.out.println("#" + iToString + " " + (listAsAnArray[i]).text);
    }
    return listAsAnArray;
  }

}
