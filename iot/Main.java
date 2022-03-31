package iot;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    	
    public static void main(String[] args) throws InterruptedException {
	Main main = new Main();
	List<Integer> list1 = main.inputArray(5);
	List<Integer> list2 = main.inputArray(5);

	System.out.println(main.findAbsoluteComplementTheSet(list1));
	main.findCartesianProduct(list1, list2);
        }

    
        
    public List<Integer> inputArray(int limitOfNumbersInArray) {
	List<Integer> list = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	for (int i = 1; i <= limitOfNumbersInArray && input.hasNextInt(); i++) {
	    int k = input.nextInt();
	    list.add(k);
	}
	return list;
    }

    public Set<Integer> findAbsoluteComplementTheSet(List<Integer> list) {
	Set<Integer> absoluteComplement = new LinkedHashSet<>();
	int min = list.get(0);
	int max = list.get(0);
	for (int i = 1; i < list.size(); i++) {
	    if (min > list.get(i)) {
		min = list.get(i);
	    }
	    if (max < list.get(i)) {
		max = list.get(i);
	    }
	}

	for (int j = 1; j < max - min; j++) {
	    if (!list.contains(min + j)) {
		absoluteComplement.add(min + j);
	    }
	}
	return absoluteComplement;
    }

    
    
    
    public void findCartesianProduct(List<Integer> list1, List<Integer> list2) {
	for (int i = 0; i < list1.size(); i++) {
	    for (int j = 0; j < list2.size(); j++) {
		System.out.printf("{%d,%d}", (int) list1.get(i), (int) list2.get(j));
	    }
	}
    }
}
























//package iot;
//
//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//	Main main = new Main();
//	List<Integer> list1 = main.inputArray(5);
//	List<Integer> list2 = main.inputArray(5);
//
//	System.out.println(main.findAbsoluteComplementTheSet(list1));
//	main.findCartesianProduct(list1, list2);
//    }
//
//    public List<Integer> inputArray(int limitOfNumbersInArray) {
//	List<Integer> list = new ArrayList<Integer>();
//	Scanner input = new Scanner(System.in);
//	for (int i = 1; i <= limitOfNumbersInArray && input.hasNextInt(); i++) {
//	    int k = input.nextInt();
//	    list.add(k);
//	}
//	return list;
//    }
//
//    public Set<Integer> findAbsoluteComplementTheSet(List<Integer> list) {
//	Set<Integer> absoluteComplement = new LinkedHashSet<>();
//	int min = list.get(0);
//	int max = list.get(0);
//	for (int i = 1; i < list.size(); i++) {
//	    if (min > list.get(i)) {
//		min = list.get(i);
//	    }
//	    if (max < list.get(i)) {
//		max = list.get(i);
//	    }
//	}
//
//	for (int j = 1; j < max - min; j++) {
//	    if (!list.contains(min + j)) {
//		absoluteComplement.add(min + j);
//	    }
//	}
//	return absoluteComplement;
//    }

    












//@FunctionalInterface
//interface Name {
//  public void eat();
//
//  
//}

//class Animal implements Name{
//
//  @Override
//  public void eat() {
//	System.out.println("meow");
//	
//  }
//  
//}
//
//abstract class Neww{
//   final public void print() {
//	System.out.println("hello"); 
//   };
//}

//public void inteface_method(Name name) {
//	name.eat();
//}
//
//@Deprecated
//public void ssssssss(){
//	System.out.println("aaaaaaaaaaaaaaaa");
//}
//	Man man1 = new Man(0, "Oleg");
//	Man man2 = new Man(5, "Zim");
//	Man man3 = new Man(2, "Klark");
//	Man man4 = new Man(-3, "Don");
//
//	ArrayList<Man> list = new ArrayList<>();
//	list.add(man1);
//	list.add(man2);
//	list.add(man3);
//	list.add(man4);
//	
//	Animal animal = new Animal();
//	Main main = new Main();
//	main.ssssssss();
//    }
//}

