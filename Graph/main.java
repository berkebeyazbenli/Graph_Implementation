import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
//----------------------------------------------------- 
// Title: main class
// Author: Berke Beyazbenli
// ID: 10022751132
// Section: 1
// Assignment: 1
// Description: This class tests the main
//-----------------------------------------------------
public class main {
//-------------------------------------------------------- 
// Summary: Retrieving data from user and visiting museums and printing process
// 
// Precondition: values are M, N, X AND Y. These are for cretaing graph
// 
// Postcondition:  we are seeing possible new edges 
//--------------------------------------------------------
    
public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int stations = scanner.nextInt();
    int railways = scanner.nextInt();
    int home = scanner.nextInt();
    int tedu = scanner.nextInt();

    Graph graph = new Graph(stations);

    for (int i = 0; i < railways ; i++) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        graph.addEdge(A-1, B-1);
    }

    List<List<Integer>> x = graph.addNewRailway(graph, home-1, tedu-1);

    if(x.isEmpty()){
        System.out.println(-1);
    }else{
        System.out.println(x.size());
        for(List<Integer> edges: x){
            for(int vertices : edges){
                System.out.print((vertices+1)+" " );
            }
            System.out.println();
        }
    }
}
}


