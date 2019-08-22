# boolean findPath(x,y)
# 	if (x,y) is not on the pathway or visited
# 		return false;
# 	else if (x,y) is the exit
# 		return true;
# 	else
# 		mark (x,y) as visited - Green
# 		for each neighboring cell (x',y') of (x,y)
# 			if findPath(x,y) is true
# 				return true;
#       change status of marking - Green -> Red
#      	return false;

# input data
N = 8
testMazeData = [
    [0, 0, 0, 0, 0, 0, 0, 1],
    [0, 1, 1, 0, 1, 1, 0, 1],
    [0, 0, 0, 1, 0, 0, 0, 1],
    [0, 1, 0, 0, 1, 1, 0, 0],
    [0, 1, 1, 1, 0, 0, 1, 1],
    [0, 1, 0, 0, 0, 1, 0, 1],
    [0, 0, 0, 1, 0, 0, 0, 1],
    [0, 1, 1, 1, 0, 1, 0, 0]
]

class Maze:
    mazeData = []
    N = 8
    START = [0, 0]
    EXIT = [N - 1, N - 1]
    
    # category of cells
    PATH = 0
    WALL = 1
    GREEN = 2
    RED = 3
    
    def __init__(self, mazeData):
        self.mazeData = mazeData
    def findPath(self, x, y):
        # Out of range 
        if x < 0 or x >= self.N or y < 0 or y >= self.N:
            return False
        
        # Not on the Path or Visited
        elif self.mazeData[x][y] == self.WALL or self.mazeData[x][y] == self.GREEN or self.mazeData[x][y] == self.RED:
            return False
        
        # BASE CASE - EXIT
        elif self.EXIT == [x, y]:
            return True
        
        # RECURSIVE CASE
        else:
            self.mazeData[x][y] = self.GREEN
            if self.findPath(x, y - 1) or self.findPath(x, y + 1) or self.findPath(x - 1, y) or self.findPath(x + 1, y):
                return True
            self.mazeData[x][y] = self.RED
            return False

## Tests

# # 1. Maze setting maze data test -> o.k
# maze = Maze(testMazeData)
# for row in maze.mazeData:
#     print(row)
# print(maze.START, maze.EXIT)

# 2. find path -> fail
maze = Maze(testMazeData)
maze.findPath(0, 0)
for row in maze.mazeData:
    print(row)

# # 3. i in range(-1, 2, 2) -> success
# for i in range(-1, 2, 2):
#     print(i)

# 4. 