
package day7;


public class Student {
    String id,name;
    int score;
    public Student(String i,String n, int s){
        id = i ;
        name= n;
        score =s;
        
    }
    void printInfo(){
        System.out.println("id = "+id);
        System.out.println("name = "+name);
        System.out.println("score = "+score);
    }
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        stu[0] = new Student("001","Bounkhong",76);
        stu[1] = new Student("002","Souphaphone",89);
        stu[2] = new Student("003","Searthor",100);
        
        
        for (int i =0; i<stu.length;i++){
           
            stu[i].printInfo();
            System.out.println("++++++++++");
        }
        
    }
}
