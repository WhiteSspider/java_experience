package stack;

public interface Stack_interface {
    void put(int literal) throws Stack_is_full;
    int get() throws StackEmtyStack;
}
