package excersises.w1.models;

import java.util.Map;

public interface INode {
    
    public Map<INode, Double> neighboursWithDistances();
    public String getName();
}
