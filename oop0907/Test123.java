package oop0907;

class Jun {

	public String name= "성준";
	
	private int kor=80, eng=40, mat=65;
	
	
	@Override
	public String toString() {
		return "Jun [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}



	public void  calc(int kor,int eng, int mat) {
	this.kor=kor;
	this.eng=eng;
	this.mat=mat;
		
	}
	
	
	
	public void disp(){
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
	}
	
	
}


public class Test123 {

	public static void main(String[] args) {
	
		Jun jun = new Jun();
		
		System.out.println(jun.name);
		jun.name = "동훈";
		System.out.println(jun.name);
		jun.calc(20, 30 ,50);
		jun.disp();
		System.out.println(jun.toString());
		
		
	
	}
}	
	

