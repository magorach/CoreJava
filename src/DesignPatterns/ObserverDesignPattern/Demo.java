package DesignPatterns.ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {


        YoutubeChannel channel = new YoutubeChannel();
        Subscriber aman = new Subscriber("Aman");
        channel.subscribe(aman);
        Subscriber parul = new Subscriber("Parul");
        channel.subscribe(parul);


        channel.notifySubscribers("Learn Design pattern");
        channel.unsubscribe(aman);
        channel.notifySubscribers("Spring-boot Course");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){

            System.out.println(" Press 1 to upload video");
            System.out.println(" Press 2 to create ne Subscriber");
            System.out.println(" Press 3 to exit");
            System.out.println("Press 4 to unsubscribe");

            int c = Integer.parseInt(br.readLine());
            if (c == 1 ){
                // video upload code
                System.out.println("Enter video title");
                String videoTitle = br.readLine();
                channel.notifySubscribers(videoTitle);

            }else if (c == 2){
                // create new subscriber code
                System.out.println("Enter subscriber name");
                String subName = br.readLine();
                Subscriber subscriber3 = new Subscriber(subName);
                channel.subscribe(subscriber3);
            }else if ( c==3){
                // exit code
                System.out.println("Thank you for using");
                break;
            }else if (c ==4){
                // unsubscribe
                System.out.println("Enter your name ");
                String unSubName = br.readLine();
                Subscriber temp = new Subscriber(unSubName); // because we store subscribers in list and to match it we need to override equals and hashcode method to compare object by values
                channel.unsubscribe(temp);
                System.out.println("Exit from unsubscribe");

            }
            else {
                System.out.println("Wrong input");
            }

        }

    }
}
