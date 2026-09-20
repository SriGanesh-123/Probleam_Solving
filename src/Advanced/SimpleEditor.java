package Advanced;
import java.util.*;

public class SimpleEditor {
    private StringBuilder text = new StringBuilder();
    private Deque<Runnable> undoStack = new ArrayDeque<>();

    public void insert(int pos, String s) {
        text.insert(pos, s);
        int p = pos, len = s.length();
        // push undo action
        undoStack.push(() -> text.delete(p, p + len));
    }

    public void delete(int pos, int len) {
        String removed = text.substring(pos, pos + len);
        text.delete(pos, pos + len);
        // push undo action
        undoStack.push(() -> text.insert(pos, removed));
    }

    public void undo() {
        if (!undoStack.isEmpty()) undoStack.pop().run();
    }

    public String getText() {
        return text.toString();
    }

    public static void main(String[] args) {
        SimpleEditor e = new SimpleEditor();
        e.insert(0, "Hello");
        e.insert(5, " World");
        System.out.println(e.getText()); // Hello World
        e.delete(5, 6); // remove " World"
        System.out.println(e.getText()); // Hello
        e.undo();
        System.out.println(e.getText()); // Hello World
        e.undo();
        System.out.println(e.getText()); // Hello
    }
}
