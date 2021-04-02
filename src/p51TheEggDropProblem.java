/*
  Problem Statement: 
  There is a building of 100 floors. If an egg drops from the Nth floor or above, it will break.
  You're given 2 eggs. Find N, while minimizing the drops of eggs for each case.
  
  Explain like I'm 5 solution: 
  
  Let's first consider the worst case, with 100 floors and we drop out on the 100th floor.
  So a good solution is egg1 splitting it into 10 cases which we drop it on the 10th, 20th, 30th,
  40th, 50th, 60th, 70th, 80th, 90th, and 100th floor. The egg drops on the last floor, and a result, it cracks.
  
  One Egg left.
  
  We use egg 2 to split into ones.
  We drop it on the 91st, 92nd, 93rd, 94th, 95th, 96th, 97th, 98th, and 99th floor. 
  It doesn't crack.
  
  Thus, we figure out that we dropped the egg on the 100th floor; however, 
  this took us 10 (egg 1) + 9 (egg 2) = 19 different changes.
  
  However we took 19 different ways in order to drop this egg. Ideally, we want the number of drops to be the same 
  left and right egg. This means that for every subsequent number of steps we take for one egg we take 1 less number of 
  steps in terms of egg2. 
  
  Let's say egg1 is dropped on floor 20 and 30. If the egg cracks on floor 30, this means that egg2 has to take 9 steps.
  
  Which means egg2 should potentially takes 8 steps in the next iteration/next time that it gets dropped. 
  
  So we set up an equation and solve for number of floor drops every time. The Egg should go to X, X - 1, X - 2, X - 3, etc. 
  floors and then subsequently 
  
  X + (X - 1) + (X - 2) + (X - 3) + ... + 1 = 100 or so.
  
  (x) (x + 1) / 2 = (total number of floors). 
  
  
  
 */

public class p51TheEggDropProblem {
	
	public static void main(String[] args) {
		System.out.println("===============================Leetcode Problem 51===============================");
		int totalFloors = 100;
		for(int i = 0; i <= 100; i++) {
			int breakingFloor = i; 
			EggDrop51 drop = new EggDrop51(0);
			drop.findBreakingPoint(i, totalFloors);
		}				
	}
	
}
