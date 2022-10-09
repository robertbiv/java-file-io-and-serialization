//Robert Bennethum
import java.util.ArrayList; // to use array list instead of array
public class PriorityQueue {
    //declaring arraylist variables..
    ArrayList<String> Q = new ArrayList<String>();//for storing values
    ArrayList<String> priority = new ArrayList<String>();//for priority

    void enqueue(String s,int pr)//method to add elements to queue
    {

        int l=this.Q.size();//getting size of queue.
        int i=0,pp;
        String p = Integer.toString(pr);
        for(i=0;i<l;i++)
        {
            pp = Integer.parseInt(priority.get(i));
            if(pp>pr) {//calculating correct position to insert
// System.out.println("greater\n");
                break;
            }
        }
        Q.add(i,s);//adding to queue in sorted order of priority
        priority.add(i,p);

    }
    String dequeue()
    {
        int l=this.Q.size();
//removing highest priority element
        priority.remove(l-1);
        String s = Q.get(l-1);
        Q.remove(l-1);
        return s;//returning element..
    }

}
