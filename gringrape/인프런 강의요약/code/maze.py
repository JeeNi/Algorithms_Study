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

# # 2. find path -> fail -> success
# maze = Maze(testMazeData)
# maze.findPath(0, 0)
# for row in maze.mazeData:
#     print(row)

# # 3. i in range(-1, 2, 2) -> success
# for i in range(-1, 2, 2):
#     print(i)

# test case 2의 오류 원인 분석
# - 주된 원인: 이미 방문한 셀을 표시해주는 기능이 동작하지 않아서, 이미 방문한 셀을 다시 호출하는 무한 loop 에 빠졌다.
#   - 이미 방문한 셀을 표시해주는 기능이 작동하지 않은 이유
#       - curr = self.mazeData[x][y]
#       - curr의 값을 바꾸었을때 mazeData[x][y] 의 값이 바뀌지는 않았다.  
#       - 복사되는 것이 reference가 아닌 value 이기 때문에 그렇다. 
#   - 해결책: reference 변수에 복사해야 한다. 