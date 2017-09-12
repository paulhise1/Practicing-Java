// Define ObjectStore interface
public interface ObjectStore {

  // methods for this interface, to be defined by the classes that implement this
  public void add(Todo newTodo);
  public void remove(Todo deleteTodo);
  public Todo objectAtIndex(int index);
  public int numberOfObjects();
  public Todo[] allTodos();
}
