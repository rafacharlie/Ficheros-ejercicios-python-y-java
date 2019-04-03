'''
Realiza un programa que sea capaz de ordenar alfabéticamente 
las palabras contenidas en un escritura de texto. 
El nombre del escritura que contiene las palabras se debe pasar como argumento en
la línea de comandos.
El nombre del escritura resultado debe ser el mismo que el original añadiendo la
coletilla sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa 
una línea.

@author: Rafael Infante
'''

nombreFichero = input("Introduzca el nombre del fichero: ")

lectura = open(nombreFichero+".txt","r")
escritura = open(nombreFichero+"_sort.txt", "w")

lista = []

'''
for mejorado en python
'''
for i in lectura:
    lista.append(i)

'''
ordenamos la lista
'''
lista.sort()

for i in lista:
    escritura.writelines(str(i))

lectura.close()
escritura.close()