//	main.inteface_method(animal);

//	Main main = new Main();
//	main.over(list, 5);
//	main.under(list, 5);

//	name name2 = (arr) -> arr.forEach((i) -> System.out.println(i));
//	name2.eat(list);
//    }
//    
//    public void over(ArrayList<Man> man, int grade) {
//	for(Man m: man ) {
//	    if (m.getAge() >= grade) {
//		System.out.println(m);
//	    }
//	}
//	System.out.println();
//    }
//    
//    public void under(ArrayList<Man> man, int grade) {
//	for(Man m: man ) {
//	    if (m.getAge() < grade) {
//		System.out.println(m);
//	    }
//	}
//	System.out.println();
//    }
//}

//class Man{
//    private int age;
//    private String nameString;
//    
//    
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    
//    
//    public String getNameString() {
//        return nameString;
//    }
//
//    public void setNameString(String nameString) {
//        this.nameString = nameString;
//    }
//
//    public Man(int age, String nameString) {
//	this.age = age;
//	this.nameString = nameString;
//    }
//
//    @Override
//    public int hashCode() {
//	return age*1000 + nameString.length();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//	if (this == obj)
//	    return true;
//	if (obj == null) {
//	    System.out.println(1);
//	    return false;
//	}
//	if (getClass() != obj.getClass()) {
//	    System.out.println(2);
//	    return false;
//	}
//	Man other = (Man) obj;
//	return age == other.age && Objects.equals(nameString, other.nameString);
//    }
//
//    @Override
//    public String toString() {
//	return "Man [age=" + age + ", nameString=" + nameString + "]";
//    }
//    
//    
//    
//    
//}
//Map<Integer,String> map = new HashMap<Integer, String>();
//map.put(8, "fj");
//map.put(9, "fj");
//map.putIfAbsent(8, "ffff");
//System.out.println(map.get(8));
//System.out.println(map);

//Man man = new Man();
//Man man2 = new Man();
//Man man3 = man;
//System.out.println(man.equals(man2));
//System.out.println(man.equals(man3));

//String string1 = "cba";
//String string2 = "cba";
//
//System.out.println(string1.equals(string2));
//System.out.println(string1.hashCode() + " " + string2.hashCode());

//Set<String> set = new HashSet<>();
//set.add("fjsa");
//set.add("fffff");
//set.add("ffffffff");
//
////System.out.println(set);
//
//Set treeIntegers = new TreeSet();
////treeIntegers.add(null);
//System.out.println(treeIntegers);
//
//Integer a = 5;
//Integer b = 8;
//System.out.println(a.compareTo(b));

//Set<Integer> lhSet = new LinkedHashSet<>();
//Set<Integer> set2 = new HashMap()<>();
//
//lhSet.add(4);
//lhSet.add(1);
//lhSet.add(9);
//
//set2.add(4);
//set2.add(1);
//set2.add(9);
//
//System.out.println(lhSet);
//System.out.println(set2);

//List<Integer> list1 = new LinkedList<>();
//list1.add(3);
//list1.add(1);
//list1.add(2);
//
//Queue<Integer> list2 = new LinkedList<>();
//list2.add(3);
//list2.add(1);
//list2.add(2);
//
//list1.remove(0);
////list2.remove();
//System.out.println(list1);
//
//
//for(int i =0; i< 9; i++) {
//    list2.poll();
//}
//System.out.println(list2);
//
//
//Map<Man, Double> map = new HashMap<>();
//Man man = new Man(1, "a");
//Man man2 = new Man(2, "A");
//Man man3 = new Man(3, "b");
//Man man4 = new Man(3, "b");
//
//map.put(man, 10.1);
//map.put(man2, 11.2);
//map.put(man3, 12.3);
////System.out.println(map);
//
////System.out.println(map.containsKey(man4));
////System.out.println(man.hashCode());
////System.out.println(man2.hashCode());
////System.out.println(man3.hashCode());
//
//var age = 5;

