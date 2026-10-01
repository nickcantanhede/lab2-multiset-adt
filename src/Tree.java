import java.util.ArrayList;

public class Tree {
    // We recommend attempting this class last, as it hasn't been scaffolded for your team.
    // Even if your team doesn't have time to implement this class, it is a useful exercise
    // to think about how you might split up the work to get the Tree and TreeMultiSet
    // implemented.

    private Integer root;
    private final ArrayList<Tree> subtrees;

    public Tree() {
        this.root = null;
        this.subtrees = new ArrayList<>();
    }

    public Tree(int root) {
        this.root = root;
        this.subtrees = new ArrayList<>();
    }

    public boolean isEmpty() {
        return root == null;
    }
    
    public int getSize() {
        if (this.isEmpty()) {
            return 0;
        } else {
            int size = 1;
            for (Tree subtree : subtrees) {
                size += subtree.getSize();
            }

            return size;
        }
    }

    public int count(int item) {
        if (this.isEmpty()) {
            return 0;
        } else {
            int num = 0;
            if (root == item) {
                num ++;
            }

            for (Tree subtree : subtrees) {
                num += subtree.count(item);
            }

            return num;
        }
    }
}
