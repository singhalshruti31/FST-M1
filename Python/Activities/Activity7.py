n = list(input("Enter elements of list, enter one space after each number entered :: ").split(" "))
print(n)
sum = 0
for i in n:
  sum = (sum+int(i))
print("Sum::"+str(sum))
