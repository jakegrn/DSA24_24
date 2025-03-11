
import java.util.List;

public class RandomLists {

	private static final String[] girls = new String[] { "Luna", "Aurora", "Maeve", "Olivia", "Isla", "Ava", "Charlotte",
			"Ophelia", "Eloise ", "Eleanor ", "Aurelia", "Cora", "Iris", "Amelia", "Hazel", "Isabella", "Alice", "Ivy",
			"Evelyn", "Maya", "Adelaide", "Genevieve", "Aria", "Amara", "Mia", "Freya", "Chloe", "Elodie", "Nora",
			"Violet", "Lucy", "Clara", "Anastasia", "Rose", "Ada", "Astrid", "Audrey", "Arabella", "Penelope", "Anna",
			"Esme", "Evangeline", "Lilith", "Claire", "Maisie", "Elena", "Phoebe", "Adeline", "Elizabeth", "Emma",
			"Imogen", "Clementine", "Jane", "Cordelia", "Seraphina", "Thea", "Zara", "Elsie", "Emilia", "Julia",
			"Grace", "Josephine", "Scarlett", "Beatrice", "Florence", "Quinn", "Delilah", "Eliza", "Mae", "Mabel",
			"Sophia", "Nova", "Ellie", "Sadie", "Poppy", "Elise", "Matilda", "Eliana", "Lily", "Kayla", "Stella",
			"Lyra", "Caroline", "Ella", "Eva", "Sienna", "Mila", "Lydia", "Saoirse", "Abigail", "Margaret", "Athena",
			"Willow", "Madeline", "Ayla", "Claudia", "Edith", "Amaya", "Wren", "Willa" };

	private static final String[] boys = new String[] { "Asher", "Milo", "Oliver", "Levi ", "Silas", "Atticus", "Theodore",
			"Jasper", "Leo ", "Arlo", "Liam", "Kai", "Felix", "Jack", "Oscar", "Finn", "Ethan", "Aarav", "Henry",
			"Caleb", "Jude", "Ezra", "Atlas", "Jayden", "Eli", "Hugo", "Elijah", "Wyatt", "Theo", "Benjamin", "Rowan",
			"Sebastian", "Arthur", "Julian", "Lucas", "Aaron", "Tobias", "Archer", "Declan", "Cassius", "Soren",
			"Zachary", "Miles", "Axel", "James", "Owen", "Xavier", "Charles", "Callum", "Josiah", "Bodhi", "Thomas",
			"Aryan", "Phoenix", "Archie", "Elio", "Ambrose", "Roman", "Alexander", "John", "Emmett", "Mateo", "Luke",
			"Nathaniel", "William", "Daniel", "Ezekiel", "Everett", "Gabriel", "Cyrus", "Ronan", "Enzo", "Louis",
			"Adrian", "Andrew", "Isaac", "Amias", "August", "Abiah", "Gideon", "Logan", "Zane", "Luca", "Micah",
			"Elias", "Otto", "Ryker", "Otis", "Lucian", "Ian", "Max", "Samuel", "Lucius", "Nolan", "Jacob", "Nathan",
			"Cassian", "Cole", "David", "Lachlan" };

	private static final String[] last = new String[] { "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis",
			"Garcia", "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin",
			"Jackson", "Thompson", "White", "Lopez", "Lee", "Gonzalez", "Harris", "Clark", "Lewis", "Robinson",
			"Walker", "Perez", "Hall" };

	
	public static String randomItem( String[] array) {
		return array[(int) (Math.random() * array.length)];
	}
	
	public static String randomFirst() {
		if ( Math.random() > 0.5) {
			return randomItem( boys);
		} else {
			return randomItem(girls);
		}
	}
	
	public static Student randomStudent() {
		Student student = new Student((int) ((Math.random() * 1000000) + 1000000), randomFirst(), randomItem( last));
//		if ( Math.random() > 0.2) {
//			student.setMark( (int) (Math.random() * 100));
//		}
		return student;
	}
	
	public static void generateRandomNameList( List<String> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add( randomFirst());
		}	
	}
	
	public static void generateStudentList(List<Student> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add(randomStudent());
		}	
	}

	public static interface KeyedComparator<O, K> {
		int compare(O object, K key);
	}

	public static <T, K> int keyedBinarySearch(
			final List<? extends T> l, 
			final K key,
			final KeyedComparator<? super T, K> c) {
		int low = 0;
		int high = l.size() - 1;

		while (low <= high) {
			final int mid = (low + high) >>> 1;
			final T midVal = l.get(mid);
			final int cmp = c.compare(midVal, key);

			if (cmp < 0)
				low = mid + 1;
			else if (cmp > 0)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found
	}


	
}
