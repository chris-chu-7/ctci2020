# -*- coding: utf-8 -*-
"""
Created on Sat Dec 12 12:35:27 2020

@author: cchu3
"""

def getColor(color):
    if(color == "Blue"):
        return 0
    elif(color == "Orange"):
        return 1
    elif(color == "Pink"):
        return 2
    elif(color == "Green"):
        return 3
    elif (color == "Red"):
        return 4
    elif(color == "Yellow"):
        return 5
    else: 
        raise Exception("Must be a valid color")
        

def Colorland(numSquares, board):
    print(board)
    

if __name__ == "__main__":
    board = ["Blue", "Orange", "Pink", "Green"]
    Colorland(len(board), board)