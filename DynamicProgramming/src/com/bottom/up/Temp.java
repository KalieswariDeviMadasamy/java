package com.bottom.up;

import java.util.*;

public class Temp {
	
	 public static int modifiedBFS(Graph g, int src, int k)
		{
			Queue<Node> q = new ArrayDeque<>();

			Set<Integer> vertices = new HashSet<>();
			vertices.add(0);
			q.add(new Node(src, 0, vertices));

			int maxCost = Integer.MIN_VALUE;

			while (!q.isEmpty())
			{
				Node node = q.poll();

				int v = node.vertex;
				int cost = node.weight;
				vertices = new HashSet<>(node.s);

				if (cost > k) {
					maxCost = Math.max(maxCost, cost);
				}

				for (Edge edge : g.adj.get(v))
				{
					if (!vertices.contains(edge.dest))
					{
						Set<Integer> s = new HashSet<>(vertices);
						s.add(edge.dest);

						q.add(new Node(edge.dest, cost + edge.cost, s));
					}
				}
			}

			return maxCost;
		}

	    public static void main(String args[] ) throws Exception {

	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the number of test cases");
	        int t = sc.nextInt();
	        for(int i = 1; i<=t; i++) {
	        	System.out.println("Enter the values of n and p");
	            int n = sc.nextInt();
	            int p = sc.nextInt();
	            List<Edge> edges = new ArrayList<>();
	            for(int j = 1; j <= p ; j++) {
	            	System.out.println("Enter the values of p array");
	                int src = sc.nextInt();
	                int dest = sc.nextInt();
	                int cost = sc.nextInt();
	                edges.add(new Edge(src, dest, cost));
	            }
	            Graph g = new Graph(edges, n);
	            System.out.println(modifiedBFS(g, 1, 0));
	        }

	   }
	}
	class Edge {
	    public final int src;
	    public final int dest;
	    public final int cost;
	    Edge(int src, int dest, int cost) {
	        this.src = src;
	        this.dest = dest;
	        this.cost = cost;
	    }
	}

	class Graph {
	    List<List<Edge>> adj = new ArrayList<>();

	    Graph(List<Edge> edges, int n) {
	        for(int i=0; i<=n; i++) {
	            adj.add(i, new ArrayList<>());
	        }
	        for(Edge e : edges) {
	            adj.get(e.src).add(new Edge(e.src, e.dest, e.cost));
	            adj.get(e.dest).add(new Edge(e.dest, e.src, e.cost));
	        }
	    }
	}

	class Node
	{
		int vertex, weight;
		Set<Integer> s;

		Node(int vertex, int weight, Set<Integer> s) {
			this.vertex = vertex;
			this.weight = weight;
			this.s = s;
		}
	}
