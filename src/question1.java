//find the question script at CSE110 Spring-24 Questions.pdf file of this repository
import java.util.*;
public class question1 {
    public static void main(String[] args) {
            String [] planets = {"venus", "mars", "jupiter", "earth", "neptune"};
            double [] x_coordinate = {0.15, 0.12, 1.15, 0.00, 0.98};
            double [] y_coordinate = {0.55, -1.12, 0.79, 1.17, 1.11};
            double [] z_coordinate = {1.22, 0.11, 0.55, 0.45, 0.67};
            int index=0;
            double [] distance = new double [planets.length];
            Scanner sc = new Scanner(System.in);
            System.out.print("enter planet ");
            String target = sc.nextLine();
            boolean found = false;
            for (int i = 0; i < planets.length; i++) {
               String search = planets[i];
               if(search.equals(target)){
                   found=true;
                   index = i;
               }
            }
        //System.out.println(index);
            if(!found){
                System.out.println("invalid input");
            }

            if(found){
                for (int i = 0; i < planets.length ; i++) {
                    if(i!=index){
                        double d = (x_coordinate[i]-x_coordinate[index])*(x_coordinate[i]-x_coordinate[index]) + (y_coordinate[i]-y_coordinate[index])*(y_coordinate[i]-y_coordinate[index]) + (z_coordinate[i]-z_coordinate[index])*(z_coordinate[i]-z_coordinate[index]);
                        distance[i]=d;
                    }
                }
            }
        //System.out.println("array of distance: "+ Arrays.toString(distance));
            double [] distance_copy = new double[distance.length]; // had to copy the distance arrayy to a new array, because the current values of this distance array would be replaced by it's sorted values. So there would be no way to trace the original values which indexes are connected to the planets array.
        for (int i = 0; i < distance.length; i++) {
            distance_copy[i]=distance[i];
        }
        //System.out.println("array of copy-distance: "+ Arrays.toString(distance));

            //  Here comes the bubble sort:
        for (int i = 0; i < distance.length-1; i++) {
            for (int j = 0; j < distance.length-1-i; j++) {
                if(distance[j]>distance[j+1]){
                    double temp = distance[j];
                    distance[j]=distance[j+1];
                    distance[j+1]=temp;
                }
            }
        }
        //System.out.println("sorted array of distance: "+Arrays.toString(distance));
            int closest_index=0;
        for (int i = 0; i <distance_copy.length ; i++) {
            if(distance_copy[i]==distance[1]){ // distance[0] will alawyas be 0.0 , so the lowest distace is distance[1]
                closest_index = i;
            }
        }

        System.out.println("the closest planet from " + target + " is: " + planets[closest_index]);
        System.out.println("the distance between " + target + " and " + planets[closest_index] + " is: " + distance[1]);

    }
}
