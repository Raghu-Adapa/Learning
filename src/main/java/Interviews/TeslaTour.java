package Interviews;

/*
*  This question is asked in Service now - round 1
*
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeslaTour {
    static class Station {
        int charge;
        int nextChargingStation;

        public Station(int charge, int nextChargingStation) {
            this.charge = charge;
            this.nextChargingStation = nextChargingStation;
        }
    }

    public static void print(List<Station> stations){

        for(int i=0;i<stations.size();i++){
            System.out.println(stations.get(i).charge + ", "+ stations.get(i).nextChargingStation);
        }
    }

    public static void print1(List<Integer> stations){

        for(int i=0;i<stations.size();i++){
            System.out.print(stations.get(i)+ " ");
        }
        System.out.println("---");
    }


    public static int findStart(List<Station> stations) {
        List<Integer> diff = new ArrayList<>(stations.size()*2);
        List<Integer> finalResult = new ArrayList<>();
        for(int i=0;i<stations.size();i++){
            int d = stations.get(i).charge - stations.get(i).nextChargingStation;
            diff.add(d);
        }
        diff.addAll(diff);
        for(int i=0;i<diff.size()-stations.size();i++){

            if(diff.get(i)>=0){
                boolean result=true;
                int sum=0;
                for (int j=i;j<=stations.size();j++){

                    sum=sum+ diff.get(j);
                    if(sum<0){
                        result = false;
                        break;
                    }
                }
                if(result){
                    finalResult.add(i);
                }
            }


        }

        System.out.println("Final result : " );
        for(int i=0;i<finalResult.size();i++){

            Station s = stations.get(finalResult.get(i));

            System.out.println(finalResult.get(i)+ " = "+ s.charge + ", "+ s.nextChargingStation);
        }

        print1(finalResult);

        return 0;
    }

    public static void main(String[] args) {

        findStart(Arrays.asList(
                new Station(4,6),
                new Station(6,5),
                new Station(7,5),
                new Station(4,5)));
        findStart(Arrays.asList(
                new Station(6,4),
                new Station(3,6),
                new Station(7,3)));

        findStart(Arrays.asList(
                new Station(1,3),
                new Station(2,4),
                new Station(3,5),
                new Station(4,1),
                new Station(5,2)));


    }
}