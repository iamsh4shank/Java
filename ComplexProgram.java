class ComplexNum {
	private float real ;
	private float img;
	ComplexNum() {
		real = 0;
		img = 0 ; 
	} 
	ComplexNum(float real , float img) {
		this.real = real;
		this.img= img;
	}

	void sum(ComplexNum c1 , ComplexNum c2) {
		ComplexNum obj = new ComplexNum();
		obj.real = c1.real + c2.real;
		obj.img = c1.img + c2.img;
		System.out.println("Complex sum "+ obj.real+"+"+obj.img+"i");
	}
	void sub(ComplexNum c1 , ComplexNum c2) {
		ComplexNum obj = new ComplexNum();
		obj.real = c1.real - c2.real;
		obj.img = c1.img - c2.img;
		System.out.println("Complex subtraction "+ obj.real+"+"+obj.img+"i");
	}
	void mul(ComplexNum c1 , ComplexNum c2) {
		ComplexNum obj = new ComplexNum();
		obj.real = (c1.real)*(c2.real);
		obj.img = (c1.img)*(c2.img);
		System.out.println("Complex multiplication is "+ obj.real+"+"+obj.img+"i");
	}
	public float getReal(ComplexNum c1) {
		ComplexNum obj = new ComplexNum();
		obj.real = c1.real;
		return obj.real;
	}
	
	public float getImg(ComplexNum c1) {
		ComplexNum obj = new ComplexNum();
		obj.img = c1.img;
		return obj.img;
	}	
}
class ComplexProgram {
	public static void main( String[] args) {

		
		ComplexNum c1 = new ComplexNum(3,8);
       		ComplexNum c2 = new ComplexNum(1,2);
        	ComplexNum object = new ComplexNum();
		System.out.println("complex number is - " + temp.getReal(c1)+" "+ temp.getImg(c1)+"i");
		object.sum(c1,c2);
		object.sub(c1,c2);
		object.mul(c1,c2);
	

	}
}

