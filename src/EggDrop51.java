public class EggDrop51 {
		
		int totalDrops;
		
		public EggDrop51(int totalDrops) {
			totalDrops = 0;
		}
		
		
		public boolean drop(int floor, int breakingPoint) {
			//increment the number of drops for the egg
			totalDrops++; 
			//return whether the floor you are on is greater than or equal to the breaking point.
			return breakingPoint < floor;
		}
		
		public int findBreakingPoint(int floors, int breakingPoint) {
			System.out.println("Dropping an Egg  with " + floors + " floor(s) limit where total number of Floors is " + breakingPoint  + " Feet: ");
			int totaldrops = 1;
			//just simply assume this interval now, but you need to use the quadratic formula for (x)(x + 1) / 2 = breaking point.
			//Assume bp is the breaking point. 
			//0.5x2 + 0.5x - bp = 0
			//x = -0.5 + (0.25 +2bp)^(0.5)
			int interval = 14;
			int prev_floor = 0;
			int egg1 = interval;
			
			//drop egg 1, increment the number of floors by one less for each iteration.
			while(egg1 <= floors || !drop(egg1, breakingPoint)) {
				//System.out.println("Egg1 Height: " + egg1);
				interval -= 1;
				prev_floor = egg1;
				egg1 += interval;
				totalDrops++;
			}
			
			int egg2 = prev_floor + 1;
			
			//drop egg2 by increments
			while(egg2 < egg1 && egg2 <= floors && !drop(egg2, breakingPoint)) {
				//System.out.println("Egg2 Height: " + egg2);
				egg2 += 1;
				totalDrops++;
			}
			
			//seeing if the drop point is overflowed or not. 
			System.out.println("Total number of drops: " + totalDrops);
			
			return totalDrops;
			
		}
		
	}