
public class pedraoTeste {

	abstract public class C1 {
		abstract public Object cria();

		public void mostra() {
			System.out.println("Poscomp 2014");
		}
	}

	public class C2 extends C1 {
		static int i = 0;
		Integer j;

		public Object cria() {
			i++;
			j = new Integer(i);
			return j;
		}

		public void mostra() {
			System.out.println("j = " + j);
		}
	}

	public class C3 extends C1 {
		double d = 3.14;
		Float f;

		public Object cria() {
			d = d + 1.0;
			f = new Float(d);
			return f;
		}

		public void mostra() {
			System.out.println("f = " + f);
		}
	}

	public static void main(String[] args) {
		C1 a,b,c;
		Object o1,o2,o3;
		a = new C2();
		b = new C2();
		c = new C3();
		o1 = a.cria();
		o1 = a.cria();
		o2 = b.cria();
		o3 = c.cria();
		o3 = c.cria();
		a.mostra();
		System.out.println("----------");
		b.mostra();

	}

}