// Stack<Integer> stack = new Stack<>();
//	stack.push(8);
//	stack.push(3);
//	
//	stack.pop();
//	System.out.println(stack.peek());

// List<People> array = new ArrayList<>();
//	People people1 = new People(15, "oLeg");
//	People people2 = new People(-4, "aLeg");
//	People people3 = new People(15, "CLeg");
//	People people4 = new People(15, "bLeg");
//	
//	array.add(people1);
//	array.add(people2);
//	array.add(people3);
//	array.add(people4);
//	
//	Collections.sort(array);
//	System.out.println(array);

//class People implements Comparable<People>{
//    private int id;
//    private String name;
//    
//    People(int id,String name){
//	this.id = id;
//	this.name = name;
//    }
//    
//    @Override
//    public int compareTo(People o) {
//        int difference = this.id - o.id;
//        if (difference == 0) {
//            difference = this.name.compareTo(o.name);
//        }
//        return difference; 
//    }
//    @Override
//    public String toString() {
//        // TODO Auto-generated method stub
//        return id + " " + name;
//    }
//   
//}

//	Vector vector = new Vector<>();
//	vector.add("jdkf");
//	vector.add("fj");
//	vector.add("fhfhhf");
//	vector.add(8);

//	ArrayList<Integer> arrayList = new ArrayList<>();
//	arrayList.add(5);
//	arrayList.add(0);
//	arrayList.add(-4);
//	arrayList.add(99);
//	arrayList.add(12);
//	arrayList.add(-27);
//	arrayList.add(-2);
//	arrayList.add(10);
//	arrayList.add(3);
//	arrayList.add(-10);
//	
//	System.out.println(arrayList);
//	Collections.sort(arrayList);
//	
//	
//	ArrayList<String> strings = new ArrayList<>();
//	
//	strings.add("hello");
//	strings.add("aaaa");
//	strings.add("Ccc");
//	strings.add("bbbbbbbb");
//	
//	Collections.addAll(strings, "uuuuu","iiiii","oooooo");
//	System.out.println(strings);
//	
//	Collections.sort(strings);
//	System.out.println(strings);

//	System.out.println(arrayList);
//	
//	int index = Collections.binarySearch(arrayList,99 );
//	System.out.println(index);

//	int num = Collections.l
//	
//	ArrayList<String> arrayList = new ArrayList<>();

//	arrayList.add("f1");
//	arrayList.add("f2");
//	arrayList.add("f3");
//	
//	
//	LinkedList<Integer> linkedList = new LinkedList<>();
//	
//	linkedList.add(1);
//	linkedList.add(2);
//	linkedList.add(3);
//	
//	linkedList.add(1,4);
//	
//	for (Integer integer : linkedList) {
//	    System.out.println(integer);
//	}

//	Hashtable<String,Integer> dictHashtable = new Hashtable<>();
//	dictHashtable.put("Oleg", 7);
//	System.out.println(dictHashtable);
//	
//	Hashtable dict2 = new Hashtable();
//	dict2.put("jdk", new Integer(9));
//	System.out.println(dict2);

//	int[] array = {5,2,0};
//	List<Integer> array2 = new ArrayList<>();
//	array2.add(5);
//	
//	System.out.println(vector);
//	System.out.println(array);
//	System.out.println(array2);

//	Trial<String,Integer> trial = new Trial<>();
//	trial.setName("Oleg");
//	trial.setAge(8);
//	System.out.println(trial.getName());
//	System.out.println(trial.getAge());
// List animalsList = new ArrayList<>();
// int[] arr;

////	arr = new int[];
//	for(int i = 0; i < 10; i ++) {
//	    arr[i] = i;
//	    System.out.println(arr[i]);
//	}

//	int[] name = {4,6,5,2};
//	int[] name2 = {3,2,1,0,-2};
//	
//	Collection one = new ArrayList();
//	List two = new ArrayList();
//	Set three = new HashSet<>();
//	Queue four = new PriorityQueue<>();
//	Map five = new HashMap<>();
//	
//	one.add("jf");
//	one.add(8);
//	
//	two.add("jf");
//	two.add(8);
//	System.out.println(one);
//	System.out.println(two);

