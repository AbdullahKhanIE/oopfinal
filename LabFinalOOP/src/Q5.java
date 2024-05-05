import java.util.*;

class Points implements Comparable<Points>{
    int x;
    public Points(int x){
        this.x = x;
    }

    public int compareTo(Points p){
        if(this.x < p.x) return 21;
        else if(this.x > p.x) return -9;
        return 0;
    }
}

class Try2 {
    public static void showList(ArrayList<Points> ap){
        for(int i = 0; i < ap.size(); i++){
            System.out.println(ap.get(i).x);
        }
    }
    public static void main(String[] args) {
        ArrayList<Points> ap = new ArrayList<>();

        Points p1 = new Points(1);
        ap.add(p1);

        ap.add(new Points(3));
        ap.add(new Points(2));
        ap.add(new Points(5));
        ap.add(new Points(-2));
        System.out.println("before sorting");
        showList(ap);
        Collections.sort(ap);
        System.out.println("after sorting");
        showList(ap);

    }

}