public class p48AntsOnATriangle {

    /*
	 * There are three ants on different vertices of a triangle. What is the probability of a collision (between any two or all of them) if they start walking on the sides of the triangle? Assume each any picks a direction and they walk at the same speed.

Ok, this problem seems simple...

Not really, but we'll give it a try. My thought was this diagram:



according to this, the ants can only go one direction without colliding to each other: all clockwise or all counterclockwise. That's 2 directions. There are 3 ants, each going 2 different directions (2^3 = 8). This means eventually, 2/8 chance ant's won't collide. 2/8 = 1/4. 1 - 1/4  3/4 won't collide.

Now let's generalize this. 

Each ant can go 2 different directions. 

What this mean?

 This means there is a (1/2)^n chance of an ant going clockwise and (1/2)^n chance of each ant going counterclockwise. Elaborating, there is a 2(1/2)^n chance for an ant to in the same direction or (1/2) ^ (n - 1).  Therefore, the probability of collision is 1 - (1/2)^n - 1, which is very, very high the more polygons there are, 




	 * */
}