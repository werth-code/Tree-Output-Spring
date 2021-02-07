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

public interface AppleTreeProduction {
    Integer fruitYield(Tree tree); // this needs to return in pounds fruit production
    Boolean crossPollinated(Tree tree); // this needs to look at trees in the surrounding area to find if a cross pollinating type is within range.
    Double costPerPound(Tree tree); // total cost per pound of apples.
}
