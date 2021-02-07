package werth.matt.SimpleSpring.model.interfaces;

import werth.matt.SimpleSpring.model.Tree;

public interface FruitTreeRequiresPollination {
    Boolean crossPollinated(Tree tree); // this needs to look at trees in the surrounding area to find if a cross pollinating type is within range.
    Integer crossPollinatorRange(Tree tree); // returns distance of compatible cross pollinator.
}
