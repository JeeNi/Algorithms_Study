from singlyLinkedList import SinglyLinkedList

class Stack:
    singlyLinkedList = None
    
    def __init__(self):
        self.singlyLinkedList = SinglyLinkedList()
    
    def push(self, value):
        self.singlyLinkedList.insertIndex(1, value)
    def pop(self):
        self.singlyLinkedList.deleteIndex(1)

# # stack push test
# testStack = Stack()
# testStack.push(1)
# testStack.push(2)
# testStack.push(3)
# testStack.singlyLinkedList.printList()

# stack pop test
testStack = Stack()
testStack.push(1)
testStack.push(2)
testStack.push(3)
testStack.push(4)
for i in range(4):
    testStack.pop()
    testStack.singlyLinkedList.printList()
    print()
