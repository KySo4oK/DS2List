import java.util.Scanner;

public class Start {
    static boolean[][] points;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input quantity of deq");
        int n = scan.nextInt();
        System.out.println("Input quantity of element");
        int k = scan.nextInt();
        List[] deq = new List[n];
        for (int i = 0; i < n; i++) {
            deq[i] = fillList(k);
        }
        createPoint(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checkPoint(i, j) && invertEq(deq[i], deq[j])) {
                    System.out.println("Deq`s numbers : " + i + " " + j);
                    deq[i].print();
                    deq[j].print();
                }
            }
        }
    }

    public static boolean invertEq(List deq1, List deq2) {
        List deque1 = new List();
        List deque2 = new List();
        deque1 = deque1.getCopyOfList(deq1);
        deque2 = deque2.getCopyOfList(deq2);
        if (deque1.size() == deque2.size()) {
            while (!deque1.isEmpty() && !deque2.isEmpty()) {
                if (deque1.pop_front().getData() != deque2.pop_back().getData()) {
                    return false;
                }
            }
            return true;
        } else return false;
    }

    public static List fillList(int quantity) {
        List a = new List();
        for (int i = 0; i < quantity; i++) {
            a.push_back((int) (Math.random() * 10));
        }
        return a;
    }


    public static void createPoint(int n) {
        points = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                points[i][j] = true;
            }
        }
    }

    public static boolean checkPoint(int i, int j) {
        if (points[i][j] && points[j][i]) {
            points[i][j] = false;
            return true;
        }
        return false;
    }
}