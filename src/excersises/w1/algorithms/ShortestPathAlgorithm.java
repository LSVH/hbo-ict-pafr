package excersises.w1.algorithms;

import excersises.w1.models.INode;
import excersises.w1.models.IPath;

public interface ShortestPathAlgorithm {

    public IPath shortestPath(INode startNode, INode endNode);

}
