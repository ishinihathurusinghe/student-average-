class Student
     {

    char mid_initial;
    int age;
    double marksMaths;
    double marksStat;
    double marksEng;
    double average;

    static double math_avg;
    static double stat_avg;
    static double eng_avg;

    Student()
    {
    }

}

class School
{
    public static void main(String[] args)
    {
        Student stu1=new Student();
        Student stu2=new Student();

        stu1.marksMaths =75;
        stu1.marksStat = 50;
        stu1.marksEng = 60;

        stu2.marksMaths =69;
        stu2.marksStat = 80;
        stu2.marksEng =50;

        stu1.average =(stu1.marksMaths + stu1.marksStat + stu1.marksStat) / 3;
        stu2.average =(stu2.marksMaths + stu2.marksStat + stu2.marksStat) / 3;

        System.out.println(stu1.average);
        System.out.println(stu2.average);


    }
}
