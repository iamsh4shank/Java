import java.util.*; 
  
class Graph 
{ 
	ArrayList<ArrayList<Integer> > adj;
	int[] arr;
    int[] dep;
	boolean[] visited;
	int v;
	int time;
	Graph(int V)
    	{
		v=V;
		adj = new ArrayList<ArrayList<Integer> >(v);
            	for (int i = 0; i < v; i++)
            		adj.add(new ArrayList<Integer>());
		arr=new int[v];
		dep=new int[v];
		visited=new boolean[v];
		time=1;

    	}
    	void addEdge(int u, int x) 
    	{	 
        	adj.get(u).add(x); 
		adj.get(x).add(u);
    	} 
	void DFS(int k)
        {
                arr[k]=time++;
                Iterator<Integer> i = adj.get(k).listIterator();
                while (i.hasNext())
                {
                        int n = i.next();
                        if (!visited[n])
			{
				visited[n]=true;
				DFS(n);
			}
                }
                dep[k]=time++;
        }
	String check_time(String[] s)
	{
            	int type = Integer.parseInt(s[0]);
            	int x = Integer.parseInt(s[1]);
     		int y = Integer.parseInt(s[2]);
		if(type == 0)
		{
			if(arr[y]>arr[x] && dep[y]<dep[x])  
				return "YES";
			else 
				return "NO";
		}
		else
		{
			if(arr[y]<arr[x] && dep[y]>dep[x])
				return "YES";
			else 
				return "NO";
		}
	}
}
class Driver
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		//Not using nextInt() as it dosent takes \n and causes error in nextLine()
		String[] s,soln;
		int u,v;
		Graph g=new Graph(n+1);
		for(int i=0;i<n-1;i++)
		{
			s=in.nextLine().split(" ");
			u=Integer.parseInt(s[0]);
			v=Integer.parseInt(s[1]);
			g.addEdge(u,v);
		}
		g.DFS(1);
		n=Integer.parseInt(in.nextLine());
		int k=0;
		int t;
		soln=new String[n];
		while(k<n)
		{
			s=in.nextLine().split(" ");
			soln[k]=g.check_time(s);
			k++;
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(soln[j]);
		}
	}
}
