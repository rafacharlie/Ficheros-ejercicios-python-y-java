'''
Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.

@author: Rafael Infante
'''

'''
Abrimos el escritura primos.dat en modo lectura
'''
fichero=open("primos.dat","r")

'''
Imprimimos por pantalla lo que contiene el escritura
'''
print(fichero.read())

'''
cerramos el flujo
'''
fichero.close()