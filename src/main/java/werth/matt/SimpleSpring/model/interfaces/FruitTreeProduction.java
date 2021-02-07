package werth.matt.SimpleSpring.model.interfaces;

// apple tree references
//https://extension.missouri.edu/publications/g6021
//https://extension.umn.edu/fruit/growing-apples
//https://theurbanfarmers.org/blog/the-math-of-fruit-trees/

//https://www.starkbros.com/products/fruit-trees/apple-trees - cost of trees ~$35

//mature dwarf apple (126 - 252 pounds per season(PPS))
//semi-dwarf apple(252-420 PPS)
//large apple(350-600)

import werth.matt.SimpleSpring.model.Tree;

public interface FruitTreeProduction {
    Integer fruitYield(Tree tree); // this needs to return in pounds fruit production
    //// TODO: 2/7/21 variables
    // type of tree (Apple 350-600 pps)
    // zone of tree (ideal 4-7)
    // health of tree (healthy-dead)
    // Of Bearing Age (true)
    // Pests (false, level 0)
    Double costPerPound(Tree tree); // total cost per pound of apples.
}
