# -*- coding: utf-8 -*-
"""
Created on Sat Dec 12 13:35:06 2020

@author: cchu3
"""

'''
This is the main function, returning the amount of time it takes for the Goldfish to reach "home",
Or the rightmost corner of the square array. 
'''

import sys

def caveExploration(N, rockHeights):
        rocks = rockHeighttoInt(rockHeights)
        water = rockHeighttoInt(rockHeights)
        row = 0
        column = 0
        level = 0
        hours = 0
        return dfs(rocks, water, row, column, level, hours)

'''
This function converts the rock height array into an input array, so that depth-first search can be 
subsequently implemented. 
'''    
def rockHeighttoInt(rockHeights):
    for i in range(0, len(rockHeights)):
        for j in range(0, len(rockHeights[0])):
            rockHeights[i][j] = int(rockHeights[i][j])
    return rockHeights


'''
This function increments the water level by 1 every hour.
Subject to change if this abides by physics (recursion then.)
'''
def incrementWaterHeight(waterLevel):
    for i in range(0, len(waterLevel)):
        for j in range(0, len(waterLevel[0])):
            waterLevel[i][j] += 1
    return waterLevel


'''
This function performs dfs to have the goldfish traverse through this path.
The change is that the water level increases with the number of hours.
'''
def dfs(rocks, water, row, column, level, hours):
    
    min_hours = sys.maxsize 

    #base case
    if(row == len(rocks) and column == len(rocks[0])):
        return level
    
    
    #up
    if((row - 1) >= 0):
        if(rocks[row - 1][column] < rocks[row][column] or water[row - 1][column] < rocks[row][column]):
            updfs = dfs(rocks, incrementWaterHeight(water), row - 1, column, level + 1, hours + 1)
            min_hours = min(min_hours, updfs)
        
    
    #down
    if((row + 1) < len(rocks)):
        if(rocks[row + 1][column] < rocks[row][column] or water[row + 1][column] < rocks[row][column]):
            downdfs = dfs(rocks, incrementWaterHeight(water), row + 1, column, level + 1, hours + 1)
            min_hours = min(min_hours, downdfs)

    
    #left
    if((column - 1) >= 0):
        if(rocks[row][column - 1] < rocks[row][column] or water[row][column - 1] < rocks[row][column]):
            leftdfs = dfs(rocks, incrementWaterHeight(water), row, column - 1, level + 1, hours + 1)
            min_hours = min(min_hours, leftdfs)

    
    #right
    if((column + 1) < len(rocks[0])):
        if(rocks[row][column + 1] < rocks[row][column] or water[row][column + 1] < rocks[row][column]):
            rightdfs = dfs(rocks, incrementWaterHeight(water), row, column + 1, level + 1, hours + 1)
            min_hours = min(min_hours, rightdfs)
            
    #recursive case
    return min_hours


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
   