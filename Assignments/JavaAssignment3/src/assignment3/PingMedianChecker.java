package assignment3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class PingMedianChecker {
    public static float findMedianPingTime(String command,int pingCount)  {
        ArrayList<Float>  pingReadings=new ArrayList<>();
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String pingLine = null;
            while ((pingLine = input.readLine()) != null && pingCount-- >= 0) {
                if (pingLine.contains("time=")) {
                    int index = pingLine.indexOf("time=");
                    float pingTime=Float.parseFloat((pingLine.substring((index + 5), (pingLine.length()-3))));
                    pingReadings.add(pingTime);
                    System.out.println("ping time in ms : "+pingTime);
                }
            }
        }
        catch (Exception e){
            System.out.println("exception caught");
            e.printStackTrace();
        }
        Collections.sort(pingReadings);
        if(!pingReadings.isEmpty()){
            System.out.println("Number of ping readings received after pinging URL or IP : "+ pingReadings.size());
            if((pingReadings.size() % 2 )==1) {
                return pingReadings.get((pingReadings.size() / 2));
            }
            else{
                return (pingReadings.get(pingReadings.size()/2) + pingReadings.get(pingReadings.size()/2 - 1))/2;
            }
        }
        else{
            System.out.println("No Ping Readings are Recorded");
        }
        return (float)0.00;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter url/ipaddress to Ping : ");
        String address=sc.next();
        System.out.print("Enter ping count : ");
        int pingCount = sc.nextInt();
        System.out.print("The median on pings is : "+findMedianPingTime("ping -c "+pingCount+" "+address,pingCount));
    }
}
