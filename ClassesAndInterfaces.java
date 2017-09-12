import java.util.*;

public class ClassesAndInterfaces {

  // main method
  public static void main(String[] args) {
    testStore();
    }

  public static void testStore() {
    Todo climb = new Todo("Climb Mt. Rainer");
    Todo language = new Todo("Learn French");
    Todo dog = new Todo("Take Hero to the dog park");
    Todo movie = new Todo("Return movies to Blockbuster");
    Todo keyboard = new Todo("Learn to play the keyboard");
    Todo houseChores = new Todo("Clean the house");
    Todo dancing = new Todo("Take dancing classes with Elena");
    Todo burn = new Todo("Get Burning Man tickets");
    Todo dogCare = new Todo("Schedule a checkup with the Vet for Hero");

    Todo[] arrayItems = {climb, language, dog, movie};
    ArrayList<Todo> originalItems = new ArrayList<Todo>(Arrays.asList(arrayItems));
    // using the store constructor to make a new Store object that takes in my originalItems arraylist and makes a new myTodoList of type store.
    Store myTodoList = new Store(originalItems);

    System.out.println("");
    myTodoList.numberOfObjects();
    myTodoList.allTodos();
    System.out.println("");
    myTodoList.add(keyboard);
    System.out.println("");
    myTodoList.remove(houseChores);
    System.out.println("");
    myTodoList.remove(dog);
    System.out.println("");
    myTodoList.add(houseChores);
    System.out.println("");
    myTodoList.add(burn);
    System.out.println("");
    myTodoList.remove(dog);
    System.out.println("");
    myTodoList.add(dogCare);
    System.out.println("");
    myTodoList.objectAtIndex(3);
    System.out.println("");
    myTodoList.add(dancing);
    System.out.println("");
    myTodoList.numberOfObjects();
    myTodoList.allTodos();
  }

}
