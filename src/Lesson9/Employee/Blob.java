
package Lesson9.Employee;


public class Blob {
    private String name;
    private static int blobcount;
    public Blob(String x){
        name=x;
        blobcount++;
    }
    
    public String getName(){
        return name;
    }
    
    public static String identify(){ //dont need blobs to run this
        return "WE ARE BLOBS!!!";
    }
    
    public static int getBlobCount(){ //make it static so you can get it through class itself
        return blobcount;
    }
}
