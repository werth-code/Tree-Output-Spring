package werth.matt.SimpleSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import werth.matt.SimpleSpring.model.FruitTree;
import werth.matt.SimpleSpring.model.Tree;
import werth.matt.SimpleSpring.model.TreeType;
import org.springframework.stereotype.Service;
import werth.matt.SimpleSpring.repository.TreeRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TreeService {

    @Autowired // here when we create an instance of TreeService it is injected into TreeRepository.
    private TreeRepository treeRepository;

    LocalDate localDate = LocalDate.of(2015, 3, 2);

    private List<Tree> trees = new ArrayList<>(Arrays.asList(
            new FruitTree("41.40338, 2.17403", TreeType.APPLE, LocalDate.of(2015, 3, 2), false),
            new FruitTree("41.40338, 2.17403", TreeType.APPLE, LocalDate.of(2015, 3, 2), false)
    ));

    public List<Tree> getTrees() {
        List<Tree> trees = new ArrayList<>();
        treeRepository.findAll().forEach(trees::add);
        return trees;
    }

    public Tree getTreeByID(Long id) {
       return treeRepository.findById(id).orElse(null);
    }

    public void addTree(Tree tree) {
        treeRepository.save(tree);
    }

    public void updateTree(Long id, Tree tree) {
        Optional<Tree> foundTree = Optional.ofNullable(getTreeByID(id));
        tree.setId(foundTree.get().getId());
        treeRepository.save(tree);
    }

    public void removeTree(Long id) {
        treeRepository.deleteById(id);
    }
}

//public List<Tree> getTrees() {
//        return trees;
//    }
//
//    public Tree getTreeByID(String id) {
//        //make sure to handle this if no id matches - right now its an optional...
//        return trees.stream().filter(tree -> tree.getId().equals(id)).findFirst().get();
//    }
//
//    public void addTree(Tree tree) {
//        trees.add(tree);
//    }
//
//    public void updateTree(String id, Tree tree) {
//        for(int i = 0; i < trees.size(); i++) {
//            if (trees.get(i).getId().equals(id)) trees.set(i, tree);
//        }
//    }
//
//    public void removeTree(String id) {
//        trees.removeIf(tree -> tree.getId().equals(id)); //Nice method which takes a lambda!
//    }