public class Dragon{
private String color;
private boolean fireBreath;
private int health;
private double length;

public Dragon( ){
   color="Green";
   fireBreath=true;
   health=100;
   length=50;
}
public Dragon (String c,boolean fb,int h,double l){
   color=c;
   fireBreath=fb;
   health=h;
   length=l;
}
public Dragon(String c){
   color=c;
}
public void setColor(String c){
   color=c;
}
public void addHealth(int h){
   health+=h;
}
public void addLength(double l){
   length+=l;
}
public String toString(){
   return "Color: "+color+" FireBreath: "+fireBreath+" Health: "+health+" Length: "+length;
   }
}