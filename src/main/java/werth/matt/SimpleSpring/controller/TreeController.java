package werth.matt.SimpleSpring.controller;

import org.springframework.web.bind.annotation.*;
import werth.matt.SimpleSpring.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import werth.matt.SimpleSpring.service.TreeService;

import java.util.List;

@RestController
public class TreeController {

    @Autowired
    private TreeService treeService; //for dependency injection

    @GetMapping("/")
    public String landing() {
        return "Hi";
    }

    @GetMapping("/trees")
    public List<Tree> getTrees() {
        return treeService.getTrees();
    }

    @GetMapping("/trees/{id}")
    public Tree getTreeByID(@PathVariable Long id) {
        return treeService.getTreeByID(id);
    }

    @PostMapping("/trees")
    public void addTree(@RequestBody Tree tree) {
        treeService.addTree(tree);
    }

    @PutMapping("/trees/{id}")
    public void updateTree(@RequestBody Tree tree, @PathVariable Long id) {
        treeService.updateTree(id, tree);
    }

    @DeleteMapping("/trees/{id}")
    public void deleteTree(@PathVariable Long id) {
        treeService.removeTree(id);
    }

}
