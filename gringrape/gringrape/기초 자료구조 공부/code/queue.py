from singlyLinkedList import SinglyLinkedList

class Queue:
    singlyLinkedList = None

    def __init__(self):
        self.singlyLinkedList = SinglyLinkedList()

    def enqueue(self, value):
        self.singlyLinkedList.insertIndex(1, value)

    def dequeue(self):
        self.singlyLinkedList.deleteIndex(self.singlyLinkedList.size)
    
    def printQ(self):
        self.singlyLinkedList.printList()
        print()

# # enqueue test
# testQueue = Queue()
# testQueue.enqueue(1)
# testQueue.enqueue(2)
# testQueue.enqueue(3)
# testQueue.printQ()        

# # dequeue test
# testQueue = Queue()
# testQueue.enqueue(1)
# testQueue.enqueue(2)
# testQueue.enqueue(3)
# testQueue.printQ()
# testQueue.dequeue()
# testQueue.printQ()
# testQueue.dequeue()
# testQueue.printQ()
