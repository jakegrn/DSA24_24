initialised = False

class Pseudo:
    def __init__(self):
        self.modulus = 2**32
        self.a = 1664525
        self.c = 1013904223
        self.seed = 1234567

    def next(self, limit):
        self.seed = (self.a * self.seed + self.c) % self.modulus
        return self.seed % limit

p = Pseudo()

def nextNumber():
    global initialised, p
    if (not initialised):
        number = input("Please enter your student number: ")
        p.seed = int(number)
        initialised = True
    return p.next(1000)

#####################################################################
## DO NOT CHANGE THE CODE ABOVE THIS BOUNDARY
#####################################################################

## WRITE YOUR CODE HERE

i = 0
numberSet = set()
frequentSet = set()

while len(frequentSet) < 10:
    a = nextNumber()
    if a in numberSet:
        frequentSet.add(a)
        print(frequentSet)
    numberSet.add(a)
    i += 1
print(f"\nAfter {i} calls to next number")