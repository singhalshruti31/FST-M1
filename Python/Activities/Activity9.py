n1 = [10, 12, 13, 75, 91, 56]
n2 = [11, 24, 71, 98, 78, 10]
n3 = []
print("First :: "+str(n1))
print("Second :: "+str(n2))
for i in n1:
    if i%2!=0 :
        n3.append(i)
for j in n2:
    if j%2==0 :
        n3.append(j)
print(n3)
