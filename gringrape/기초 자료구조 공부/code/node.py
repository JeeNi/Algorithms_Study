class Node:
    nodeNext = None
    objValue = ''
    binHead = False
    binTail = False
    def __init__(self, objValue = '', nodeNext = None, binHead = False, binTail = False):
        self.nodeNext = nodeNext
        self.objValue = objValue
        self.binHead = binHead
        self.binTail = binTail
    def getValue(self):
        return self.objValue
    def setValue(self, objValue):
        self.objValue = objValue
    def getNext(self):
        return self.nodeNext
    def isHead(self):
        return self.binHead
    def isTail(self):
        return self.binTail 
