package com.string;

public class DirectionNSEW {

    public static float printDir(String dir) {
        int y =0;
        int x = 0;
        for(int i = 0; i < dir.length(); i++){
            if(dir.charAt(i) == 'N'){
                y += 1;
            }
            else if(dir.charAt(i) == 'S'){
                y -= 1;
            }
            else if(dir.charAt(i) == 'E'){
                x += 1;
            }
            else if(dir.charAt(i) == 'W'){
                x -= 1;
            }
        }
        int x2 =(x*x);
        int y2 =(y*y);

        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {

        String dir = "WNEENESENNN";
        System.out.println(printDir(dir));
    }
}
