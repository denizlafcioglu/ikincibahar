package com.basic.Odev_2_2617;

public class WrapperCreator {
	private static String string="Ben deniz deðilim";
	private Integer try1_I;
	private Double try1_D;
	private Long try1_L;
	private Short try1_S;
	private Boolean try1_B;
	private Character try1_c;
	private Byte try1_BY;
	private Float try1_F;
	
public WrapperCreator() {
	this.string="Ben denizim";
}




	public WrapperCreator(String string) {
	if(string==this.string){
		System.out.println(getTry1_D());
		System.out.println("\nPrivate double döndürdüm.");
		
	}
	
	else {
		System.out.println(getTry1_B());
		System.out.println("Ben deniz deðilmiþim");
	}
}




	public Integer getTry1_I() {
		System.out.println("\nPublic int döndürdüm.");
		return try1_I;
	}
	private Double getTry1_D() {
		return try1_D;
	}
	private Long getTry1_L() {
		return try1_L;
	}
	private Short getTry1_S() {
		return try1_S;
	}
	private Boolean getTry1_B() {
		return try1_B;
	}
	private Character getTry1_c() {
		return try1_c;
	}
	private Byte getTry1_BY() {
		return try1_BY;
	}
	private Float getTry1_F() {
		return try1_F;
	}
	
	
	

}
