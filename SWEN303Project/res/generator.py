import random

fout = file("trial.txt", "w")
fout.write("Fairness, Employment\n")
fcountries = file("countries.txt","r")
top = 140
for line in fcountries:
	t = random.randint(0,top)
	fout.write(line.split(':')[1]+":"+str(t)+":"+str(random.randint(0, t+top))+"\n")
	top += random.randint(-15,15)
	print(top)
