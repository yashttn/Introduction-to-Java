package Java2.Ques5;

public class Using_Cloneable implements Cloneable{
    int rollno;
    String name;

    Using_Cloneable(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            Using_Cloneable s1=new Using_Cloneable(101,"Yashwant");
            Using_Cloneable s2=(Using_Cloneable)s1.clone(); //Object cloned using cloneable
            System.out.println("s1 object: "+s1.rollno+" "+s1.name);
            System.out.println("s2 object: "+s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}