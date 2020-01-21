import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
  
  Scanner scan= new Scanner(System.in);
  System.out.println("Enter the Cricket Format\r\n1.ODI\r\n2.T20\r\n3.Test");
  int n= Integer.parseInt(scan.nextLine());
  if(n==1)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(scan.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(scan.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(scan.nextLine());
   Match odi= new ODI(score, currentOver, target);
   System.out.println("Requirements:");
   odi.display();
  }
  else if(n==2)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(scan.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(scan.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(scan.nextLine());
   Match t20= new T20(score, currentOver, target);
   
   System.out.println("Requirements:");
   t20.display();
  }
  else if(n==3)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(scan.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(scan.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(scan.nextLine());
   Match test= new Test(score, currentOver, target);
   System.out.println("Requirements:");
   test.display();
  }
  else
  {
   System.out.println("Invalid Format type");
  }
 }
}


==============================


abstract class Match {
	   
	 private int currentScore;
	 private float currentOver;
	 private int target;
	 
	 void display()
	 {
	  
	 }
	 abstract float calculateRunRate();
	 abstract int calculateBalls(); 
	}
================
public class T20 extends Match{
    private int currentScore;
 private float currentOver;
 private int target;
 public T20() {
  super();
 }
 
 public T20(int currentScore, float currentOver, int target) {
  super();
  this.currentScore = currentScore;
  this.currentOver = currentOver;
  this.target = target;
 }
    public int getCurrentScore() {  
  return currentScore;
 }
 public void setCurrentScore(int currentScore) {
  this.currentScore = currentScore;
 }
 public float getCurrentOver() {
  return currentOver;
 }
 public void setCurrentOver(float currentOver) {
  this.currentOver = currentOver;
 }
 public int getTarget() {
  return target;
 }
 public void setTarget(int target) {
  this.target = target;
 }
 @Override
  public float calculateRunRate() {
   float rr=(target-currentScore)/(20-currentOver);

   return (float) Math.round(rr);
  }
  @Override
  public int calculateBalls() {
   int oversCom=(int)currentOver;
   int ballsComp=(int) ((currentOver*10)-(oversCom*10));
   int balls=(((20-oversCom)*6)-ballsComp);
   return balls;
  }
 
  public void display()  {
   if(calculateBalls()>1)
    {
    if((target-currentScore)>1)
    {
      System.out.println("Need "+(target-currentScore)+" Runs in "+calculateBalls()+" balls");
      System.out.print("Require Run Rate - ");
      System.out.printf("%.2f",calculateRunRate());
    }
    else
    {
      System.out.println("Need "+(target-currentScore)+" Run in "+calculateBalls()+" balls");
      System.out.print("Require Run Rate - ");
      System.out.printf("%.2f",calculateRunRate());
      }
    }
    else
    {
     if((target-currentScore)>1)
     {
       System.out.println("Need "+(target-currentScore)+" Runs in "+calculateBalls()+" ball");
       System.out.print("Require Run Rate - ");
       System.out.printf("%.2f",calculateRunRate());
     }
     else
     {
       System.out.println("Need "+(target-currentScore)+" Run in "+calculateBalls()+" ball");
          System.out.println("Require Run Rate - 6.00");
       }
    }
  }
}
=-====================

public class Test extends Match{
    private int currentScore;
 private float currentOver;
 private int target;
 public Test() {
  super();
 }
 
 public Test(int currentScore, float currentOver, int target) {
  super();
  this.currentScore = currentScore;
  this.currentOver = currentOver;
  this.target = target;
 }
    public int getCurrentScore() {  
  return currentScore;
 }
 public void setCurrentScore(int currentScore) {
  this.currentScore = currentScore;
 }
 public float getCurrentOver() {
  return currentOver;
 }
 public void setCurrentOver(float currentOver) {
  this.currentOver = currentOver;
 }
 public int getTarget() {
  return target;
 }
 public void setTarget(int target) {
  this.target = target;
 }
 public float calculateRunRate() {
   float rr=(target-currentScore)/(90-currentOver);

   return (float)(rr+0.04);
 }
  @Override
  public int calculateBalls() {
   int oversCom=(int)currentOver;
   int ballsComp=(int) ((currentOver*10)-(oversCom*10));
   int balls=(((90-oversCom)*6)-ballsComp);
   return balls;
  }
 
  public void display()  {
   if(calculateBalls()>1)
    {
    if((target-currentScore)>1)
    {
      System.out.println("Need "+(target-currentScore)+" Runs in "+calculateBalls()+" balls");
      System.out.print("Require Run Rate - ");
      System.out.printf("%.2f",calculateRunRate());
    }
    else
    {
      System.out.println("Need "+(target-currentScore)+" Run in "+calculateBalls()+" balls");
      System.out.print("Require Run Rate - ");
      System.out.printf("%.2f",calculateRunRate());
      }
    }
    else
    {
     if((target-currentScore)>1)
     {
       System.out.println("Need "+(target-currentScore)+" Runs in "+calculateBalls()+" ball");
       System.out.print("Require Run Rate - ");
       System.out.printf("%.2f",calculateRunRate());
     }
     else
     {
       System.out.println("Need "+(target-currentScore)+" Run in "+calculateBalls()+" ball");
          System.out.println("Require Run Rate - 6.00");
       }
    }
  }
}
=====================

public class ODI extends Match{ 
    private int currentScore;          
 private float currentOver;
 private int target;
 
 public ODI(int currentScore, float currentOver, int target) {
  super();
  this.currentScore = currentScore;
  this.currentOver = currentOver;
  this.target = target;
 }
 
 public ODI() {
  super();
 }
   public int getCurrentScore() {      
  return currentScore;
 }
 public void setCurrentScore(int currentScore) {
  this.currentScore = currentScore;
 }
 
 public float getCurrentOver() {
  return currentOver;
 }
 public void setCurrentOver(float currentOver) {
  this.currentOver = currentOver;
 }
   public int getTarget() {
  return target;
 }
 public void setTarget(int target) {
  this.target = target;
 }

 @Override
  public float calculateRunRate() {      
   float rr=(target-currentScore)/(50-currentOver);
   return (float) (Math.round(rr));
  }
  @Override
  public int calculateBalls() {   
   int oversCom=(int)currentOver;  

   int ballsComp=(int) ((currentOver*10)-(oversCom*10));
   int balls=(((50-oversCom)*6)-ballsComp);
   return balls;
  }
 
  public void display()  {
   if(calculateBalls()>1)
    {
    if((target-currentScore)>1)
    {
      System.out.println("Need "+(target-currentScore)+" Runs in "+calculateBalls()+" balls");
      System.out.print("Require Run Rate - ");
      System.out.printf("%.2f",calculateRunRate());
    }
    else
    {
      System.out.println("Need "+(target-currentScore)+" Run in "+calculateBalls()+" balls");
      System.out.print("Require Run Rate - ");
      System.out.printf("%.2f",calculateRunRate());
      }
    }
    else
    {
     if((target-currentScore)>1)
     {
       System.out.println("Need "+(target-currentScore)+" Runs in "+calculateBalls()+" ball");
       System.out.print("Require Run Rate - ");
       System.out.printf("%.2f",calculateRunRate());
     }
     else
     {
       System.out.println("Need "+(target-currentScore)+" Run in "+calculateBalls()+" ball");
          System.out.println("Require Run Rate - 6.00");
       }
    }
  }
}
