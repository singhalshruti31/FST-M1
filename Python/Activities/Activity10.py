t = tuple(input("Enter the numbers separated by single space :: ").split(" "))
print("Entered tuple is", str(t))
print("Number divisible by 5 :: ")
for i in t:
    if int(i)%5 == 0:
        print(i)