package werth.matt.SimpleSpring.service;

import werth.matt.SimpleSpring.model.Tree;
import werth.matt.SimpleSpring.model.TreeType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TreeService {

    public List<Tree> trees = new ArrayList<>(Arrays.asList(
            new Tree("28.22223.221", TreeType.APPLE, 1),
            new Tree("24.12123.121", TreeType.APPLE, 1)
    ));

    public List<Tree> getTrees() {
        return trees;
    }

    public Tree getTreeByID(String id) {
        //make sure to handle this if no id matches - right now its an optional...
        return trees.stream().filter(tree -> tree.getId().equals(id)).findFirst().get();
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public void updateTree(String id, Tree tree) {
        for(int i = 0; i < trees.size(); i++) {
            if (trees.get(i).getId().equals(id)) trees.set(i, tree);
        }
    }

    public void removeTree(String id) {
        trees.removeIf(tree -> tree.getId().equals(id)); //Nice method which takes a lambda!
    }
}
