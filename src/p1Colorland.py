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
   
        
def getNumArray(board):
    newBoard = []
    for color in range(0,len(board)):
        newBoard.append(getColor(board[color]))
    return newBoard


def emptyBoard(boardLen):
    zeroBoard = []
    for i in range(0, boardLen + 1):    
        zeroBoard.append(0)
    return zeroBoard

        
        

def Colorland(numSquares, board):
    boardArray = getNumArray(board)
    finalBoard = emptyBoard(len(board))
    b = [0, 0]
    o = [0, 0]
    p = [0, 0]
    g = [0, 0]
    r = [0, 0]
    y = [0, 0]
    
    if(numSquares < 0 or numSquares > len(board)):
        raise Exception("Invalid number.")

    
    for element in range(0, len(board)):
        color = boardArray[element]
        if(color == 0):
            b[0] = element
            b[1] = b[1] + 1
            if(element == len(board) - 1):
                return b[1]
        elif(color == 1):
            o[0] = element
            o[1] = o[1] + 1
            if(element == len(board) - 1):
                return o[1]
        elif(color == 2):
            p[0] = element
            p[1] = p[1] + 1
            if(element == len(board) - 1):
                return p[1]
        elif(color == 3):
            g[0] = element
            g[1] = g[1] + 1
            if(element == len(board) - 1):
                return g[1]
        elif (color == 4):
            r[0] = element
            r[1] = r[1] + 1
            if(element == len(board) - 1):
                return r[1]
        elif(color == 5):
            y[0] = element
            y[1] = y[1] + 1
            if(element == len(board) - 1):
                return y[1]
        else: 
            raise Exception("Must be a valid color")
    
    
    

if __name__ == "__main__":
    board = ["Blue", "Orange", "Pink", "Green", "Red", "Yellow", "Yellow", "Yellow", "Yellow"]
    print(Colorland(len(board), board))