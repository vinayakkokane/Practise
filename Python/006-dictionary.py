dict = {1:'Vinayak', 'N':'John', 3:'Jonas', 4:[1,2,3]}

print(dict[1])
print(dict['N'])
print(dict)
del dict[3]
print(dict)

pop_value = dict.pop(4)
print(pop_value)

dict.clear()
print(dict)