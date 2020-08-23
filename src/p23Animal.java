
public abstract class p23Animal {
	
	
		private int order;
		protected String name;
		
		public p23Animal(String n) { name = n;}
		
		public void setOrder(int ord) {order = ord;}
		
		public int getOrder() {return order;}
		
		public boolean isOlderThan(p23Animal a) {return this.order < a.getOrder();}
		
		
}
