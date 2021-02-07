package controller;

import com.sun.source.util.Trees;
import model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TreeService;

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

}
