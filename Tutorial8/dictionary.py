def makeTTString():
    table = 2
    s = ""
    while table <= 12:
        mult = 1
        while mult <= 12:
            s = s + str(mult) + " times " + str(table) + " is " + str(mult * table) + "\n"
            
            mult = mult + 1
        table = table + 1
    return s

def frequencyCount(s):
    d = dict()
    for c in s:
        if c in d:
            d[c] = d[c] + 1
        else:
            d[c] = 1
    return d

def sortedByValue(d):
    l = []
    for v, k in d.items:
        l.append((v,k))
        return sorted(l,reverse=True)

s = makeTTString()

d = frequencyCount(s)
print()
print("Frequency map:")
for k, v in d.items():
    print(k, v)

print("Sorted by frequency:")
l = sortedByValue(d)

for item in l:
    print(item[1],item[0])

