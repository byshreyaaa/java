public class Student
{
    private static long idGen=1000;
    private String studentName;
    private long studentId;
    private int studentAge;
    private char gender;
    
    public Student(String studentName,long studentId,int studentAge,char gender)
    {
        this.studentName=studentName;
        this.studentId=studentId;
        this.studentAge=studentAge;
        this.gender=gender;
    }
    public Student(String studentName,int studentAge,char gender)
    {
        this.studentName=studentName;
        this.studentId=++idGen;
        this.studentAge=studentAge;
        this.gender=gender;
    }
    public String getstudentName()
    {
        return this.studentName;
    }
    public void setstudentName(String  studentName)
    {
        this.studentName=studentName;
    }
    public long getstudentId()
    {
        return this.studentId;
    }
    public void setstudentId(long studentId)
    {
        this.studentId=studentId;
    }
    public int getstudentAge()
    {
        return this.studentAge;
    }
    public void setstudentAge(int studentAge)
    {
        this.studentAge=studentAge;
    }
    public char getgender()
    {
        return this.gender;
    }
    public void setgender(char gender)
    {
        this.gender=gender;
    }
    public void printStudent()
    {
        System.out.println("Name: "+this.studentName);
        System.out.println("Id: "+this.studentId);
        System.out.println("Age: "+this.studentAge);
        System.out.println("Gender: "+this.gender);  
    }
    public String toString()
    {
        String ret=" ";
        ret="name:"+this.studentName;
        ret=ret+"\nId:"+this.studentId;
        return ret;
    }
}
