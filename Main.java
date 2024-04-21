package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    //VOLUME STUFF
    static double Length;
    static double Width;
    static double Height;
    static double Volume;

    //circle
    static double circumference;
    static double radius;
    static double diameter;
    static double area;
    public static void main(String[] args) {

        System.out.println("welcome to my calculator \n1: calculator \n2:formula solving");
        Scanner sc = new Scanner(System.in);
        int UserChoice = sc.nextInt();
        switch (UserChoice){
            case 1:
                //do calculator stuff gotta figuire it out lmao
                break;

            case 2:
                formulaSelection();
                break;
            default:
                System.out.println("you are sped im shutting down this program");
                System. exit(0);
                break;
        }
    }

    public static void calculator(){
        //this gonna be hard bro idk how to do this
    }

    public static void formulaSelection(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1:rectangular prism \n2: circle area \n3: triangular prism \n4: triangle area\n5: pythagorean theorem");
        int UserChoice = sc.nextInt();
        switch (UserChoice){
            case 1:
                // rectangular prism stuff (volume and surface area)
                rectangularPrismCalc();
                break;

            case 2:
                // circle area radius and circumference stuff
                circleCalc();
                break;

            case 3:
                //triangular prism area and volume
                break;

            case 4:
                // triangle area

                break;

            case 5:
                // a^2+b^2=c^2 stuff
                break;
            default:
                System.out.println("you cant even type a number, here go to the beginning idiot");
                System. exit(0);
                break;

        }
    }

    public static void rectangularPrismCalc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1: volume\n2: surface area");
        int UserChoice = sc.nextInt();
        if (UserChoice==1){
            boolean lengthUnknown = false;
            boolean heightUnknown = false;
            boolean widthUnknown = false;
            boolean volumeUnknown = false;
            //volume stuff
            System.out.println("please type X for the unknown value");
            System.out.println("input length");
            String lengthString = sc.next();
            try {
                Length = Double.parseDouble(lengthString);
            }
            catch(Exception e){
                lengthUnknown = true;
            }

            System.out.println("input width");
            String widthString = sc.next();
            try {
                Width = Double.parseDouble(widthString);
            }
            catch(Exception e){
                widthUnknown = true;
            }

            System.out.println("input height");
            String heightString = sc.next();
            try {
                Height = Double.parseDouble(heightString);
            }
            catch(Exception e){
                heightUnknown = true;
            }

            System.out.println("input volume");
            String volumeString = sc.next();
            try {
                Volume = Double.parseDouble(volumeString);
            }
            catch(Exception e){
                volumeUnknown = true;
            }
            if (!lengthUnknown && !widthUnknown && !heightUnknown && volumeUnknown){
                Volume = Width*Height*Length;
                System.out.println(Volume);
            }
            if (lengthUnknown && !widthUnknown && !heightUnknown && !volumeUnknown){
                Length = Volume/(Width*Height);
                System.out.println(Length);
            }
            if (!lengthUnknown && widthUnknown && !heightUnknown && !volumeUnknown){
                Width = Volume/(Length*Height);
                System.out.println(Width);
            }
            if (!lengthUnknown && !widthUnknown && heightUnknown && !volumeUnknown){
                Height = Volume/(Length*Width);
                System.out.println(Height);
            }

        }else if (UserChoice==2){
            //surface area stuff
            System.out.println("input length");
            Length = sc.nextDouble();
            System.out.println("input width");
            Width = sc.nextDouble();
            System.out.println("input height");
            Height = sc.nextDouble();
            double surfaceArea = 2*(Length * Height + Length * Width + Height * Width);
            System.out.println(surfaceArea);

        }else{
            System.out.println("nuh uh try again");
            System. exit(0);
        }
    }

    public static void circleCalc(){
        Scanner sc = new Scanner(System.in);
        boolean circumferenceKnown = true;
        boolean areaKnown = true;
        boolean radiusKnown = true;
        boolean diameterKnown = true;
        System.out.println("input circumference (x if unknown)");
        String circumferenceString = sc.next();
        try {
            circumference = Double.parseDouble(circumferenceString);
        }
        catch(Exception e){
            circumferenceKnown = false;
        }
        System.out.println("input Area");
        String areaString = sc.next();
        try {
            area = Double.parseDouble(areaString);
        }
        catch(Exception e){
            areaKnown = false;
        }
        System.out.println("input diameter (radius times 2)");
        String diameterString = sc.next();
        try {
            diameter = Double.parseDouble(diameterString);
        }
        catch(Exception e){
            diameterKnown = false;
        }
        System.out.println("input radius (diameter/2)");
        String radiusString = sc.next();
        try {
            radius = Double.parseDouble(radiusString);
        }
        catch(Exception e){
            radiusKnown = false;
        }
        //if its stupid and it works it aint stupid
        diameter = radius*2;
        radius = diameter/2;
        radius = Math.sqrt(area/3.14159);
        radius = circumference/(2*3.14159);
        diameter = radius*2;
        area = 3.14159 * (radius*radius);
        radius = diameter/2;
        diameter = radius*2;
        radius = Math.sqrt(area/3.14159);
        radius = circumference/(2*3.14159);
        circumference = 2*3.14159*radius;
        radius = diameter/2;
        diameter = radius*2;
        radius = Math.sqrt(area/3.14159);
        radius = circumference/(2*3.14159);
        radius = diameter/2;
        diameter = radius*2;
        radius = Math.sqrt(area/3.14159);
        radius = circumference/(2*3.14159);
        diameter = radius*2;
        System.out.println(diameter);
        System.out.println(radius);
        System.out.println(area);
        System.out.println(circumference);
    }



}