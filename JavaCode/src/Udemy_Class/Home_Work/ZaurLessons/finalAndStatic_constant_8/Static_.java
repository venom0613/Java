package Udemy_Class.Home_Work.ZaurLessons.finalAndStatic_constant_8;

public class Static_ {
    String name;
    int course;
    static int count;

    public Static_(String name , int course){

        count++;
        this.name = name;
        this.course = course;
        System.out.println("Id:" + count + "  Name:"+this.name + "  Course:" + this.course );
    }
    public static void showCount(){
        count++;
        Static_ st6 = new Static_("Petr",12);
        st6.course++;
    }

    public void showInfo() {
        System.out.println("Welcome to void");
    }

    public static void show(){
        Static_ st4 = new Static_("sa",12);
        //showoinfo; // non-static
        st4.showInfo();
        showCount(); // static

    }

}

    class StaticMain{
        public static void main(String[] args) {


            Static_ st = new Static_("Azim", 4);
            Static_ st1 = new Static_("Jon", 2);
            Static_ st2 = new Static_("Bone", 3);
            Static_ st3 = new Static_("Land", 4);

        }
    }
