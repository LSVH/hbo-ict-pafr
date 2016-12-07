package excersises.w1.algorithms;

import excersises.w1.models.INode;
import excersises.w1.models.IPath;
import excersises.w1.models.Path;

import java.util.*;

public class DijkstrasAlgorithm implements ShortestPathAlgorithm{
    
    private INode startNode;
    private INode endNode;
    
    private Map<INode, Double> kortseAfstandenTotStartCel = new HashMap<INode, Double>();
    private Map<INode, INode> predecessors= new HashMap<INode, INode>();
    private Set<INode> settledNodes = new HashSet<INode>();
    private PriorityQueue<INode> unsettled;
    
    
    private Comparator<INode> kortseAfstandComparator = new Comparator<INode>(){
       
        @Override
        public int compare(INode t, INode t1) {
            
            double korsteAfstandt = kortseAfstandenTotStartCel.get(t);
            double kortsteAfstandt2 = kortseAfstandenTotStartCel.get(t1);

            if(korsteAfstandt > kortsteAfstandt2){
                return 1;
            }else if(korsteAfstandt < kortsteAfstandt2){
                return -1;
            }else{
                return 0;
            }
        }
    };
    
    
    public DijkstrasAlgorithm(){
        setUpDatastructures();
    }
    
    private void start(){
        initDijkstra(startNode);
        startAlgorithm();
    }

    private void setUpDatastructures(){
        kortseAfstandenTotStartCel = new HashMap<INode, Double>();
        predecessors= new HashMap<INode, INode>();
        settledNodes = new HashSet<INode>();
        unsettled = new PriorityQueue<INode>(1, kortseAfstandComparator);
    }


    private IPath getShortestPathNodeName(INode endNode){
        Iterator<INode> iterator = predecessors.keySet().iterator();
        while(iterator.hasNext()){
            INode iterNode = iterator.next();
            if(iterNode!=null){
                if(iterNode == endNode){
                    return creeerPath(iterNode);
                }
            }

        }
        return null;
    }

    private IPath creeerPath(INode node){
        
        List<INode> pad = new ArrayList<INode>();
        pad.add(node);
        
        boolean startCelGevonden = false;
        INode zoekNode = node;
        while(!startCelGevonden){
            INode celIter = predecessors.get(zoekNode);
            pad.add(celIter);
            zoekNode = celIter;
            if(celIter.equals(this.startNode)){
                startCelGevonden = true;
            }
        }
        
        Collections.reverse(pad);
        
        Path path = new Path();
        path.setPath(pad);
        path.setCosts(this.kortseAfstandenTotStartCel.get(node));
        
        return path;
    }
    
    
    private void startAlgorithm(){
        while(!unsettled.isEmpty()){
            INode cel = extractMinimum();
            settledNodes.add(cel);
            relaxeNeighbours(cel);
        }
    }
    
    private void initDijkstra(INode startCel){
        kortseAfstandenTotStartCel.put(startCel, new Double(0));
        unsettled.add(startCel);
    }
    
    private INode extractMinimum(){
        INode cel = this.unsettled.poll();
        return cel;
    }
    
    private void relaxeNeighbours(INode cel){
        Map<INode, Double> buren = cel.neighboursWithDistances();
        Set keys = buren.keySet();
        Iterator<INode> iterator =  keys.iterator();
                
        while(iterator.hasNext()){
            INode celBuur = iterator.next();
            if(!settledNodes.contains(celBuur)){
               double kortsteAfstandTotCel = kortseAfstandenTotStartCel.get(cel);
               double kortsteafstandTotcelBuur = Integer.MAX_VALUE;
               if(kortseAfstandenTotStartCel.containsKey(celBuur)){
                   kortsteafstandTotcelBuur = kortseAfstandenTotStartCel.get(celBuur);
               } 
               
               double afstand = buren.get(celBuur);
               
               if(kortsteafstandTotcelBuur > kortsteAfstandTotCel  + afstand){
                    kortseAfstandenTotStartCel.put(celBuur, new Double(kortsteAfstandTotCel + afstand));
                    predecessors.put(celBuur, cel);
                    unsettled.add(celBuur);
               }
            }
       }
    }

    @Override
    public IPath shortestPath(INode startNode, INode endNode) {
        this.startNode = startNode;
        this.endNode = endNode;
        start();

        return getShortestPathNodeName(endNode);
    }
}
