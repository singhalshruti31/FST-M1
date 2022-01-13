t = tuple(input("Enter the numbers separated by single space :: ").split(" "))
print(t)

for i in t:
    if int(i)%5 == 0:
        print(i)