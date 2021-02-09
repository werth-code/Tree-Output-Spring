package werth.matt.SimpleSpring.repository;

import org.springframework.data.repository.CrudRepository;
import werth.matt.SimpleSpring.model.Tree;

// Here we extend CrudRepository and pass in the Class Type(Tree) and the ID type(in this case String)
//
public interface TreeRepository extends CrudRepository<Tree, Long> {

}
