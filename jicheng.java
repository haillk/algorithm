class human //����
{	public String 	name = "zhangsan";
	public int age;
}
class student extends human//����
{
	public double score= 88.8 ;
}
class Graduate extends student 
{
	public String daoshi = "xiaosan ";
}
 class Test{
public  static void main(String[] args)
{
	Graduate aa = new Graduate();
	System.out.printf(aa.name);
}}