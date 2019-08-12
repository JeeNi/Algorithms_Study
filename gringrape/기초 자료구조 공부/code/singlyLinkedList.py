from node import Node

class SinglyLinkedList:
    nodeHead = ''
    nodeTail = ''
    size = 0
    def __init__(self):
        self.nodeTail = Node(binTail = True)
        self.nodeHead = Node(binHead = True, nodeNext = self.nodeTail)
    
    def insert(self, value):
        nodeNew = Node(objValue = value)
        if self.size == 0:
            nodePrev = self.nodeHead
        else:
            current = self.nodeHead
            for i in range(self.size):
                current = current.nodeNext
            nodePrev = current
        nodePrev.nodeNext = nodeNew
        nodeNew.nodeNext = self.nodeTail
        self.size += 1     
        
    def printList(self):
        current = self.nodeHead
        current = current.nodeNext
        while current != self.nodeTail:   
            print(current.objValue, end=" - ")
            current = current.nodeNext
    
    def printIndex(self, index):
        current = self.getNode(index)
        print(current.objValue)
    
    def deleteIndex(self, index):
        # nodePrev
        nodePrev = self.getNode(index - 1)
        # nodeNext
        nodeNext = nodePrev.nodeNext.nodeNext
        # deletion
        nodePrev.nodeNext = nodeNext
        self.size -= 1
    
    def insertIndex(self, index, value):
        # nodePrev
        nodePrev = self.getNode(index - 1)
        # nodeNew
        nodeNew = Node(objValue=value)
        # nodeNext
        nodeNext = nodePrev.nodeNext
        #insertion
        nodePrev.nodeNext = nodeNew
        nodeNew.nodeNext = nodeNext
        self.size += 1
        
    def getNode(self, index):
        current = self.nodeHead
        for i in range(index):
            current = current.nodeNext
        return current
        

# # insert() test
# testList = SinglyLinkedList()
# for i in range(10):
#     testList.insert(2 * i)

# # printIndex() test
# testList = SinglyLinkedList()
# for i in range(10):
#     testList.insert(2 * i)
# for i in range(10):
#     testList.printIndex(i)

# # deleteIndex() test
# testList = SinglyLinkedList()
# for i in range(10):
#     testList.insert(2 * i)
# testList.printList()
# print()
# testList.deleteIndex(1)
# testList.printList()
# print()
# testList.deleteIndex(1)
# testList.printList()

# # insertIndex() test
# testList = SinglyLinkedList()
# for i in range(10):
#     testList.insert(2 * i)
# testList.printList()
# print()
# testList.insertIndex(1, 999)
# testList.printList()
# print()
# testList.insertIndex(1, 9999)
# testList.printList()

# SinglyLinkedList의 구현
# 1. 가장 단순한 형태의 구현
# - 구현목표  
#   - int 값을 받아서 node를 한개 삽입하는 연산 구현 - o.k
#   - list에 있는 원소를 출력하는 연산 구현 - o.k
# 2. 특정 위치의 값 연산 구현
# - 구현목표
#   - 특정위치의 값을 출력하는 연산 구현 - o.k
#   - 특정위치의 값을 삭제하는 연산 구현 - o.k
#   - 특정위치에 값을 삽입하는 연산 구현 - o.k