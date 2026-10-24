def box(n):
    for rows in range(n):
        print("*"*n)

def rightAngledTriangle(n):
    for rows in range(1, n+1):
        print("*"*rows)


def invertedRightAngledTriangle(n):
    for row in range(1, n+1):
        colCountPerRow = n - row + 1
        print("*"*colCountPerRow)
        pass

def numericRightAngledTriangle(n):
    for row in range(1, n+1):
        for num in range(1, row+1):
            print(num, end = " ")
        print()

def rightAndInvertedTriangle(n):
    for rows in range (1, 2*n):
        numberOfColumnsPerRow = rows if rows <= n else 2 * n - rows
        print("* "*numberOfColumnsPerRow) 

def spacedRightTriangle(n):
    for rows in range (1, n+1):
        spaceCount = n - rows
        print(" "*spaceCount+"*"*rows)

def invertSpacedRightTriangle(n):
    for rows in range (1, n+1):
        spaceCount = rows - 1
        starCount = n - rows + 1
        print(" "*spaceCount+"*"*starCount)

invertSpacedRightTriangle(5)