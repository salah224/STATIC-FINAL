package staticFinal;
//http://beginnersbook.com/2014/07/final-keyword-java-final-variable-method-class/

class student{
	static final int id;
	static {
		id =253169;
	}
}
public class staticFinal {
	public static void main(String[] args) {
		System.out.println(student.id);
	}
	/**
	 * A static final variable that is not initialized
	 * during declaration can only be initialized
	 *  in static block.
	 */
}

