package ross.goncharuk;


import com.sun.xml.internal.ws.api.server.BoundEndpoint;

public class Main {
    static public void main(String[] args) {

        int lim = 15;
        int sum = 0;
        int avg = 0;

        for (int a = 1; a <= lim; a++) {
            sum += a;
            avg = sum / lim;
        }
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);
    }
}
