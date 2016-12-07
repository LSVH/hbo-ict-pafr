package excersises.w1.models;

import java.util.ArrayList;
import java.util.List;

public class Path implements IPath {
    
    private List<INode>path = new ArrayList<INode>();
    private double totalCosts;


    public List<INode> getPath() {
        return path;
    }

    public void setPath(List<INode> path) {
        this.path = path;
    }

    public double getTotalCosts() {
        return totalCosts;
    }

    public void setCosts(double totalCosts) {
        this.totalCosts = totalCosts;
    }
    
    public String toString(){
        String returner = "";
        for(INode cel: path){
            returner+=cel.toString() + "-->";
        }
        
        returner+= "\n kosten:" + totalCosts;
        return returner;
    }

}

