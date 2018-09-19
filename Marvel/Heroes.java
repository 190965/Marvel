
/**
 * Write a description of class Heroes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heroes
{
    public static void main(String[] args){
        Hero hulk = new Hero("Hulk","Strength","Green");
        Hero thor = new Hero("Thor","Lightning","White");
        
        System.out.println(hulk.getName());
        System.out.println(hulk.getSuperpower());
        System.out.println(hulk.getColor()+ "\n");
        
        System.out.println(thor.getName());
        System.out.println(thor.getSuperpower());
        System.out.println(thor.getColor());
    
}}
