package excersises.w1.models;

import java.util.List;

public interface IPath {
    public List<INode> getPath();
    public double getTotalCosts();

}
