/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of a graph ADT adjacency list structure.
 * This will allow locating a secondary structure for a given
 * vertex in O(1) time. This will require a linked list of nodes
 * that keep track of adjacent edges. Space used will be O(n+m).
 * 12/3/2018
 */
import java.util.*;

//Adjacency class creates an Adjacency list
public class Adjacency 
{
	//integer used for Vertex
    int V;
    
    //linked list used to start vertices and edges
    LinkedList list[];

    	//constructor for vertexs
    public Adjacency(int vertex)
    {
    	
        this.V = vertex;
        
        list = new LinkedList[vertex];
        
        //fills linked list with vertexes
        for (int i = 0; i < vertex ; i++) 
        {
            list[i] = new LinkedList();
        }
    }
    
    //adds an edge to the vertexs
    public void addEdge(int vertex, int edge)
    {
        //adds edge to the adjacency list
        list[vertex].addFirst(edge);
    }

    //prints the adjacency list
    public void print()
    {
        for (int i = 0; i < V ; i++) 
        {
            if(list[i].size() > 0) 
            {
                System.out.print(i + " -> ");
                
                for (int j = 0; j < list[i].size(); j++) 
                {
                    System.out.print(list[i].get(j) + " ");
                }
                
                System.out.println();
            }
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("Adjacency List representation");
        System.out.println("-----------------------------\n");
        
        Adjacency list = new Adjacency(1000);
        
        list.addEdge(10, 1); //vertex 10, edge 1
        list.addEdge(10, 4); //vertex 10, edge 4
        list.addEdge(12, 2); //vertex 12, edge 2
        list.addEdge(12, 3); //vertex 12, edge 3
        list.addEdge(12, 4); //vertex 12, edge 4
        list.addEdge(26, 3); //vertex 26, edge 3
        list.addEdge(35, 4); //vertex 35, edge 4
        list.addEdge(52, 8); //vertex 52, edge 8
        list.addEdge(52 , 1); //vertex 52, edge 1
        list.addEdge(12, 1); //vertex 12, edge 1
        list.addEdge(88, 3); //vertex 88, edge 3
        list.addEdge(88, 2); //vertex 88, edge 2
        list.addEdge(88, 9); //vertex 88, edge 9
        list.addEdge(88, 1); //vertex 88, edge 1
        
        list.print();
    }
}
