# -*- coding: utf-8 -*-
"""
Created on Sat Dec 12 13:35:06 2020

@author: cchu3
"""

def caveExploration(N, rockHeights):
        return 0

if __name__ == "__main__":
    #test 1
    N1 = 2
    rockHeights1 = [['0', '3'], ['2', '4']]
    if caveExploration(N1, rockHeights1) == 4:
        print("Case 1 Correct.")
    else:
        print("Case 1 Wrong. Result: " + str(caveExploration(N1, rockHeights1)) + " Expected: " + "4")
    
    #test 2
    N2 = 5
    rockHeights2 = [['0', '2', '3', '10', '4'], 
                    ['10', '23', '2', '21', '12'],
                    ['11', '10', '12', '12', '16'],
                    ['12', '12', '18', '10', '10'],
                    ['10', '10', '10', '11', '10']]
    
    if caveExploration(N2, rockHeights2) == 12:
        print("Case 2 Correct.")
    else:
        print("Case 2 Wrong. Result: " + str(caveExploration(N2, rockHeights2)) + " Expected: " + "12")
   