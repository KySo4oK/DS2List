import java.util.Scanner;

public class Start {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of deq");
        int n = scan.nextInt();
        System.out.println("Input number of element");
        int k = scan.nextInt();
        List[] deq = new List[n];
        for (int i = 0; i < n; i++) {
            deq[i] = new List(k);
        }
        createPoint(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i!=j&&checkPoint(i,j)&&invertEq(deq[i],deq[j])){
                    System.out.println( "Deq`s numbers : " + i + " " + j);
                    deq[i].print();
                    deq[j].print();
                } else if (i==j) {
                    if(checkPoint(i,i)&&invertEq(deq[i],deq[j])){
                        System.out.println( "Deq`s numbers : " + i + " " + i);
                        deq[i].print();
                        deq[i].print();

                    }
                }
            }
        }
    }
    public static boolean invertEq(List deq1, List deq2) {
        List deque1 = new List(deq1);
        List deque2 = new List(deq2);
        if(deque1.size()==deque2.size()){
            while(!deque1.isEmpty()&&!deque2.isEmpty()) {
                if(deque1.pop_front()!=deque2.pop_back()){
                    return false;
                }
            }
            return true;
        } else return false;
    }

    static boolean[][] point;
    public static void createPoint(int n){
        point = new boolean[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                point[i][j]= true;
            }
        }
    }
    public static boolean checkPoint(int i, int j) {
        if(point[i][j]&&point[j][i]) {
            point[i][j] = false;
            return true;
        } return false;
    }
}
