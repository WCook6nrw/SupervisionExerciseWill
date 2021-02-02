package part.two;
import java.util.Vector;
import java.util.Random;

public class MainClassBonusTask {
	public static void main(String[] args) {
		WorkWithFiles filework = new WorkWithFiles();
		Vector<Integer> vec = randvect();
		negative(vec);
		Vector<String> newvec = inttostring(vec);
		filework.writefile(newvec);
	}
	public static Vector<Integer> randvect() {
		Random rand = new Random();
		Vector<Integer> vec = new Vector<Integer>();
		for (int i = 0; i<10; i++) {
			int num = rand.nextInt(201)-100;
			vec.add(num);
		}
		return vec;
	}
	public static void negative(Vector<Integer> vec) {
		int negative = 0;
		for (Integer element:vec) {
			if (element.intValue() < 0) {
				negative++;
			}
		}
		System.out.println(negative);
	}
	public static Vector<String> inttostring(Vector<Integer> vec) {
		Vector<String> newvec = new Vector<String>();
		for(Integer element:vec) {
			String num = element.toString() + "\n";
			newvec.add(num);
		}
		return newvec;
	}

}
