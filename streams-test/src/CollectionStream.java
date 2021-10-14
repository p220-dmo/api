import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionStream {
	List<Integer> intList = new ArrayList<Integer>();
	List<String> strList = new ArrayList<String>();
	
	
	private void init() {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			intList.add(r.nextInt(100));
		}
		
		
		for (int i = 0; i < 10000000; i++) {
			strList.add("Djamel");
			strList.add("MOUCHENE");
			strList.add("Axel");
			strList.add("Djamel");
			strList.add("JAVA");
			strList.add("Spark");
			strList.add("scala");
			strList.add("Sofiane");
		}
		
		
		strList.stream().map(s -> s.toUpperCase()).filter(s -> !s.startsWith("S")).forEach(System.out::println);
		
		strList.stream().flatMap(new Function<String, Stream<? extends String>>() {

			@Override
			public Stream<? extends String> apply(String t) {
				
				return Stream.empty();
			}
		});
		
		for (String s : strList) {
			if(!s.toUpperCase().startsWith("S")) {
				System.out.println(s.toUpperCase());
			}
		}
	}
	
	
	public void stream() {
		//intList.stream().filter(elt -> elt > 10).forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		
		CollectionStream cs = new CollectionStream();
		cs.init();
		cs.stream();
	}

}
