package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	   extractedMethod(nodes, p);

      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      // other implementation
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   <T extends Graph> void extractedMethod(List<T> objs, String p) {
	      for (T obj : objs) {
	         if (obj.contains(p))
	            System.out.println(obj);
	      }
	   }
}
class Graph {
	   String name;

	   public boolean contains(String p) {
	      return name.contains(p);
	   }

	}

class Node extends Graph {
}

class Edge extends Graph {
}
