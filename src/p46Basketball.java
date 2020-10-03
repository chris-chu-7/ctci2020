
public class p46Basketball {

	//Probability of Winning Game 1: P
	//Probability of Winning Game 2
	//s(k,n) is the probability of making k shots out of n. 
	//make at least 3 shots
	//Probability of making all 3 shots is p^3
	// 3 * p * p * (1 - p) probability of making 2 of the 3
	// 3 (1 - p ) p^2
	//3p^2 - 3p^3
	// add p^3
	// 3p^2 - 2p^3
	//p > 3p^2 - 2p^3
	// 1 > 3p - 2p ^2
	//2p^2 - 3p + 1 > 0
	//(2p - 1) (p - 1) > 0
	//p = 1, 0.5 doesn't matter but if 
	//if p is less than 0.5, def do option 1. else do option 2. You
	//can find numbers and apply them to find a viable solution. 
}