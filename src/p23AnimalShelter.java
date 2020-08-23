import java.util.LinkedList;
public class p23AnimalShelter {
	
	
	public int order = 0;
	LinkedList<p23Dog> dogs = new LinkedList<p23Dog>();
	LinkedList<p23Cat> cats = new LinkedList<p23Cat>();
	
	public void enqueue(p23Animal a) {
		a.setOrder(order);
		order++;
		if(a instanceof p23Dog) dogs.addLast((p23Dog) a);
		else if(a instanceof p23Cat) cats.addLast((p23Cat) a);
	}
	
	public p23Dog dequeueDogs() {return dogs.poll();}
	
	public p23Cat dequeueCats() {return cats.poll();}
	
	public p23Animal dequeueAny() {
		if(dogs.size() == 0) return dequeueCats();
		else if(cats.size() == 0) return dequeueDogs();
		p23Dog dog = dogs.peek();
		p23Cat cat = cats.peek();
		if(dog.isOlderThan(cat)) return dequeueDogs();
		else return dequeueCats();
	}
	
	public static void main(String[] args) {
		p23AnimalShelter shelter = new p23AnimalShelter();
		shelter.enqueue(new p23Dog("Lyla"));
		shelter.enqueue(new p23Cat("Lola"));
		System.out.println(shelter.dequeueAny().name);
		System.out.println(shelter.dequeueAny().name);
		shelter.enqueue(new p23Dog("Lyla"));
		shelter.enqueue(new p23Cat("Lola"));
		shelter.enqueue(new p23Dog("Julia"));
		shelter.enqueue(new p23Cat("Gabi"));
		System.out.println(shelter.dequeueCats().name);
		System.out.println(shelter.dequeueDogs().name);
		System.out.println(shelter.dequeueCats().name);
		System.out.println(shelter.dequeueDogs().name);
	}
	
}