//	System.out.println(Arrays.asList(name).contains(4));

//	name name = new name() {
//	    public void eat() {
//		System.out.println("eat");
//	    }
//	    public void name() {
//		System.out.println("name");
//	    }
//	};
//	name.eat();
//	name.name();
//    }
//}
//	System.out.println("will be sleeping in a few miliseconds");
//	Thread.sleep(5000);
//	System.out.println("finished sleeping");
//	
//	SecondThread second = new SecondThread();
//	second.start();
//
//	SecondThread third = new SecondThread() {
//	    public void run() {
//		for (int i = 100; i < 200; i++) {
//		    System.out.println("thread 3 " + i);
//		}
//	    }
//	};
//	third.start();
//	
//	
//	SecondThread fourth = new SecondThread() {
//	    public void run() {
//		for (int i = 200; i < 300; i++) {
//		    System.out.println("thread 4 " + i);
//		}
//	    }
//	};
//	
//	fourth.start();

//    }
//}

//class SecondThread extends Thread {
//    public void run() {
//	for (int i = 0; i < 100; i++) {
//	    System.out.println("thread 2 " + i);
//	}
//    }
//}

//	Trial trial = new Trial();
//	
//	trial.eat();
//	trial.voice();
//	
//	
//	Second second = new Second();
//	
//	second.eat();
//	second.voice();
//	second.voice(0);
//	second.neww();

//	Trial smthTrial = new Second();
//	
//	smthTrial.eat();
//	smthTrial.voice();

//	long start = System.nanoTime();
//	int[] array = new int[]{-84,9,23,0,1,-34444,22,-2,5,-2225};
//	
//	
//	if (array.length > 0) {
//	    for(int i = 0; i < array.length - 1; i++) {
//		int minNum = array[i];
//		int index = i;
//		for(int j = i + 1; j < array.length; j++) {
//		    if (minNum > array[j]) {
//			minNum = array[j];
//			index = j;
//		    }
//		}
//		int temp = array[i];
//		array[i] = minNum;
//		array[index] = temp;
////		System.out.println(Arrays.toString(array));
//		
//	    }
//	}
//	
//	
//	
//	long finish = System.nanoTime();
//	long elapsed = finish - start;
//	System.out.println("Прошло часу вставка, нс: " + elapsed);
//	
////	System.out.println(Arrays.toString(array));
//	long start2 = System.nanoTime();
//	if (array.length > 0) {
//	    for(int i = 0; i < array.length; i++) {
//		for(int j = 1; j < array.length - i; j++) {
//		    if (array[j] < array[j-1]) {
//			int temp = array[j];
//			array[j] = array[j-1];
//			array[j-1] = temp;
//		    }
//		    
//		}
//		
//	    }
//	}
//	long finish2 = System.nanoTime();
//	long elapsed2 = finish2 - start2;
//	System.out.println("Прошло часу ,бульбашка, нс: " + elapsed2);

//	if (array.length > 0) {
////	    int min = array[0];
//	 
//	    for (int i = 0; i < array.length; i++) {
//		int min = array[i];
//		int minIndex = i;
//		for(int j = i + 1; j < array.length; j++) {
//		    
//		    if (min > array[j]) {
//			min = array[j];
//			minIndex = j;
//			
//		    }
//		}
//		int temp = array[i];
//		array[i] = min;
//		array[minIndex] = temp;
//		System.out.println(Arrays.toString(array));
//		
//	    }
//	}

//	Scanner console = new Scanner(System.in);
//	
//	int k = console.nextInt();
//	console.nextLine();
//	String string = console.nextLine();
////	int k = console.nextInt();
//	
////	string = string.toUpperCase();
//	
////	String string = "NEWTOILETNFJKSTOILETJ";
//	String key = "TOILET";
//	int lengthOfComb = 0;
//	int countKeys = 0;
//	if (string.length() > 0) {
//	    for (int i = 0; i < string.length(); i++) {
//		if (string.charAt(i) == key.charAt(0)) {
//		    for (int j = 0; j < key.length(); j++) {
//			if (i + j <= string.length() - 1) {
////			    if (string.charAt(i + j) == key.charAt(j)) {
//			    if (string.charAt(i + j) == key.charAt(j)) {
//				lengthOfComb++;
////				System.out.println("i " + i);
////				System.out.println("j " + j);
////				System.out.println(string.charAt(i + j));
//
//				if (lengthOfComb == key.length()) {
//				    countKeys++;
//				}
//			    } else {
//				lengthOfComb = 0;
//			    }
//			} else {
//			    break;
//			}
//		    }
//		}
//	    }
//	}
//	
//	if (k <= countKeys && k >= 1) {
//	    System.out.println("YES");
//	}
//	else {
//	    System.out.println("NO");
//	}
//    }
//
// }
//	System.out.println(countKeys);

//	int[] array = new int[]{-84,9,23,0,1,-34444,22,-2,5,-2225};
//
//	if (array.length > 0) {
//	    for (int i = 0; i < array.length - 1; i++) {
//		for (int j = 0; j < array.length -i- 1; j++) {
//		    if (array[j] > array[j + 1]) {
//			int biggerValue = array[j];
//			array[j] = array[j + 1];
//			array[j + 1] = biggerValue;
//		    }
//		}
//		System.out.println(Arrays.toString(array));
//	    }   
//	}
//	System.out.println(Arrays.toString(array));

//	if (array.length > 0) {
//	    int min = array[0];
//	    for(int i = 1; i < array.length; i++) {
//		if (min > array[i]) {
//		    min = array[i];
//		}
//	    } 
//	    System.out.println(min);
//	}

//	System.out.println(min); 

//	Trial trial = new Trial() {
//	    public void eat() {
//		System.out.println("Hello world2!");
//	    }
//	};
//	Trial trial2 = new Trial();
//	
//	trial.eat();
//	trial2.eat();

//		Scanner console = new Scanner(System.in);
//		String name = console.nextLine();
//		
//		
//		Scanner scanner = new Scanner("Кот Васька\n 28 \nМосква");
////		Scanner scanner = new Scanner("Кот Васька 28 Москва");
////		while (scanner.hasNext()) {
////		    System.out.println(scanner.nextLine());
////		}
//		while (scanner.hasNext()) {
//			System.out.println(scanner.next());
//		}	
//		
//		while (scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
//		
//		console.close();
//		scanner.close();

//		System.out.println(name.substring(3));
//		System.out.println(name.substring(5,9));

//		Scanner console = new Scanner(System.in);
//		String name = console.nextLine();
//		int age = console.nextInt();
//		
//		Scanner console2 = new Scanner(name);
////		System.out.println(name + age);
//		while (console2.hasNext()) {
//			System.out.println(console2.next());
//		}
//		console.close();

//		Trial trial = new Trial("Oleg",(byte)9);
//		System.out.println(trial.name());
//		System.out.println(trial.age());
//		System.out.println(trial.hashCode());
//		
//		Trial trial2 = new Trial("Bob", (byte)7);
//		System.out.println(trial.equals(trial2));
//		
//		
//		Second second = new Second();
//		System.out.println(second.hashCode());

// TODO Auto-generated method stub
//		Second second = new Second();
//		second.setAge(8);
//		second.setName("");
//		second.print();
//		
//		Trial trial = new Trial();
//		trial.Print();
//	}
//
//}

//class Second{
//	private int age;
//	private String name;
//	
//	public void setName(String name) {
//		if (name.isEmpty()) {
//			System.out.println("Ви не ввели ім'я");
//		}
//		else {
//			this.name = name;
//		}
//		
//	}
//	
//	public String getname() {
//		return name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	void print() {
//		System.out.println(age + " lala " + name);
//	}
//	
//}
